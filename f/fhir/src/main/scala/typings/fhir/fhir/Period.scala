package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time range defined by start and end date/time
  */
trait Period
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.undefined
  
  /**
    * End time with inclusive boundary, if not ongoing
    */
  var end: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Starting time with inclusive boundary
    */
  var start: js.UndefOr[dateTime] = js.undefined
}
object Period {
  
  inline def apply(): Period = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Period]
  }
  
  extension [Self <: Period](x: Self) {
    
    inline def setEnd(value: dateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: dateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    inline def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    inline def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
  }
}
