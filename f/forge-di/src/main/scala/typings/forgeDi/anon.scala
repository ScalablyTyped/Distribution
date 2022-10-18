package typings.forgeDi

import typings.forgeDi.distFrameworkModeMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<forge-di.forge-di/dist/framework/Dependency.default> */
  trait Partialdefault extends StObject {
    
    var hint: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Partialdefault {
    
    inline def apply(): Partialdefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialdefault]
    }
    
    extension [Self <: Partialdefault](x: Self) {
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
