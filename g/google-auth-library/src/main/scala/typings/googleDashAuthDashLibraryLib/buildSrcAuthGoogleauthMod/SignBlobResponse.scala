package typings
package googleDashAuthDashLibraryLib.buildSrcAuthGoogleauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignBlobResponse extends js.Object {
  var signature: java.lang.String
}

object SignBlobResponse {
  @scala.inline
  def apply(signature: java.lang.String): SignBlobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[SignBlobResponse]
  }
}

