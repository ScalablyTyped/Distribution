package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A field or a column.
  */
trait SchemaStandardSqlField extends StObject {
  
  /**
    * Optional. The name of this field. Can be absent for struct fields.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The type of this parameter. Absent if not explicitly specified
    * (e.g., CREATE FUNCTION statement can omit the return type; in this case
    * the output parameter does not have this &quot;type&quot; field).
    */
  var `type`: js.UndefOr[SchemaStandardSqlDataType] = js.undefined
}
object SchemaStandardSqlField {
  
  @scala.inline
  def apply(): SchemaStandardSqlField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardSqlField]
  }
  
  @scala.inline
  implicit class SchemaStandardSqlFieldMutableBuilder[Self <: SchemaStandardSqlField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: SchemaStandardSqlDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
