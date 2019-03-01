package typings
package electronDashOsxDashSignLib.electronDashOsxDashSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSignOptions extends js.Object {
  var app: java.lang.String
  var identity: js.UndefOr[java.lang.String] = js.undefined
  var keychain: js.UndefOr[java.lang.String] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
}

object BaseSignOptions {
  @scala.inline
  def apply(
    app: java.lang.String,
    identity: java.lang.String = null,
    keychain: java.lang.String = null,
    platform: java.lang.String = null
  ): BaseSignOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (keychain != null) __obj.updateDynamic("keychain")(keychain)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[BaseSignOptions]
  }
}

