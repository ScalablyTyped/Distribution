package typings.develarSchemaUtils

import typings.ajv.mod.ErrorObject
import typings.ajv.mod.ErrorParameters
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
  @scala.inline
  def default(ajv: typings.ajv.mod.Ajv): typings.ajv.mod.Ajv = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ajv.asInstanceOf[js.Any]).asInstanceOf[typings.ajv.mod.Ajv]
  
  type Ajv = typings.ajv.mod.Ajv
  
  trait SchemaUtilErrorObject
    extends StObject
       with ErrorObject {
    
    var children: js.UndefOr[js.Array[ErrorObject]] = js.undefined
  }
  object SchemaUtilErrorObject {
    
    @scala.inline
    def apply(dataPath: String, keyword: String, params: ErrorParameters, schemaPath: String): SchemaUtilErrorObject = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaUtilErrorObject]
    }
    
    @scala.inline
    implicit class SchemaUtilErrorObjectMutableBuilder[Self <: SchemaUtilErrorObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ErrorObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ErrorObject*): Self = StObject.set(x, "children", js.Array(value :_*))
    }
  }
}
