package typings.fabric.fabricImplMod

import typings.fabric.anon.Corner
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEvent extends js.Object {
  
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
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setE(value: Event): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePointer(value: Point): Self = this.set("absolutePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutePointer: Self = this.set("absolutePointer", js.undefined)
    
    @scala.inline
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setIsClick(value: Boolean): Self = this.set("isClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClick: Self = this.set("isClick", js.undefined)
    
    @scala.inline
    def setPointer(value: Point): Self = this.set("pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointer: Self = this.set("pointer", js.undefined)
    
    @scala.inline
    def setSubTargetsVarargs(value: Object*): Self = this.set("subTargets", js.Array(value :_*))
    
    @scala.inline
    def setSubTargets(value: js.Array[Object]): Self = this.set("subTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTargets: Self = this.set("subTargets", js.undefined)
    
    @scala.inline
    def setTarget(value: Object): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTransform(value: Corner): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
