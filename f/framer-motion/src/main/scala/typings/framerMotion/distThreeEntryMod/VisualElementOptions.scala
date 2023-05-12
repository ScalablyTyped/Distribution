package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualElementOptions[Instance, RenderState] extends StObject {
  
  var blockInitialAnimation: js.UndefOr[Boolean] = js.undefined
  
  var parent: js.UndefOr[VisualElement[Any, Any, js.Object]] = js.undefined
  
  var presenceContext: PresenceContextProps | Null
  
  var props: MotionProps
  
  var reducedMotionConfig: js.UndefOr[ReducedMotionConfig] = js.undefined
  
  var variantParent: js.UndefOr[VisualElement[Any, Any, js.Object]] = js.undefined
  
  var visualState: VisualState[Instance, RenderState]
}
object VisualElementOptions {
  
  inline def apply[Instance, RenderState](props: MotionProps, visualState: VisualState[Instance, RenderState]): VisualElementOptions[Instance, RenderState] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], visualState = visualState.asInstanceOf[js.Any], presenceContext = null)
    __obj.asInstanceOf[VisualElementOptions[Instance, RenderState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualElementOptions[?, ?], Instance, RenderState] (val x: Self & (VisualElementOptions[Instance, RenderState])) extends AnyVal {
    
    inline def setBlockInitialAnimation(value: Boolean): Self = StObject.set(x, "blockInitialAnimation", value.asInstanceOf[js.Any])
    
    inline def setBlockInitialAnimationUndefined: Self = StObject.set(x, "blockInitialAnimation", js.undefined)
    
    inline def setParent(value: VisualElement[Any, Any, js.Object]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPresenceContext(value: PresenceContextProps): Self = StObject.set(x, "presenceContext", value.asInstanceOf[js.Any])
    
    inline def setPresenceContextNull: Self = StObject.set(x, "presenceContext", null)
    
    inline def setProps(value: MotionProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setReducedMotionConfig(value: ReducedMotionConfig): Self = StObject.set(x, "reducedMotionConfig", value.asInstanceOf[js.Any])
    
    inline def setReducedMotionConfigUndefined: Self = StObject.set(x, "reducedMotionConfig", js.undefined)
    
    inline def setVariantParent(value: VisualElement[Any, Any, js.Object]): Self = StObject.set(x, "variantParent", value.asInstanceOf[js.Any])
    
    inline def setVariantParentUndefined: Self = StObject.set(x, "variantParent", js.undefined)
    
    inline def setVisualState(value: VisualState[Instance, RenderState]): Self = StObject.set(x, "visualState", value.asInstanceOf[js.Any])
  }
}
