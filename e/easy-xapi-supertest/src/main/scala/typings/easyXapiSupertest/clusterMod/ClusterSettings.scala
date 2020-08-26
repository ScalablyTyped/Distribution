package typings.easyXapiSupertest.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSettings extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var exec: js.UndefOr[String] = js.native
  var silent: js.UndefOr[Boolean] = js.native
}

object ClusterSettings {
  @scala.inline
  def apply(): ClusterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSettings]
  }
  @scala.inline
  implicit class ClusterSettingsOps[Self <: ClusterSettings] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setExec(value: String): Self = this.set("exec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
  
}

