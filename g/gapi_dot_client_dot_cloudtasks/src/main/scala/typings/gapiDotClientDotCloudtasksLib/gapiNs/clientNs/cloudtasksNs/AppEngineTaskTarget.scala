package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEngineTaskTarget extends js.Object {
  /** Deprecated. Use AppEngineHttpRequest.app_engine_routing. */
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.undefined
  /** Deprecated. Use AppEngineHttpRequest.headers. */
  var headers: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Deprecated. Use AppEngineHttpRequest.http_method. */
  var httpMethod: js.UndefOr[java.lang.String] = js.undefined
  /** Deprecated. Use AppEngineHttpRequest.payload. */
  var payload: js.UndefOr[java.lang.String] = js.undefined
  /** Deprecated. Use AppEngineHttpRequest.relative_url. */
  var relativeUrl: js.UndefOr[java.lang.String] = js.undefined
}

object AppEngineTaskTarget {
  @scala.inline
  def apply(
    appEngineRouting: AppEngineRouting = null,
    headers: stdLib.Record[java.lang.String, java.lang.String] = null,
    httpMethod: java.lang.String = null,
    payload: java.lang.String = null,
    relativeUrl: java.lang.String = null
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

