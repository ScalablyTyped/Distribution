package typings
package googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyIdTokenOptions extends js.Object {
  var audience: java.lang.String | js.Array[java.lang.String]
  var idToken: java.lang.String
  var maxExpiry: js.UndefOr[scala.Double] = js.undefined
}

object VerifyIdTokenOptions {
  @scala.inline
  def apply(
    audience: java.lang.String | js.Array[java.lang.String],
    idToken: java.lang.String,
    maxExpiry: scala.Int | scala.Double = null
  ): VerifyIdTokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    __obj.updateDynamic("idToken")(idToken)
    if (maxExpiry != null) __obj.updateDynamic("maxExpiry")(maxExpiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyIdTokenOptions]
  }
}

