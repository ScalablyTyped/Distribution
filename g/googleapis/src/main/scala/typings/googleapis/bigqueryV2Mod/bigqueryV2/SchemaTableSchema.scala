package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTableSchema extends StObject {
  
  /**
    * Describes the fields in a table.
    */
  var fields: js.UndefOr[js.Array[SchemaTableFieldSchema]] = js.native
}
object SchemaTableSchema {
  
  @scala.inline
  def apply(): SchemaTableSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableSchema]
  }
  
  @scala.inline
  implicit class SchemaTableSchemaMutableBuilder[Self <: SchemaTableSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[SchemaTableFieldSchema]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaTableFieldSchema*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
