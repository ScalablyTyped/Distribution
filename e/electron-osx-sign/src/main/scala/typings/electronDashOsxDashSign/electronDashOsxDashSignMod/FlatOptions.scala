package typings.electronDashOsxDashSign.electronDashOsxDashSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatOptions extends BaseSignOptions {
  var install: js.UndefOr[String] = js.undefined
  var pkg: js.UndefOr[String] = js.undefined
  var scripts: js.UndefOr[String] = js.undefined
}

object FlatOptions {
  @scala.inline
  def apply(
    app: String,
    identity: String = null,
    install: String = null,
    keychain: String = null,
    pkg: String = null,
    platform: String = null,
    scripts: String = null
  ): FlatOptions = {
    val __obj = js.Dynamic.literal(app = app)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (install != null) __obj.updateDynamic("install")(install)
    if (keychain != null) __obj.updateDynamic("keychain")(keychain)
    if (pkg != null) __obj.updateDynamic("pkg")(pkg)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    __obj.asInstanceOf[FlatOptions]
  }
}

