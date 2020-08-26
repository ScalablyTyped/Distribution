package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGetToken[T] extends Generic {
  var body: T = js.native
}

object SecurityGetToken {
  @scala.inline
  def apply[T](body: T): SecurityGetToken[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetToken[T]]
  }
  @scala.inline
  implicit class SecurityGetTokenOps[Self <: SecurityGetToken[_], T] (val x: Self with SecurityGetToken[T]) extends AnyVal {
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
  }
  
}

