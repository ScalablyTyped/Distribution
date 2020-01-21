package typings.gcsResumableUpload.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigMetadata
  extends /* key */ StringDictionary[js.Any] {
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
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    contentLength: Int | Double = null,
    contentType: String = null
  ): ConfigMetadata = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (contentLength != null) __obj.updateDynamic("contentLength")(contentLength.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMetadata]
  }
}

