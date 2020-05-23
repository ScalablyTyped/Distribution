package typings.googleMapsReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProvidedProps extends js.Object {
  var google: GoogleAPI
  var loaded: js.UndefOr[Boolean] = js.undefined
}

object IProvidedProps {
  @scala.inline
  def apply(google: GoogleAPI, loaded: js.UndefOr[Boolean] = js.undefined): IProvidedProps = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProvidedProps]
  }
}

