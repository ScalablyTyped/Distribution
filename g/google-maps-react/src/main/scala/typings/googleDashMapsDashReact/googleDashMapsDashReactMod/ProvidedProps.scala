package typings.googleDashMapsDashReact.googleDashMapsDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvidedProps extends js.Object {
  var google: GoogleAPI
  var loaded: js.UndefOr[Boolean] = js.undefined
}

object ProvidedProps {
  @scala.inline
  def apply(google: GoogleAPI, loaded: js.UndefOr[Boolean] = js.undefined): ProvidedProps = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvidedProps]
  }
}

