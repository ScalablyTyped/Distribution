package typings.gapiDotClientDotIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignBlobRequest extends js.Object {
  /** The bytes to sign. */
  var bytesToSign: js.UndefOr[String] = js.undefined
}

object SignBlobRequest {
  @scala.inline
  def apply(bytesToSign: String = null): SignBlobRequest = {
    val __obj = js.Dynamic.literal()
    if (bytesToSign != null) __obj.updateDynamic("bytesToSign")(bytesToSign)
    __obj.asInstanceOf[SignBlobRequest]
  }
}

