package typings.gcsDashResumableDashUpload.gcsDashResumableDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigMetadata extends js.Object {
  /**
    * Set the length of the file being uploaded.
    */
  var contentLength: js.UndefOr[Double] = js.undefined
  /**
    * Set the content type of the incoming data.
    */
  var contentType: js.UndefOr[String] = js.undefined
}

object ConfigMetadata {
  @scala.inline
  def apply(contentLength: Int | Double = null, contentType: String = null): ConfigMetadata = {
    val __obj = js.Dynamic.literal()
    if (contentLength != null) __obj.updateDynamic("contentLength")(contentLength.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    __obj.asInstanceOf[ConfigMetadata]
  }
}

