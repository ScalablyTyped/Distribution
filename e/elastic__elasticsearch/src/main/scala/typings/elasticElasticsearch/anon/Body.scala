package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  var body: Null = js.native
  var headers: Null = js.native
  var statusCode: Null = js.native
  var warnings: Null = js.native
}

object Body {
  @scala.inline
  def apply(body: Null, headers: Null, statusCode: Null, warnings: Null): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
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
    def setBody(value: Null): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Null): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Null): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarnings(value: Null): Self = this.set("warnings", value.asInstanceOf[js.Any])
  }
  
}

