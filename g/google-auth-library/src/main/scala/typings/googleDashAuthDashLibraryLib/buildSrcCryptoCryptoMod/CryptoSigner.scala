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
    sign: (java.lang.String, java.lang.String) => java.lang.String,
    update: java.lang.String => scala.Unit
  ): CryptoSigner = {
    val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CryptoSigner]
  }
}

