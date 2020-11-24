package typings.eventIterator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<event-iterator.event-iterator/lib/event-iterator.EventIteratorOptions> */
@js.native
trait PartialEventIteratorOptio extends js.Object {
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var lowWaterMark: js.UndefOr[Double] = js.native
}
object PartialEventIteratorOptio {
  
  @scala.inline
  def apply(): PartialEventIteratorOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEventIteratorOptio]
  }
  
  @scala.inline
  implicit class PartialEventIteratorOptioOps[Self <: PartialEventIteratorOptio] (val x: Self) extends AnyVal {
    
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
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    
    @scala.inline
    def setLowWaterMark(value: Double): Self = this.set("lowWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowWaterMark: Self = this.set("lowWaterMark", js.undefined)
  }
}
