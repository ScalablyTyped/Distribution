package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationsScopedList extends StObject {
  
  /**
    * [Output Only] A list of operations contained in this scope.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of operations when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaOperationsScopedList {
  
  inline def apply(): SchemaOperationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationsScopedList]
  }
  
  extension [Self <: SchemaOperationsScopedList](x: Self) {
    
    inline def setOperations(value: js.Array[SchemaOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: SchemaOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
