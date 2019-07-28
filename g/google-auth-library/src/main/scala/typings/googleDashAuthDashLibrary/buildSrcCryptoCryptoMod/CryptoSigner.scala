package typings.googleDashAuthDashLibrary.buildSrcCryptoCryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoSigner extends js.Object {
  def sign(key: String, outputFormat: String): String
  def update(data: String): Unit
}

object CryptoSigner {
  @scala.inline
  def apply(sign: (String, String) => String, update: String => Unit): CryptoSigner = {
    val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[CryptoSigner]
  }
}

