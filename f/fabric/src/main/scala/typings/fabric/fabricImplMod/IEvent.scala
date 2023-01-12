package typings.fabric.fabricImplMod

import typings.fabric.anon.Corner
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEvent[E /* <: Event */] extends StObject {
  
  var absolutePointer: js.UndefOr[Point] = js.undefined
  
  var button: js.UndefOr[Double] = js.undefined
  
  var currentSubTargets: js.UndefOr[js.Array[Object]] = js.undefined
  
  var currentTarget: js.UndefOr[Object] = js.undefined
  
  var e: E
  
  var isClick: js.UndefOr[Boolean] = js.undefined
  
  var pointer: js.UndefOr[Point] = js.undefined
  
  var selected: js.UndefOr[js.Array[Object]] = js.undefined
  
  var subTargets: js.UndefOr[js.Array[Object]] = js.undefined
  
  var target: js.UndefOr[Object] = js.undefined
  
  var transform: js.UndefOr[Corner] = js.undefined
}
object IEvent {
  
  inline def apply[E /* <: Event */](e: E): IEvent[E] = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent[E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEvent[?], E /* <: Event */] (val x: Self & IEvent[E]) extends AnyVal {
    
    inline def setAbsolutePointer(value: Point): Self = StObject.set(x, "absolutePointer", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePointerUndefined: Self = StObject.set(x, "absolutePointer", js.undefined)
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setCurrentSubTargets(value: js.Array[Object]): Self = StObject.set(x, "currentSubTargets", value.asInstanceOf[js.Any])
    
    inline def setCurrentSubTargetsUndefined: Self = StObject.set(x, "currentSubTargets", js.undefined)
    
    inline def setCurrentSubTargetsVarargs(value: Object*): Self = StObject.set(x, "currentSubTargets", js.Array(value*))
    
    inline def setCurrentTarget(value: Object): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
    
    inline def setE(value: E): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setIsClick(value: Boolean): Self = StObject.set(x, "isClick", value.asInstanceOf[js.Any])
    
    inline def setIsClickUndefined: Self = StObject.set(x, "isClick", js.undefined)
    
    inline def setPointer(value: Point): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    
    inline def setSelected(value: js.Array[Object]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: Object*): Self = StObject.set(x, "selected", js.Array(value*))
    
    inline def setSubTargets(value: js.Array[Object]): Self = StObject.set(x, "subTargets", value.asInstanceOf[js.Any])
    
    inline def setSubTargetsUndefined: Self = StObject.set(x, "subTargets", js.undefined)
    
    inline def setSubTargetsVarargs(value: Object*): Self = StObject.set(x, "subTargets", js.Array(value*))
    
    inline def setTarget(value: Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTransform(value: Corner): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
