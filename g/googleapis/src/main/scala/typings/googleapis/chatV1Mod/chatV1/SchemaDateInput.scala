package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDateInput extends StObject {
  
  /**
    * Time since epoch time, in milliseconds.
    */
  var msSinceEpoch: js.UndefOr[String | Null] = js.undefined
}
object SchemaDateInput {
  
  inline def apply(): SchemaDateInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateInput]
  }
  
  extension [Self <: SchemaDateInput](x: Self) {
    
    inline def setMsSinceEpoch(value: String): Self = StObject.set(x, "msSinceEpoch", value.asInstanceOf[js.Any])
    
    inline def setMsSinceEpochNull: Self = StObject.set(x, "msSinceEpoch", null)
    
    inline def setMsSinceEpochUndefined: Self = StObject.set(x, "msSinceEpoch", js.undefined)
  }
}
