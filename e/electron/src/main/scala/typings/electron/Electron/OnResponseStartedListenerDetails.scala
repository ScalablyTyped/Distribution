package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnResponseStartedListenerDetails extends js.Object {
  /**
    * Indicates whether the response was fetched from disk cache.
    */
  var fromCache: Boolean = js.native
  var id: Double = js.native
  var method: String = js.native
  var referrer: String = js.native
  var resourceType: String = js.native
  var responseHeaders: js.UndefOr[Record[String, js.Array[String]]] = js.native
  var statusCode: Double = js.native
  var statusLine: String = js.native
  var timestamp: Double = js.native
  var url: String = js.native
  var webContentsId: js.UndefOr[Double] = js.native
}

object OnResponseStartedListenerDetails {
  @scala.inline
  def apply(
    fromCache: Boolean,
    id: Double,
    method: String,
    referrer: String,
    resourceType: String,
    statusCode: Double,
    statusLine: String,
    timestamp: Double,
    url: String
  ): OnResponseStartedListenerDetails = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusLine = statusLine.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnResponseStartedListenerDetails]
  }
  @scala.inline
  implicit class OnResponseStartedListenerDetailsOps[Self <: OnResponseStartedListenerDetails] (val x: Self) extends AnyVal {
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
    def setFromCache(value: Boolean): Self = this.set("fromCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusLine(value: String): Self = this.set("statusLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseHeaders(value: Record[String, js.Array[String]]): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    @scala.inline
    def setWebContentsId(value: Double): Self = this.set("webContentsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebContentsId: Self = this.set("webContentsId", js.undefined)
  }
  
}

