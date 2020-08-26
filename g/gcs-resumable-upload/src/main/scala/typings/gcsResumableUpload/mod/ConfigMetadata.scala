package typings.gcsResumableUpload.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigMetadata
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Set the length of the file being uploaded.
    */
  var contentLength: js.UndefOr[Double] = js.native
  /**
    * Set the content type of the incoming data.
    */
  var contentType: js.UndefOr[String] = js.native
}

object ConfigMetadata {
  @scala.inline
  def apply(): ConfigMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigMetadata]
  }
  @scala.inline
  implicit class ConfigMetadataOps[Self <: ConfigMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentLength(value: Double): Self = this.set("contentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLength: Self = this.set("contentLength", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
  }
  
}

