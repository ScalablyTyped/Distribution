package typings.fluentRevealEffect

import typings.fluentRevealEffect.anon.BorderSelector
import typings.fluentRevealEffect.fluentRevealEffectInts.`150`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluent-reveal-effect", "FluentRevealEffect")
  @js.native
  val FluentRevealEffect: FluentRevealEffectType = js.native
  
  trait FluentRevealEffectType extends StObject {
    
    def applyEffect(element: String, options: RevealOptions): Unit
  }
  object FluentRevealEffectType {
    
    inline def apply(applyEffect: (String, RevealOptions) => Unit): FluentRevealEffectType = {
      val __obj = js.Dynamic.literal(applyEffect = js.Any.fromFunction2(applyEffect))
      __obj.asInstanceOf[FluentRevealEffectType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FluentRevealEffectType] (val x: Self) extends AnyVal {
      
      inline def setApplyEffect(value: (String, RevealOptions) => Unit): Self = StObject.set(x, "applyEffect", js.Any.fromFunction2(value))
    }
  }
  
  trait RevealOptions extends StObject {
    
    var children: js.UndefOr[BorderSelector] = js.undefined
    
    var clickEffect: js.UndefOr[Boolean] = js.undefined
    
    var gradientSize: js.UndefOr[Double | `150`] = js.undefined
    
    var isContainer: js.UndefOr[Boolean] = js.undefined
    
    var lightColor: js.UndefOr[String] = js.undefined
  }
  object RevealOptions {
    
    inline def apply(): RevealOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevealOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RevealOptions] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: BorderSelector): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClickEffect(value: Boolean): Self = StObject.set(x, "clickEffect", value.asInstanceOf[js.Any])
      
      inline def setClickEffectUndefined: Self = StObject.set(x, "clickEffect", js.undefined)
      
      inline def setGradientSize(value: Double | `150`): Self = StObject.set(x, "gradientSize", value.asInstanceOf[js.Any])
      
      inline def setGradientSizeUndefined: Self = StObject.set(x, "gradientSize", js.undefined)
      
      inline def setIsContainer(value: Boolean): Self = StObject.set(x, "isContainer", value.asInstanceOf[js.Any])
      
      inline def setIsContainerUndefined: Self = StObject.set(x, "isContainer", js.undefined)
      
      inline def setLightColor(value: String): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
      
      inline def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
    }
  }
}
