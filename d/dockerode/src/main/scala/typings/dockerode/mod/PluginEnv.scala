package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginEnv extends js.Object {
  var Description: String = js.native
  var Name: String = js.native
  var Settable: js.Array[String] = js.native
  var Value: String = js.native
}

object PluginEnv {
  @scala.inline
  def apply(Description: String, Name: String, Settable: js.Array[String], Value: String): PluginEnv = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Settable = Settable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginEnv]
  }
  @scala.inline
  implicit class PluginEnvOps[Self <: PluginEnv] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettableVarargs(value: String*): Self = this.set("Settable", js.Array(value :_*))
    @scala.inline
    def setSettable(value: js.Array[String]): Self = this.set("Settable", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

