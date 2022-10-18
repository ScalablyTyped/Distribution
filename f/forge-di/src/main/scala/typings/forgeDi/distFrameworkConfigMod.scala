package typings.forgeDi

import typings.forgeDi.distInspectorsInspectorMod.Inspector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFrameworkConfigMod {
  
  trait Config extends StObject {
    
    var inspector: js.UndefOr[Inspector] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setInspector(value: Inspector): Self = StObject.set(x, "inspector", value.asInstanceOf[js.Any])
      
      inline def setInspectorUndefined: Self = StObject.set(x, "inspector", js.undefined)
    }
  }
}
