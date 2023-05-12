package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualState[Instance, RenderState] extends StObject {
  
  var latestValues: ResolvedValues
  
  var mount: js.UndefOr[js.Function1[/* instance */ Instance, Unit]] = js.undefined
  
  var renderState: RenderState
}
object VisualState {
  
  inline def apply[Instance, RenderState](latestValues: ResolvedValues, renderState: RenderState): VisualState[Instance, RenderState] = {
    val __obj = js.Dynamic.literal(latestValues = latestValues.asInstanceOf[js.Any], renderState = renderState.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualState[Instance, RenderState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualState[?, ?], Instance, RenderState] (val x: Self & (VisualState[Instance, RenderState])) extends AnyVal {
    
    inline def setLatestValues(value: ResolvedValues): Self = StObject.set(x, "latestValues", value.asInstanceOf[js.Any])
    
    inline def setMount(value: /* instance */ Instance => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
    
    inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
    
    inline def setRenderState(value: RenderState): Self = StObject.set(x, "renderState", value.asInstanceOf[js.Any])
  }
}
