package typings.ethLightwallet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultOptions extends js.Object {
  var hdPathString: String
  var password: String
  var salt: js.UndefOr[String] = js.undefined
  var seedPhrase: String
}

object VaultOptions {
  @scala.inline
  def apply(hdPathString: String, password: String, seedPhrase: String, salt: String = null): VaultOptions = {
    val __obj = js.Dynamic.literal(hdPathString = hdPathString.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], seedPhrase = seedPhrase.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultOptions]
  }
}

