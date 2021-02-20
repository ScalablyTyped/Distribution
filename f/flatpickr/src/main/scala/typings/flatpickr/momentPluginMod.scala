package typings.flatpickr

import typings.flatpickr.optionsMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object momentPluginMod {
  
  @JSImport("flatpickr/dist/plugins/momentPlugin", JSImport.Default)
  @js.native
  def default(config: Config): Plugin[js.Object] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var moment: js.Function = js.native
  }
  object Config {
    
    @scala.inline
    def apply(moment: js.Function): Config = {
      val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMoment(value: js.Function): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
    }
  }
}
