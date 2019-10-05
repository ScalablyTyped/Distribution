package typings.gapiDotClientDotCloudtasks.gapi.client.cloudtasks

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEngineTaskTarget extends js.Object {
  /** Deprecated. Use AppEngineHttpRequest.app_engine_routing. */
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.undefined
  /** Deprecated. Use AppEngineHttpRequest.headers. */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  /** Deprecated. Use AppEngineHttpRequest.http_method. */
  var httpMethod: js.UndefOr[String] = js.undefined
  /** Deprecated. Use AppEngineHttpRequest.payload. */
  var payload: js.UndefOr[String] = js.undefined
  /** Deprecated. Use AppEngineHttpRequest.relative_url. */
  var relativeUrl: js.UndefOr[String] = js.undefined
}

object AppEngineTaskTarget {
  @scala.inline
  def apply(
    appEngineRouting: AppEngineRouting = null,
    headers: Record[String, String] = null,
    httpMethod: String = null,
    payload: String = null,
    relativeUrl: String = null
  ): AppEngineTaskTarget = {
    val __obj = js.Dynamic.literal()
    if (appEngineRouting != null) __obj.updateDynamic("appEngineRouting")(appEngineRouting)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (relativeUrl != null) __obj.updateDynamic("relativeUrl")(relativeUrl)
    __obj.asInstanceOf[AppEngineTaskTarget]
  }
}

