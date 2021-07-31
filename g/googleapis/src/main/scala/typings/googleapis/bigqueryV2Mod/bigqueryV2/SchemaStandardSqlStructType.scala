package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStandardSqlStructType extends StObject {
  
  var fields: js.UndefOr[js.Array[SchemaStandardSqlField]] = js.undefined
}
object SchemaStandardSqlStructType {
  
  @scala.inline
  def apply(): SchemaStandardSqlStructType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardSqlStructType]
  }
  
  @scala.inline
  implicit class SchemaStandardSqlStructTypeMutableBuilder[Self <: SchemaStandardSqlStructType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[SchemaStandardSqlField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SchemaStandardSqlField*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
