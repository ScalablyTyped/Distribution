package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignBlobRequest extends js.Object {
  /** The bytes to sign. */
  var bytesToSign: js.UndefOr[java.lang.String] = js.undefined
}

object SignBlobRequest {
  @scala.inline
  def apply(bytesToSign: java.lang.String = null): SignBlobRequest = {
    val __obj = js.Dynamic.literal()
    if (bytesToSign != null) __obj.updateDynamic("bytesToSign")(bytesToSign)
    __obj.asInstanceOf[SignBlobRequest]
  }
}

