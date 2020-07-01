package typings.electronOsxSign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSignOptions extends js.Object {
  var app: String
  var identity: js.UndefOr[String] = js.undefined
  var keychain: js.UndefOr[String] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
}

object BaseSignOptions {
  @scala.inline
  def apply(app: String, identity: String = null, keychain: String = null, platform: String = null): BaseSignOptions = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (keychain != null) __obj.updateDynamic("keychain")(keychain.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSignOptions]
  }
}

