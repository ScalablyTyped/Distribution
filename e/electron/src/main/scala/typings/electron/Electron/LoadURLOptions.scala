package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadURLOptions extends js.Object {
  /**
    * Base url (with trailing path separator) for files to be loaded by the data url.
    * This is needed only if the specified `url` is a data url and needs to load other
    * files.
    */
  var baseURLForDataURL: js.UndefOr[String] = js.native
  /**
    * Extra headers separated by "\n"
    */
  var extraHeaders: js.UndefOr[String] = js.native
  /**
    * An HTTP Referrer url.
    */
  var httpReferrer: js.UndefOr[String | Referrer] = js.native
  var postData: js.UndefOr[js.Array[UploadBlob | UploadFile | UploadRawData]] = js.native
  /**
    * A user agent originating the request.
    */
  var userAgent: js.UndefOr[String] = js.native
}

object LoadURLOptions {
  @scala.inline
  def apply(): LoadURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadURLOptions]
  }
  @scala.inline
  implicit class LoadURLOptionsOps[Self <: LoadURLOptions] (val x: Self) extends AnyVal {
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
    def setBaseURLForDataURL(value: String): Self = this.set("baseURLForDataURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseURLForDataURL: Self = this.set("baseURLForDataURL", js.undefined)
    @scala.inline
    def setExtraHeaders(value: String): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
    @scala.inline
    def setHttpReferrer(value: String | Referrer): Self = this.set("httpReferrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpReferrer: Self = this.set("httpReferrer", js.undefined)
    @scala.inline
    def setPostDataVarargs(value: (UploadBlob | UploadFile | UploadRawData)*): Self = this.set("postData", js.Array(value :_*))
    @scala.inline
    def setPostData(value: js.Array[UploadBlob | UploadFile | UploadRawData]): Self = this.set("postData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostData: Self = this.set("postData", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
  
}

