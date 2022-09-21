package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDateTimeInput extends StObject {
  
  /**
    * Whether the `datetime` input includes a calendar date.
    */
  var hasDate: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the `datetime` input includes a timestamp.
    */
  var hasTime: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Time since epoch time, in milliseconds.
    */
  var msSinceEpoch: js.UndefOr[String | Null] = js.undefined
}
object SchemaDateTimeInput {
  
  inline def apply(): SchemaDateTimeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateTimeInput]
  }
  
  extension [Self <: SchemaDateTimeInput](x: Self) {
    
    inline def setHasDate(value: Boolean): Self = StObject.set(x, "hasDate", value.asInstanceOf[js.Any])
    
    inline def setHasDateNull: Self = StObject.set(x, "hasDate", null)
    
    inline def setHasDateUndefined: Self = StObject.set(x, "hasDate", js.undefined)
    
    inline def setHasTime(value: Boolean): Self = StObject.set(x, "hasTime", value.asInstanceOf[js.Any])
    
    inline def setHasTimeNull: Self = StObject.set(x, "hasTime", null)
    
    inline def setHasTimeUndefined: Self = StObject.set(x, "hasTime", js.undefined)
    
    inline def setMsSinceEpoch(value: String): Self = StObject.set(x, "msSinceEpoch", value.asInstanceOf[js.Any])
    
    inline def setMsSinceEpochNull: Self = StObject.set(x, "msSinceEpoch", null)
    
    inline def setMsSinceEpochUndefined: Self = StObject.set(x, "msSinceEpoch", js.undefined)
  }
}
