package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppEngineTaskTarget extends js.Object {
  /** Deprecated. Use AppEngineHttpRequest.app_engine_routing. */
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.native
  /** Deprecated. Use AppEngineHttpRequest.headers. */
  var headers: js.UndefOr[Record[String, String]] = js.native
  /** Deprecated. Use AppEngineHttpRequest.http_method. */
  var httpMethod: js.UndefOr[String] = js.native
  /** Deprecated. Use AppEngineHttpRequest.payload. */
  var payload: js.UndefOr[String] = js.native
  /** Deprecated. Use AppEngineHttpRequest.relative_url. */
  var relativeUrl: js.UndefOr[String] = js.native
}

object AppEngineTaskTarget {
  @scala.inline
  def apply(): AppEngineTaskTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngineTaskTarget]
  }
  @scala.inline
  implicit class AppEngineTaskTargetOps[Self <: AppEngineTaskTarget] (val x: Self) extends AnyVal {
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
    def setAppEngineRouting(value: AppEngineRouting): Self = this.set("appEngineRouting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppEngineRouting: Self = this.set("appEngineRouting", js.undefined)
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setRelativeUrl(value: String): Self = this.set("relativeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeUrl: Self = this.set("relativeUrl", js.undefined)
  }
  
}

