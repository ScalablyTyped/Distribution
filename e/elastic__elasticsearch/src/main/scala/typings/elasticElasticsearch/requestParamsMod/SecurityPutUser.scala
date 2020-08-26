package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.`false`
import typings.elasticElasticsearch.elasticElasticsearchStrings.`true`
import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityPutUser[T] extends Generic {
  var body: T = js.native
  var refresh: js.UndefOr[`true` | `false` | wait_for] = js.native
  var username: String = js.native
}

object SecurityPutUser {
  @scala.inline
  def apply[T](body: T, username: String): SecurityPutUser[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutUser[T]]
  }
  @scala.inline
  implicit class SecurityPutUserOps[Self <: SecurityPutUser[_], T] (val x: Self with SecurityPutUser[T]) extends AnyVal {
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
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefresh(value: `true` | `false` | wait_for): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
  }
  
}

