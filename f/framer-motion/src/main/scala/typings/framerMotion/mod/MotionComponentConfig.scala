package typings.framerMotion.mod

import typings.react.mod.ComponentType
import typings.react.mod.PropsWithChildren
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionComponentConfig[Instance, RenderState] extends StObject {
  
  var Component: String | ComponentType[PropsWithChildren[Any]]
  
  var createVisualElement: js.UndefOr[CreateVisualElement[Instance]] = js.undefined
  
  var preloadedFeatures: js.UndefOr[FeatureBundle] = js.undefined
  
  var useRender: RenderComponent[Instance, RenderState]
  
  var useVisualState: UseVisualState[Instance, RenderState]
}
object MotionComponentConfig {
  
  inline def apply[Instance, RenderState](
    Component: String | ComponentType[PropsWithChildren[Any]],
    useRender: (/* Component */ String | ComponentType[PropsWithChildren[Any]], /* props */ MotionProps, /* ref */ Ref[Instance], /* visualState */ VisualState[Instance, RenderState], /* isStatic */ Boolean, /* visualElement */ js.UndefOr[VisualElement[Instance, Any, js.Object]]) => Any,
    useVisualState: (/* props */ MotionProps, /* isStatic */ Boolean) => VisualState[Instance, RenderState]
  ): MotionComponentConfig[Instance, RenderState] = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], useRender = js.Any.fromFunction6(useRender), useVisualState = js.Any.fromFunction2(useVisualState))
    __obj.asInstanceOf[MotionComponentConfig[Instance, RenderState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionComponentConfig[?, ?], Instance, RenderState] (val x: Self & (MotionComponentConfig[Instance, RenderState])) extends AnyVal {
    
    inline def setComponent(value: String | ComponentType[PropsWithChildren[Any]]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setCreateVisualElement(
      value: (/* Component */ String | ComponentType[PropsWithChildren[Any]], /* options */ VisualElementOptions[Instance, Any]) => VisualElement[Instance, Any, js.Object]
    ): Self = StObject.set(x, "createVisualElement", js.Any.fromFunction2(value))
    
    inline def setCreateVisualElementUndefined: Self = StObject.set(x, "createVisualElement", js.undefined)
    
    inline def setPreloadedFeatures(value: FeatureBundle): Self = StObject.set(x, "preloadedFeatures", value.asInstanceOf[js.Any])
    
    inline def setPreloadedFeaturesUndefined: Self = StObject.set(x, "preloadedFeatures", js.undefined)
    
    inline def setUseRender(
      value: (/* Component */ String | ComponentType[PropsWithChildren[Any]], /* props */ MotionProps, /* ref */ Ref[Instance], /* visualState */ VisualState[Instance, RenderState], /* isStatic */ Boolean, /* visualElement */ js.UndefOr[VisualElement[Instance, Any, js.Object]]) => Any
    ): Self = StObject.set(x, "useRender", js.Any.fromFunction6(value))
    
    inline def setUseVisualState(value: (/* props */ MotionProps, /* isStatic */ Boolean) => VisualState[Instance, RenderState]): Self = StObject.set(x, "useVisualState", js.Any.fromFunction2(value))
  }
}
