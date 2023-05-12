package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.`preserve-aspect`
import typings.framerMotion.framerMotionStrings.both
import typings.framerMotion.framerMotionStrings.position
import typings.framerMotion.framerMotionStrings.size
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectionNodeOptions extends StObject {
  
  var alwaysMeasureLayout: js.UndefOr[Boolean] = js.undefined
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var animationType: js.UndefOr[size | position | both | `preserve-aspect`] = js.undefined
  
  var crossfade: js.UndefOr[Boolean] = js.undefined
  
  var initialPromotionConfig: js.UndefOr[InitialPromotionConfig] = js.undefined
  
  var layout: js.UndefOr[Boolean | String] = js.undefined
  
  var layoutId: js.UndefOr[String] = js.undefined
  
  var layoutRoot: js.UndefOr[Boolean] = js.undefined
  
  var layoutScroll: js.UndefOr[Boolean] = js.undefined
  
  var onExitComplete: js.UndefOr[VoidFunction] = js.undefined
  
  var scheduleRender: js.UndefOr[VoidFunction] = js.undefined
  
  var transition: js.UndefOr[Transition1] = js.undefined
  
  var visualElement: js.UndefOr[VisualElement[Any, Any, js.Object]] = js.undefined
}
object ProjectionNodeOptions {
  
  inline def apply(): ProjectionNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectionNodeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectionNodeOptions] (val x: Self) extends AnyVal {
    
    inline def setAlwaysMeasureLayout(value: Boolean): Self = StObject.set(x, "alwaysMeasureLayout", value.asInstanceOf[js.Any])
    
    inline def setAlwaysMeasureLayoutUndefined: Self = StObject.set(x, "alwaysMeasureLayout", js.undefined)
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnimationType(value: size | position | both | `preserve-aspect`): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setCrossfade(value: Boolean): Self = StObject.set(x, "crossfade", value.asInstanceOf[js.Any])
    
    inline def setCrossfadeUndefined: Self = StObject.set(x, "crossfade", js.undefined)
    
    inline def setInitialPromotionConfig(value: InitialPromotionConfig): Self = StObject.set(x, "initialPromotionConfig", value.asInstanceOf[js.Any])
    
    inline def setInitialPromotionConfigUndefined: Self = StObject.set(x, "initialPromotionConfig", js.undefined)
    
    inline def setLayout(value: Boolean | String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutId(value: String): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
    
    inline def setLayoutIdUndefined: Self = StObject.set(x, "layoutId", js.undefined)
    
    inline def setLayoutRoot(value: Boolean): Self = StObject.set(x, "layoutRoot", value.asInstanceOf[js.Any])
    
    inline def setLayoutRootUndefined: Self = StObject.set(x, "layoutRoot", js.undefined)
    
    inline def setLayoutScroll(value: Boolean): Self = StObject.set(x, "layoutScroll", value.asInstanceOf[js.Any])
    
    inline def setLayoutScrollUndefined: Self = StObject.set(x, "layoutScroll", js.undefined)
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setOnExitComplete(value: () => Unit): Self = StObject.set(x, "onExitComplete", js.Any.fromFunction0(value))
    
    inline def setOnExitCompleteUndefined: Self = StObject.set(x, "onExitComplete", js.undefined)
    
    inline def setScheduleRender(value: () => Unit): Self = StObject.set(x, "scheduleRender", js.Any.fromFunction0(value))
    
    inline def setScheduleRenderUndefined: Self = StObject.set(x, "scheduleRender", js.undefined)
    
    inline def setTransition(value: Transition1): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setVisualElement(value: VisualElement[Any, Any, js.Object]): Self = StObject.set(x, "visualElement", value.asInstanceOf[js.Any])
    
    inline def setVisualElementUndefined: Self = StObject.set(x, "visualElement", js.undefined)
  }
}
