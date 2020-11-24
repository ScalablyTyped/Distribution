package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenToOptions extends js.Object {
  
  var off: js.UndefOr[js.Function2[/* event */ event | eventNS, /* handler */ js.Function, Unit]] = js.native
  
  var on: js.UndefOr[js.Function2[/* event */ event | eventNS, /* handler */ js.Function, Unit]] = js.native
  
  var reducers: js.Function | js.Object = js.native
}
object ListenToOptions {
  
  @scala.inline
  def apply(reducers: js.Function | js.Object): ListenToOptions = {
    val __obj = js.Dynamic.literal(reducers = reducers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenToOptions]
  }
  
  @scala.inline
  implicit class ListenToOptionsOps[Self <: ListenToOptions] (val x: Self) extends AnyVal {
    
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
    def setReducers(value: js.Function | js.Object): Self = this.set("reducers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOff(value: (/* event */ event | eventNS, /* handler */ js.Function) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOff: Self = this.set("off", js.undefined)
    
    @scala.inline
    def setOn(value: (/* event */ event | eventNS, /* handler */ js.Function) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
  }
}
