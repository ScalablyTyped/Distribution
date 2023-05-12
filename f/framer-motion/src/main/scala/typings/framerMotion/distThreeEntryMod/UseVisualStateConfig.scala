package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseVisualStateConfig[Instance, RenderState] extends StObject {
  
  def createRenderState(): RenderState
  
  var onMount: js.UndefOr[
    js.Function3[
      /* props */ MotionProps, 
      /* instance */ Instance, 
      /* visualState */ VisualState[Instance, RenderState], 
      Unit
    ]
  ] = js.undefined
  
  var scrapeMotionValuesFromProps: ScrapeMotionValuesFromProps
}
object UseVisualStateConfig {
  
  inline def apply[Instance, RenderState](
    createRenderState: () => RenderState,
    scrapeMotionValuesFromProps: (/* props */ MotionProps, /* prevProps */ MotionProps) => StringDictionary[MotionValue[Any] | String | Double]
  ): UseVisualStateConfig[Instance, RenderState] = {
    val __obj = js.Dynamic.literal(createRenderState = js.Any.fromFunction0(createRenderState), scrapeMotionValuesFromProps = js.Any.fromFunction2(scrapeMotionValuesFromProps))
    __obj.asInstanceOf[UseVisualStateConfig[Instance, RenderState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseVisualStateConfig[?, ?], Instance, RenderState] (val x: Self & (UseVisualStateConfig[Instance, RenderState])) extends AnyVal {
    
    inline def setCreateRenderState(value: () => RenderState): Self = StObject.set(x, "createRenderState", js.Any.fromFunction0(value))
    
    inline def setOnMount(
      value: (/* props */ MotionProps, /* instance */ Instance, /* visualState */ VisualState[Instance, RenderState]) => Unit
    ): Self = StObject.set(x, "onMount", js.Any.fromFunction3(value))
    
    inline def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
    
    inline def setScrapeMotionValuesFromProps(
      value: (/* props */ MotionProps, /* prevProps */ MotionProps) => StringDictionary[MotionValue[Any] | String | Double]
    ): Self = StObject.set(x, "scrapeMotionValuesFromProps", js.Any.fromFunction2(value))
  }
}
