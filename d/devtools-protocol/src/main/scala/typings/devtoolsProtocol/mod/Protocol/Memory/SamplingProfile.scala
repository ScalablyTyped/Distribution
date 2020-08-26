package typings.devtoolsProtocol.mod.Protocol.Memory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingProfile extends js.Object {
  var modules: js.Array[Module] = js.native
  var samples: js.Array[SamplingProfileNode] = js.native
}

object SamplingProfile {
  @scala.inline
  def apply(modules: js.Array[Module], samples: js.Array[SamplingProfileNode]): SamplingProfile = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingProfile]
  }
  @scala.inline
  implicit class SamplingProfileOps[Self <: SamplingProfile] (val x: Self) extends AnyVal {
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
    def setModulesVarargs(value: Module*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[Module]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def setSamplesVarargs(value: SamplingProfileNode*): Self = this.set("samples", js.Array(value :_*))
    @scala.inline
    def setSamples(value: js.Array[SamplingProfileNode]): Self = this.set("samples", value.asInstanceOf[js.Any])
  }
  
}

