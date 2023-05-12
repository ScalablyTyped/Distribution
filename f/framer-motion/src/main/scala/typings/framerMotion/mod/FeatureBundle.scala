package typings.framerMotion.mod

import typings.react.mod.ComponentType
import typings.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureBundle
  extends StObject
     with FeaturePackages {
  
  var renderer: CreateVisualElement[Any]
}
object FeatureBundle {
  
  inline def apply(
    renderer: (/* Component */ String | ComponentType[PropsWithChildren[Any]], /* options */ VisualElementOptions[Any, Any]) => VisualElement[Any, Any, js.Object]
  ): FeatureBundle = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction2(renderer))
    __obj.asInstanceOf[FeatureBundle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureBundle] (val x: Self) extends AnyVal {
    
    inline def setRenderer(
      value: (/* Component */ String | ComponentType[PropsWithChildren[Any]], /* options */ VisualElementOptions[Any, Any]) => VisualElement[Any, Any, js.Object]
    ): Self = StObject.set(x, "renderer", js.Any.fromFunction2(value))
  }
}
