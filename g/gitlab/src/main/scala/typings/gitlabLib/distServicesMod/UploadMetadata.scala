package typings
package gitlabLib.distServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadMetadata extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
}

object UploadMetadata {
  @scala.inline
  def apply(contentType: java.lang.String = null, filename: java.lang.String = null): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[UploadMetadata]
  }
}

