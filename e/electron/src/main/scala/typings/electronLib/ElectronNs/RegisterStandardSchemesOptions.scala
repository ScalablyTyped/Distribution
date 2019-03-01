package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterStandardSchemesOptions extends js.Object {
  /**
    * true to register the scheme as secure. Default false.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object RegisterStandardSchemesOptions {
  @scala.inline
  def apply(secure: js.UndefOr[scala.Boolean] = js.undefined): RegisterStandardSchemesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[RegisterStandardSchemesOptions]
  }
}

