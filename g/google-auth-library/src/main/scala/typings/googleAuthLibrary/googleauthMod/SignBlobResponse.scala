package typings.googleAuthLibrary.googleauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignBlobResponse extends js.Object {
  var signature: String
}

object SignBlobResponse {
  @scala.inline
  def apply(signature: String): SignBlobResponse = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignBlobResponse]
  }
}

