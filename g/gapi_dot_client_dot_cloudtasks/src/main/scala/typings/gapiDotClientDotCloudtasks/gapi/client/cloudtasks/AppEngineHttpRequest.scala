package typings.gapiDotClientDotCloudtasks.gapi.client.cloudtasks

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEngineHttpRequest extends js.Object {
  /**
    * Task-level setting for App Engine routing.
    *
    * If set, AppEngineHttpTarget.app_engine_routing_override is used for
    * all tasks in the queue, no matter what the setting is for the
    * task-level app_engine_routing.
    */
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.undefined
  /**
    * HTTP request headers.
    *
    * This map contains the header field names and values.
    * Headers can be set when the
    * [task is created](google.cloud.tasks.v2beta2.CloudTasks.CreateTask).
    * Repeated headers are not supported but a header value can contain commas.
    *
    * Cloud Tasks sets some headers to default values:
    *
    * &#42; `User-Agent`: By default, this header is
    * `"AppEngine-Google; (+http://code.google.com/appengine)"`.
    * This header can be modified, but Cloud Tasks will append
    * `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
    * modified `User-Agent`.
    *
    * If the task has an AppEngineHttpRequest.payload, Cloud Tasks sets the
    * following headers:
    *
    * &#42; `Content-Type`: By default, the `Content-Type` header is set to
    * `"application/octet-stream"`. The default can be overridden by explictly
    * setting `Content-Type` to a particular media type when the
    * [task is created](google.cloud.tasks.v2beta2.CloudTasks.CreateTask).
    * For example, `Content-Type` can be set to `"application/json"`.
    * &#42; `Content-Length`: This is computed by Cloud Tasks. This value is
    * output only. It cannot be changed.
    *
    * The headers below cannot be set or overridden:
    *
    * &#42; `Host`
    * &#42; `X-Google-&#42;`
    * &#42; `X-AppEngine-&#42;`
    *
    * In addition, some App Engine headers, which contain
    * task-specific information, are also be sent to the task handler; see
    * [request headers](/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * The HTTP method to use for the request. The default is POST.
    *
    * The app's request handler for the task's target URL must be able to handle
    * HTTP requests with this http_method, otherwise the task attempt will fail
    * with error code 405 (Method Not Allowed). See
    * the Request-Line is not allowed for the resource identified by the
    * Request-URI". See
    * [Writing a push task request handler](/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler)
    * and the documentation for the request handlers in the language your app is
    * written in e.g.
    * [python RequestHandler](/appengine/docs/python/tools/webapp/requesthandlerclass).
    */
  var httpMethod: js.UndefOr[String] = js.undefined
  /**
    * Payload.
    *
    * The payload will be sent as the HTTP message body. A message
    * body, and thus a payload, is allowed only if the HTTP method is
    * POST or PUT. It is an error to set a data payload on a task with
    * an incompatible HttpMethod.
    */
  var payload: js.UndefOr[String] = js.undefined
  /**
    * The relative URL.
    *
    * The relative URL must begin with "/" and must be a valid HTTP relative URL.
    * It can contain a path and query string arguments.
    * If the relative URL is empty, then the root path "/" will be used.
    * No spaces are allowed, and the maximum length allowed is 2083 characters.
    */
  var relativeUrl: js.UndefOr[String] = js.undefined
}

object AppEngineHttpRequest {
  @scala.inline
  def apply(
    appEngineRouting: AppEngineRouting = null,
    headers: Record[String, String] = null,
    httpMethod: String = null,
    payload: String = null,
    relativeUrl: String = null
  ): AppEngineHttpRequest = {
    val __obj = js.Dynamic.literal()
    if (appEngineRouting != null) __obj.updateDynamic("appEngineRouting")(appEngineRouting.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (relativeUrl != null) __obj.updateDynamic("relativeUrl")(relativeUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEngineHttpRequest]
  }
}

