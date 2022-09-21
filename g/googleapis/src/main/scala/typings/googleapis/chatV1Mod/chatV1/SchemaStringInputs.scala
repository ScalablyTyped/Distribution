package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStringInputs extends StObject {
  
  /**
    * An array of strings entered by the user.
    */
  var value: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaStringInputs {
  
  inline def apply(): SchemaStringInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringInputs]
  }
  
  extension [Self <: SchemaStringInputs](x: Self) {
    
    inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
