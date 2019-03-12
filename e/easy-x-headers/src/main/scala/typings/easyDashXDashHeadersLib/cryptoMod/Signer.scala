package typings
package easyDashXDashHeadersLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signer extends js.Object {
  def sign(private_key: java.lang.String, output_format: java.lang.String): java.lang.String
  def update(data: js.Any): scala.Unit
}

object Signer {
  @scala.inline
  def apply(sign: (java.lang.String, java.lang.String) => java.lang.String, update: js.Any => scala.Unit): Signer = {
    val __obj = js.Dynamic.literal(sign = js.Any.fromFunction2(sign), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Signer]
  }
}

