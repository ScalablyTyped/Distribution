package typings.fluentRevealEffect

import typings.fluentRevealEffect.fluentRevealEffectInts.`150`
import typings.fluentRevealEffect.fluentRevealEffectStrings.`Doteff-reveal-border`
import typings.fluentRevealEffect.fluentRevealEffectStrings.`Doteff-reveal`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BorderSelector extends StObject {
    
    var borderSelector: js.UndefOr[String | `Doteff-reveal-border`] = js.undefined
    
    var elementSelector: js.UndefOr[String | `Doteff-reveal`] = js.undefined
    
    var gradientSize: js.UndefOr[Double | `150`] = js.undefined
    
    var lightColor: js.UndefOr[String] = js.undefined
  }
  object BorderSelector {
    
    inline def apply(): BorderSelector = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderSelector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BorderSelector] (val x: Self) extends AnyVal {
      
      inline def setBorderSelector(value: String | `Doteff-reveal-border`): Self = StObject.set(x, "borderSelector", value.asInstanceOf[js.Any])
      
      inline def setBorderSelectorUndefined: Self = StObject.set(x, "borderSelector", js.undefined)
      
      inline def setElementSelector(value: String | `Doteff-reveal`): Self = StObject.set(x, "elementSelector", value.asInstanceOf[js.Any])
      
      inline def setElementSelectorUndefined: Self = StObject.set(x, "elementSelector", js.undefined)
      
      inline def setGradientSize(value: Double | `150`): Self = StObject.set(x, "gradientSize", value.asInstanceOf[js.Any])
      
      inline def setGradientSizeUndefined: Self = StObject.set(x, "gradientSize", js.undefined)
      
      inline def setLightColor(value: String): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
      
      inline def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
    }
  }
}
