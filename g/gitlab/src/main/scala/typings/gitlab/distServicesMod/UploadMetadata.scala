package typings.gitlab.distServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadMetadata extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
}

object UploadMetadata {
  @scala.inline
  def apply(contentType: String = null, filename: String = null): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[UploadMetadata]
  }
}

