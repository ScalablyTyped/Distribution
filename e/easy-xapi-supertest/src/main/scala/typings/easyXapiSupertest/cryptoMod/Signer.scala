package typings.easyXapiSupertest.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signer extends js.Object {
  def sign(private_key: String, output_format: String): String
  def update(data: js.Any): Unit
}

object Signer {
  @scala.inline
  def apply(sign: (String, String) => String, update: js.Any => Unit): Signer = {
    val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Signer]
  }
}

