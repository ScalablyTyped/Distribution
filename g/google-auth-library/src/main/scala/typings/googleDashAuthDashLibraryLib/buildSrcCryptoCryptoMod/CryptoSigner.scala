package typings
package googleDashAuthDashLibraryLib.buildSrcCryptoCryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoSigner extends js.Object {
  def sign(key: java.lang.String, outputFormat: java.lang.String): java.lang.String
  def update(data: java.lang.String): scala.Unit
}

object CryptoSigner {
  @scala.inline
  def apply(
    sign: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    update: js.Function1[java.lang.String, scala.Unit]
  ): CryptoSigner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sign")(sign)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[CryptoSigner]
  }
}

