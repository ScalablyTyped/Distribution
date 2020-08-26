package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppEngineHttpRequest extends js.Object {
  /**
    * Task-level setting for App Engine routing.
    *
    * If set, AppEngineHttpTarget.app_engine_routing_override is used for
    * all tasks in the queue, no matter what the setting is for the
    * task-level app_engine_routing.
    */
  var appEngineRouting: js.UndefOr[AppEngineRouting] = js.native
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
  var headers: js.UndefOr[Record[String, String]] = js.native
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
  var httpMethod: js.UndefOr[String] = js.native
  /**
    * Payload.
    *
    * The payload will be sent as the HTTP message body. A message
    * body, and thus a payload, is allowed only if the HTTP method is
    * POST or PUT. It is an error to set a data payload on a task with
    * an incompatible HttpMethod.
    */
  var payload: js.UndefOr[String] = js.native
  /**
    * The relative URL.
    *
    * The relative URL must begin with "/" and must be a valid HTTP relative URL.
    * It can contain a path and query string arguments.
    * If the relative URL is empty, then the root path "/" will be used.
    * No spaces are allowed, and the maximum length allowed is 2083 characters.
    */
  var relativeUrl: js.UndefOr[String] = js.native
}

object AppEngineHttpRequest {
  @scala.inline
  def apply(): AppEngineHttpRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngineHttpRequest]
  }
  @scala.inline
  implicit class AppEngineHttpRequestOps[Self <: AppEngineHttpRequest] (val x: Self) extends AnyVal {
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

