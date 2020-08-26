package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGetPrivileges extends Generic {
  var application: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
}

object SecurityGetPrivileges {
  @scala.inline
  def apply(): SecurityGetPrivileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetPrivileges]
  }
  @scala.inline
  implicit class SecurityGetPrivilegesOps[Self <: SecurityGetPrivileges] (val x: Self) extends AnyVal {
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
    def setApplication(value: String): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

