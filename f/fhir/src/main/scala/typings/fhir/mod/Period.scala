package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Period
  extends StObject
     with Element {
  
  var _end: js.UndefOr[Element] = js.undefined
  
  var _start: js.UndefOr[Element] = js.undefined
  
  /**
    * The end of the period. If the end of the period is missing, it means that the period is ongoing. The start may be in the past, and the end date in the future, which means that period is expected/planned to end at that time.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * The start of the period. The boundary is inclusive.
    */
  var start: js.UndefOr[String] = js.undefined
}
object Period {
  
  inline def apply(): Period = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Period]
  }
  
  extension [Self <: Period](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def set_end(value: Element): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
    
    inline def set_endUndefined: Self = StObject.set(x, "_end", js.undefined)
    
    inline def set_start(value: Element): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    
    inline def set_startUndefined: Self = StObject.set(x, "_start", js.undefined)
  }
}
