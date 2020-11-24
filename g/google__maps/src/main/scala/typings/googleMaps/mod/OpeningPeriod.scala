package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpeningPeriod extends js.Object {
  
  /**
    * may contain a pair of day and time objects describing when the place closes.
    * **Note:** If a place is **always open**, the `close` section will be missing from the response.
    * Clients can rely on always-open being represented as an `open` period containing `day` with value 0
    * and `time` with value 0000, and no `close`.
    */
  var close: js.UndefOr[OpeningHoursTime] = js.native
  
  /** contains a pair of day and time objects describing when the place opens. */
  var open: OpeningHoursTime = js.native
}
object OpeningPeriod {
  
  @scala.inline
  def apply(open: OpeningHoursTime): OpeningPeriod = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningPeriod]
  }
  
  @scala.inline
  implicit class OpeningPeriodOps[Self <: OpeningPeriod] (val x: Self) extends AnyVal {
    
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
    def setOpen(value: OpeningHoursTime): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: OpeningHoursTime): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
  }
}
