package typings.googleAuthLibrary.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMetadata extends js.Object {
  var `x-goog-iam-authority-selector`: String
  var `x-goog-iam-authorization-token`: String
}

object RequestMetadata {
  @scala.inline
  def apply(`x-goog-iam-authority-selector`: String, `x-goog-iam-authorization-token`: String): RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-goog-iam-authority-selector")(`x-goog-iam-authority-selector`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-goog-iam-authorization-token")(`x-goog-iam-authorization-token`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMetadata]
  }
}

