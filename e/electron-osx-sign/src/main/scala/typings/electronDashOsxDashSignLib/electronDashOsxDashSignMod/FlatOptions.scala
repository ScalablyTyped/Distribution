package typings
package electronDashOsxDashSignLib.electronDashOsxDashSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatOptions extends BaseSignOptions {
  var install: js.UndefOr[java.lang.String] = js.undefined
  var pkg: js.UndefOr[java.lang.String] = js.undefined
  var scripts: js.UndefOr[java.lang.String] = js.undefined
}

object FlatOptions {
  @scala.inline
  def apply(
    app: java.lang.String,
    identity: java.lang.String = null,
    install: java.lang.String = null,
    keychain: java.lang.String = null,
    pkg: java.lang.String = null,
    platform: java.lang.String = null,
    scripts: java.lang.String = null
  ): FlatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (install != null) __obj.updateDynamic("install")(install)
    if (keychain != null) __obj.updateDynamic("keychain")(keychain)
    if (pkg != null) __obj.updateDynamic("pkg")(pkg)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    __obj.asInstanceOf[FlatOptions]
  }
}

