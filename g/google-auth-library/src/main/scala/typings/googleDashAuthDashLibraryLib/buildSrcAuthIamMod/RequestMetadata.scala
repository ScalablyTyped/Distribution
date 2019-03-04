package typings
package googleDashAuthDashLibraryLib.buildSrcAuthIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMetadata extends js.Object {
  var `x-goog-iam-authority-selector`: java.lang.String
  var `x-goog-iam-authorization-token`: java.lang.String
}

object RequestMetadata {
  @scala.inline
  def apply(
    `x-goog-iam-authority-selector`: java.lang.String,
    `x-goog-iam-authorization-token`: java.lang.String
  ): RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-goog-iam-authority-selector")(`x-goog-iam-authority-selector`)
    __obj.updateDynamic("x-goog-iam-authorization-token")(`x-goog-iam-authorization-token`)
    __obj.asInstanceOf[RequestMetadata]
  }
}

