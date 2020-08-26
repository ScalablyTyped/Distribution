package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterExistsComponentTemplate extends Generic {
  var local: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var name: String = js.native
}

object ClusterExistsComponentTemplate {
  @scala.inline
  def apply(name: String): ClusterExistsComponentTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterExistsComponentTemplate]
  }
  @scala.inline
  implicit class ClusterExistsComponentTemplateOps[Self <: ClusterExistsComponentTemplate] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    @scala.inline
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
  }
  
}

