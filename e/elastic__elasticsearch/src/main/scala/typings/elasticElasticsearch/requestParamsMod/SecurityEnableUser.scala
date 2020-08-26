package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.`false`
import typings.elasticElasticsearch.elasticElasticsearchStrings.`true`
import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityEnableUser extends Generic {
  var refresh: js.UndefOr[`true` | `false` | wait_for] = js.native
  var username: String = js.native
}

object SecurityEnableUser {
  @scala.inline
  def apply(username: String): SecurityEnableUser = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityEnableUser]
  }
  @scala.inline
  implicit class SecurityEnableUserOps[Self <: SecurityEnableUser] (val x: Self) extends AnyVal {
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
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefresh(value: `true` | `false` | wait_for): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
  }
  
}

