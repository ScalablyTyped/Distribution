package typings.gatsbyImage

import typings.gatsbyImage.gatsbyImageStrings.`scale-down`
import typings.gatsbyImage.gatsbyImageStrings.contain
import typings.gatsbyImage.gatsbyImageStrings.cover
import typings.gatsbyImage.gatsbyImageStrings.fill
import typings.gatsbyImage.gatsbyImageStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ObjectFit extends StObject {
    
    var objectFit: js.UndefOr[fill | contain | cover | none | `scale-down`] = js.undefined
    
    var objectPosition: js.UndefOr[String] = js.undefined
  }
  object ObjectFit {
    
    inline def apply(): ObjectFit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectFit]
    }
    
    extension [Self <: ObjectFit](x: Self) {
      
      inline def setObjectFit(value: fill | contain | cover | none | `scale-down`): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
      
      inline def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
      
      inline def setObjectPosition(value: String): Self = StObject.set(x, "objectPosition", value.asInstanceOf[js.Any])
      
      inline def setObjectPositionUndefined: Self = StObject.set(x, "objectPosition", js.undefined)
    }
  }
  
  trait WasCached extends StObject {
    
    var wasCached: Boolean
  }
  object WasCached {
    
    inline def apply(wasCached: Boolean): WasCached = {
      val __obj = js.Dynamic.literal(wasCached = wasCached.asInstanceOf[js.Any])
      __obj.asInstanceOf[WasCached]
    }
    
    extension [Self <: WasCached](x: Self) {
      
      inline def setWasCached(value: Boolean): Self = StObject.set(x, "wasCached", value.asInstanceOf[js.Any])
    }
  }
}
