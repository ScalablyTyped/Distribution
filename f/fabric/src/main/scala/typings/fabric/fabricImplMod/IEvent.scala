package typings.fabric.fabricImplMod

import typings.fabric.anon.Corner
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEvent extends StObject {
  
  var absolutePointer: js.UndefOr[Point] = js.native
  
  var button: js.UndefOr[Double] = js.native
  
  var e: Event = js.native
  
  var isClick: js.UndefOr[Boolean] = js.native
  
  var pointer: js.UndefOr[Point] = js.native
  
  var subTargets: js.UndefOr[js.Array[Object]] = js.native
  
  var target: js.UndefOr[Object] = js.native
  
  var transform: js.UndefOr[Corner] = js.native
}
object IEvent {
  
  @scala.inline
  def apply(e: Event): IEvent = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
  
  @scala.inline
  implicit class IEventMutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolutePointer(value: Point): Self = StObject.set(x, "absolutePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePointerUndefined: Self = StObject.set(x, "absolutePointer", js.undefined)
    
    @scala.inline
    def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setE(value: Event): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClick(value: Boolean): Self = StObject.set(x, "isClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClickUndefined: Self = StObject.set(x, "isClick", js.undefined)
    
    @scala.inline
    def setPointer(value: Point): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    
    @scala.inline
    def setSubTargets(value: js.Array[Object]): Self = StObject.set(x, "subTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTargetsUndefined: Self = StObject.set(x, "subTargets", js.undefined)
    
    @scala.inline
    def setSubTargetsVarargs(value: Object*): Self = StObject.set(x, "subTargets", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTransform(value: Corner): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
