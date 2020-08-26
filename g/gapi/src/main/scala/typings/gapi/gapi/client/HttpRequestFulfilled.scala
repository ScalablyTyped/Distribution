package typings.gapi.gapi.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRequestFulfilled[T] extends js.Object {
  var body: String = js.native
  var headers: js.UndefOr[js.Array[_]] = js.native
  var result: T = js.native
  var status: js.UndefOr[Double] = js.native
  var statusText: js.UndefOr[String] = js.native
}

object HttpRequestFulfilled {
  @scala.inline
  def apply[T](body: String, result: T): HttpRequestFulfilled[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestFulfilled[T]]
  }
  @scala.inline
  implicit class HttpRequestFulfilledOps[Self <: HttpRequestFulfilled[_], T] (val x: Self with HttpRequestFulfilled[T]) extends AnyVal {
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

