package typings.gapiClient.gapi.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing information about the HTTP response
  */
@js.native
trait Response[T] extends js.Object {
  // The raw response string.
  var body: String = js.native
  // The map of HTTP response headers.
  var headers: js.UndefOr[js.Array[_]] = js.native
  // The JSON-parsed result.
  var result: T = js.native
  // HTTP status
  var status: js.UndefOr[Double] = js.native
  // HTTP status text
  var statusText: js.UndefOr[String] = js.native
}

object Response {
  @scala.inline
  def apply[T](body: String, result: T): Response[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response[_], T] (val x: Self with Response[T]) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: T): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersVarargs(value: js.Any*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[_]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
  }
  
}

