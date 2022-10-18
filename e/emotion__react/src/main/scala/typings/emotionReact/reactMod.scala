package typings.emotionReact

import typings.emotionReact.mod.Theme
import typings.emotionSerialize.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object reactMod {
  
  trait Attributes extends StObject {
    
    var css: js.UndefOr[Interpolation[Theme]] = js.undefined
  }
  object Attributes {
    
    inline def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setCss(value: Interpolation[Theme]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssNull: Self = StObject.set(x, "css", null)
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    }
  }
}
