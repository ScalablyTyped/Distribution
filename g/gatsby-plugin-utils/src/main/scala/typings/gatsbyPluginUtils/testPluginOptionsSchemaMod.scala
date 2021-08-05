package typings.gatsbyPluginUtils

import typings.gatsbyPluginUtils.typesMod.IPluginInfoOptions
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testPluginOptionsSchemaMod {
  
  @JSImport("gatsby-plugin-utils/dist/test-plugin-options-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testPluginOptionsSchema_pluginOptionsSchema(
    pluginSchemaFunction: Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GatsbyNode * / any['pluginOptionsSchema'] */ js.Any, 
      Unit
    ],
    pluginOptions: IPluginInfoOptions
  ): js.Promise[ITestPluginOptionsSchemaReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("testPluginOptionsSchema")(pluginSchemaFunction.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ITestPluginOptionsSchemaReturnType]]
  
  trait ITestPluginOptionsSchemaReturnType extends StObject {
    
    var errors: js.Array[String]
    
    var isValid: Boolean
  }
  object ITestPluginOptionsSchemaReturnType {
    
    inline def apply(errors: js.Array[String], isValid: Boolean): ITestPluginOptionsSchemaReturnType = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestPluginOptionsSchemaReturnType]
    }
    
    extension [Self <: ITestPluginOptionsSchemaReturnType](x: Self) {
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
}
