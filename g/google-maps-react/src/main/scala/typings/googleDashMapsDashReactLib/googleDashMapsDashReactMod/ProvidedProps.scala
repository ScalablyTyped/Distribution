package typings
package googleDashMapsDashReactLib.googleDashMapsDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvidedProps extends js.Object {
  var google: GoogleAPI
  var loaded: js.UndefOr[scala.Boolean] = js.undefined
}

object ProvidedProps {
  @scala.inline
  def apply(google: GoogleAPI, loaded: js.UndefOr[scala.Boolean] = js.undefined): ProvidedProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("google")(google)
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded)
    __obj.asInstanceOf[ProvidedProps]
  }
}

