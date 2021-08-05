package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HttpRouteRuleMatch criteria for field values that must stay within the
  * specified integer range.
  */
trait SchemaInt64RangeMatch extends StObject {
  
  /**
    * The end of the range (exclusive) in signed long integer format.
    */
  var rangeEnd: js.UndefOr[String] = js.undefined
  
  /**
    * The start of the range (inclusive) in signed long integer format.
    */
  var rangeStart: js.UndefOr[String] = js.undefined
}
object SchemaInt64RangeMatch {
  
  inline def apply(): SchemaInt64RangeMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInt64RangeMatch]
  }
  
  extension [Self <: SchemaInt64RangeMatch](x: Self) {
    
    inline def setRangeEnd(value: String): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    inline def setRangeStart(value: String): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    inline def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
  }
}
