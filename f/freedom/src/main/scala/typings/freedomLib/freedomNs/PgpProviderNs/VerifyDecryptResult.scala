package typings
package freedomLib.freedomNs.PgpProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyDecryptResult extends js.Object {
  var data: stdLib.ArrayBuffer
  var signedBy: js.Array[java.lang.String]
}

object VerifyDecryptResult {
  @scala.inline
  def apply(data: stdLib.ArrayBuffer, signedBy: js.Array[java.lang.String]): VerifyDecryptResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("signedBy")(signedBy)
    __obj.asInstanceOf[VerifyDecryptResult]
  }
}

