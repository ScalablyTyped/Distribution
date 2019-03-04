package typings
package ethDashLightwalletLib.ethDashLightwalletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultOptions extends js.Object {
  var hdPathString: java.lang.String
  var password: java.lang.String
  var salt: js.UndefOr[java.lang.String] = js.undefined
  var seedPhrase: java.lang.String
}

object VaultOptions {
  @scala.inline
  def apply(
    hdPathString: java.lang.String,
    password: java.lang.String,
    seedPhrase: java.lang.String,
    salt: java.lang.String = null
  ): VaultOptions = {
    val __obj = js.Dynamic.literal(hdPathString = hdPathString, password = password, seedPhrase = seedPhrase)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    __obj.asInstanceOf[VaultOptions]
  }
}

