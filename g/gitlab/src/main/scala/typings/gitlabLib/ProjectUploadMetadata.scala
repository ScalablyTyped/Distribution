package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Project upload metadata
trait ProjectUploadMetadata extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectUploadMetadata {
  @scala.inline
  def apply(contentType: java.lang.String = null, filename: java.lang.String = null): ProjectUploadMetadata = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[ProjectUploadMetadata]
  }
}

