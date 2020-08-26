package typings.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait baseRequestConfig extends js.Object {
  /**
    * Extra meta data to associate with the request/response.
    */
  var meta: js.UndefOr[js.Any] = js.native
  /**
    * The URL of the proxy to use for this request.
    */
  var requestUrl: js.UndefOr[String] = js.native
  /**
    * Whether to ignore errors when parsing the server response. If true, any errors thrown while parsing the JSON response received from the server will be ignored.
    * Defaults to false.
    */
  var suppressErrors: js.UndefOr[Boolean] = js.native
  /**
    * Whether the request should be executed asynchronously. If true, the request will be executed synchronously if supported by the browser; otherwise,
    * it will be executed asynchronously. All browsers support synchronous requests if the request URL is the same domain as the page. Synchronous requests
    * are not supported in IE6 and IE7 for cross-domain environments. Defaults to false.
    */
  var sync: js.UndefOr[Boolean] = js.native
}

object baseRequestConfig {
  @scala.inline
  def apply(): baseRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[baseRequestConfig]
  }
  @scala.inline
  implicit class baseRequestConfigOps[Self <: baseRequestConfig] (val x: Self) extends AnyVal {
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
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setRequestUrl(value: String): Self = this.set("requestUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestUrl: Self = this.set("requestUrl", js.undefined)
    @scala.inline
    def setSuppressErrors(value: Boolean): Self = this.set("suppressErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressErrors: Self = this.set("suppressErrors", js.undefined)
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
  
}

