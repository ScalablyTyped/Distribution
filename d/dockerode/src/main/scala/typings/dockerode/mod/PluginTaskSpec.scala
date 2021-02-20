package typings.dockerode.mod

import typings.dockerode.dockerodeStrings.plugin
import org.scalablytyped.runtime.StObject
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
  implicit class PluginTaskSpecMutableBuilder[Self <: PluginTaskSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPluginSpec(value: PluginSpec): Self = StObject.set(x, "PluginSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: plugin): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
  }
}
