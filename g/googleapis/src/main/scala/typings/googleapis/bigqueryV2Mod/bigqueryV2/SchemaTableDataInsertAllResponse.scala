package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTableDataInsertAllResponse extends StObject {
  
  /**
    * An array of errors for rows that were not inserted.
    */
  var insertErrors: js.UndefOr[js.Array[Errors]] = js.native
  
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaTableDataInsertAllResponse {
  
  @scala.inline
  def apply(): SchemaTableDataInsertAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableDataInsertAllResponse]
  }
  
  @scala.inline
  implicit class SchemaTableDataInsertAllResponseMutableBuilder[Self <: SchemaTableDataInsertAllResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertErrors(value: js.Array[Errors]): Self = StObject.set(x, "insertErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertErrorsUndefined: Self = StObject.set(x, "insertErrors", js.undefined)
    
    @scala.inline
    def setInsertErrorsVarargs(value: Errors*): Self = StObject.set(x, "insertErrors", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
