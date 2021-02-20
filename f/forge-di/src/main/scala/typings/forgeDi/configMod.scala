package typings.forgeDi

import typings.forgeDi.inspectorMod.Inspector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @js.native
  trait Config extends StObject {
    
    var inspector: js.UndefOr[Inspector] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInspector(value: Inspector): Self = StObject.set(x, "inspector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInspectorUndefined: Self = StObject.set(x, "inspector", js.undefined)
    }
  }
}
