package typings.develarSchemaUtils

import typings.ajv.distTypesMod.AnySchemaObject
import typings.ajv.distTypesMod.ErrorObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ajv.ErrorObject */ Any
        ]
      ] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ajv.ErrorObject */ Any
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ajv.ErrorObject */ Any)*
      ): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  /* Inlined ajv.ajv.ErrorObject<string, std.Record<string, any>, unknown> & {  children :std.Array<ajv.ajv.ErrorObject<string, std.Record<string, any>, unknown>> | undefined} */
  trait ErrorObjectstringRecordst extends StObject {
    
    var children: js.UndefOr[js.Array[ErrorObject[String, Record[String, Any], Any]]] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var instancePath: String
    
    var keyword: String
    
    var message: js.UndefOr[String] = js.undefined
    
    var params: Record[String, Any]
    
    var parentSchema: js.UndefOr[AnySchemaObject] = js.undefined
    
    var propertyName: js.UndefOr[String] = js.undefined
    
    var schema: js.UndefOr[Any] = js.undefined
    
    var schemaPath: String
  }
  object ErrorObjectstringRecordst {
    
    inline def apply(instancePath: String, keyword: String, params: Record[String, Any], schemaPath: String): ErrorObjectstringRecordst = {
      val __obj = js.Dynamic.literal(instancePath = instancePath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorObjectstringRecordst]
    }
    
    extension [Self <: ErrorObjectstringRecordst](x: Self) {
      
      inline def setChildren(value: js.Array[ErrorObject[String, Record[String, Any], Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (ErrorObject[String, Record[String, Any], Any])*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setInstancePath(value: String): Self = StObject.set(x, "instancePath", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParentSchema(value: AnySchemaObject): Self = StObject.set(x, "parentSchema", value.asInstanceOf[js.Any])
      
      inline def setParentSchemaUndefined: Self = StObject.set(x, "parentSchema", js.undefined)
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}
