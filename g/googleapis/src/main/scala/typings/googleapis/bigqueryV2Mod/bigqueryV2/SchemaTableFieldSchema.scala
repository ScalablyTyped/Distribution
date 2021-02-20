package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.Names
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTableFieldSchema extends StObject {
  
  /**
    * [Optional] The categories attached to this field, used for field-level
    * access control.
    */
  var categories: js.UndefOr[Names] = js.native
  
  /**
    * [Optional] The field description. The maximum length is 1,024 characters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Optional] Describes the nested schema fields if the type property is set
    * to RECORD.
    */
  var fields: js.UndefOr[js.Array[SchemaTableFieldSchema]] = js.native
  
  /**
    * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and
    * REPEATED. The default value is NULLABLE.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * [Required] The field name. The name must contain only letters (a-z, A-Z),
    * numbers (0-9), or underscores (_), and must start with a letter or
    * underscore. The maximum length is 128 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Required] The field data type. Possible values include STRING, BYTES,
    * INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT),
    * BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, RECORD
    * (where RECORD indicates that the field contains a nested schema) or
    * STRUCT (same as RECORD).
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaTableFieldSchema {
  
  @scala.inline
  def apply(): SchemaTableFieldSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableFieldSchema]
  }
  
  @scala.inline
  implicit class SchemaTableFieldSchemaMutableBuilder[Self <: SchemaTableFieldSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: Names): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[SchemaTableFieldSchema]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaTableFieldSchema*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
