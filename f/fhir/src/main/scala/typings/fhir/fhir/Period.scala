package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time range defined by start and end date/time
  */
@js.native
trait Period extends Element {
  
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.native
  
  /**
    * End time with inclusive boundary, if not ongoing
    */
  var end: js.UndefOr[dateTime] = js.native
  
  /**
    * Starting time with inclusive boundary
    */
  var start: js.UndefOr[dateTime] = js.native
}
object Period {
  
  @scala.inline
  def apply(): Period = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Period]
  }
  
  @scala.inline
  implicit class PeriodOps[Self <: Period] (val x: Self) extends AnyVal {
    
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
    def set_end(value: Element): Self = this.set("_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_end: Self = this.set("_end", js.undefined)
    
    @scala.inline
    def set_start(value: Element): Self = this.set("_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_start: Self = this.set("_start", js.undefined)
    
    @scala.inline
    def setEnd(value: dateTime): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: dateTime): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
