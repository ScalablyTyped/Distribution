package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInt64RangeMatch extends StObject {
  
  /**
    * The end of the range (exclusive) in signed long integer format.
    */
  var rangeEnd: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start of the range (inclusive) in signed long integer format.
    */
  var rangeStart: js.UndefOr[String | Null] = js.undefined
}
object SchemaInt64RangeMatch {
  
  inline def apply(): SchemaInt64RangeMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInt64RangeMatch]
  }
  
  extension [Self <: SchemaInt64RangeMatch](x: Self) {
    
    inline def setRangeEnd(value: String): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeEndNull: Self = StObject.set(x, "rangeEnd", null)
    
    inline def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    inline def setRangeStart(value: String): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    inline def setRangeStartNull: Self = StObject.set(x, "rangeStart", null)
    
    inline def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
  }
}
