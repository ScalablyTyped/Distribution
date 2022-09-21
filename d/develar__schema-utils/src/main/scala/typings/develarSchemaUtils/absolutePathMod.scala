package typings.develarSchemaUtils

import typings.ajv.distTypesMod.ErrorObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object absolutePathMod {
  
  @JSImport("@develar/schema-utils/declarations/keywords/absolutePath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param {Ajv} ajv
    * @returns {Ajv}
    */
  inline def default(ajv: typings.ajv.mod.Ajv): typings.ajv.mod.Ajv = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ajv.asInstanceOf[js.Any]).asInstanceOf[typings.ajv.mod.Ajv]
  
  type Ajv = typings.ajv.mod.Ajv
  
  trait SchemaUtilErrorObject
    extends StObject
       with ErrorObject[String, Record[String, Any], Any] {
    
    var children: js.UndefOr[js.Array[ErrorObject[String, Record[String, Any], Any]]] = js.undefined
  }
  object SchemaUtilErrorObject {
    
    inline def apply(instancePath: String, keyword: String, params: Record[String, Any], schemaPath: String): SchemaUtilErrorObject = {
      val __obj = js.Dynamic.literal(instancePath = instancePath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaUtilErrorObject]
    }
    
    extension [Self <: SchemaUtilErrorObject](x: Self) {
      
      inline def setChildren(value: js.Array[ErrorObject[String, Record[String, Any], Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (ErrorObject[String, Record[String, Any], Any])*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
}
