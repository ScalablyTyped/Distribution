package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntArray extends StObject {
  
  /**
    * Elements in the int array.
    */
  var elements: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaIntArray {
  
  inline def apply(): SchemaIntArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntArray]
  }
  
  extension [Self <: SchemaIntArray](x: Self) {
    
    inline def setElements(value: js.Array[String]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsNull: Self = StObject.set(x, "elements", null)
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: String*): Self = StObject.set(x, "elements", js.Array(value*))
  }
}
