package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableDataInsertAllResponse extends StObject {
  
  /**
    * An array of errors for rows that were not inserted.
    */
  var insertErrors: js.UndefOr[js.Array[Errors] | Null] = js.undefined
  
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaTableDataInsertAllResponse {
  
  inline def apply(): SchemaTableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableDataInsertAllResponse]
  }
  
  extension [Self <: SchemaTableDataInsertAllResponse](x: Self) {
    
    inline def setInsertErrors(value: js.Array[Errors]): Self = StObject.set(x, "insertErrors", value.asInstanceOf[js.Any])
    
    inline def setInsertErrorsNull: Self = StObject.set(x, "insertErrors", null)
    
    inline def setInsertErrorsUndefined: Self = StObject.set(x, "insertErrors", js.undefined)
    
    inline def setInsertErrorsVarargs(value: Errors*): Self = StObject.set(x, "insertErrors", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
