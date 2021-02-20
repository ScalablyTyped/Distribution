package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type of a variable, e.g., a function argument. Examples: INT64:
  * {type_kind=&quot;INT64&quot;} ARRAY&lt;STRING&gt;:
  * {type_kind=&quot;ARRAY&quot;, array_element_type=&quot;STRING&quot;}
  * STRUCT&lt;x STRING, y ARRAY&lt;DATE&gt;&gt;: {type_kind=&quot;STRUCT&quot;,
  * struct_type={fields=[      {name=&quot;x&quot;,
  * type={type_kind=&quot;STRING&quot;}},      {name=&quot;y&quot;,
  * type={type_kind=&quot;ARRAY&quot;, array_element_type=&quot;DATE&quot;}}
  * ]}}
  */
@js.native
trait SchemaStandardSqlDataType extends StObject {
  
  /**
    * The type of the array&#39;s elements, if type_kind = &quot;ARRAY&quot;.
    */
  var arrayElementType: js.UndefOr[SchemaStandardSqlDataType] = js.native
  
  /**
    * The fields of this struct, in order, if type_kind = &quot;STRUCT&quot;.
    */
  var structType: js.UndefOr[SchemaStandardSqlStructType] = js.native
  
  /**
    * Required. The top level type of this field. Can be any standard SQL data
    * type (e.g., &quot;INT64&quot;, &quot;DATE&quot;, &quot;ARRAY&quot;).
    */
  var typeKind: js.UndefOr[String] = js.native
}
object SchemaStandardSqlDataType {
  
  @scala.inline
  def apply(): SchemaStandardSqlDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardSqlDataType]
  }
  
  @scala.inline
  implicit class SchemaStandardSqlDataTypeMutableBuilder[Self <: SchemaStandardSqlDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayElementType(value: SchemaStandardSqlDataType): Self = StObject.set(x, "arrayElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayElementTypeUndefined: Self = StObject.set(x, "arrayElementType", js.undefined)
    
    @scala.inline
    def setStructType(value: SchemaStandardSqlStructType): Self = StObject.set(x, "structType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructTypeUndefined: Self = StObject.set(x, "structType", js.undefined)
    
    @scala.inline
    def setTypeKind(value: String): Self = StObject.set(x, "typeKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeKindUndefined: Self = StObject.set(x, "typeKind", js.undefined)
  }
}
