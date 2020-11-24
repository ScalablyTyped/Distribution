package typings.dockerode.mod

import typings.dockerode.dockerodeStrings.plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginTaskSpec
  extends TaskSpecBase
     with TaskSpec {
  
  var PluginSpec: typings.dockerode.mod.PluginSpec = js.native
  
  @JSName("Runtime")
  var Runtime_PluginTaskSpec: plugin = js.native
}
object PluginTaskSpec {
  
  @scala.inline
  def apply(PluginSpec: PluginSpec, Runtime: plugin): PluginTaskSpec = {
    val __obj = js.Dynamic.literal(PluginSpec = PluginSpec.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginTaskSpec]
  }
  
  @scala.inline
  implicit class PluginTaskSpecOps[Self <: PluginTaskSpec] (val x: Self) extends AnyVal {
    
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
    def setPluginSpec(value: PluginSpec): Self = this.set("PluginSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: plugin): Self = this.set("Runtime", value.asInstanceOf[js.Any])
  }
}
