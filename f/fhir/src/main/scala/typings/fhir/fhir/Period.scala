package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class PeriodMutableBuilder[Self <: Period] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: dateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: dateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    @scala.inline
    def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
  }
}
