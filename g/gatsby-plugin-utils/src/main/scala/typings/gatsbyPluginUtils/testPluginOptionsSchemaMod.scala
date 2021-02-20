package typings.gatsbyPluginUtils

import typings.gatsbyPluginUtils.typesMod.IPluginInfoOptions
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testPluginOptionsSchemaMod {
  
  @JSImport("gatsby-plugin-utils/dist/test-plugin-options-schema", "testPluginOptionsSchema")
  @js.native
  def testPluginOptionsSchema_pluginOptionsSchema(
    pluginSchemaFunction: Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GatsbyNode * / any['pluginOptionsSchema'] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ],
    pluginOptions: IPluginInfoOptions
  ): js.Promise[ITestPluginOptionsSchemaReturnType] = js.native
  
  @js.native
  trait ITestPluginOptionsSchemaReturnType extends StObject {
    
    var errors: js.Array[String] = js.native
    
    var isValid: Boolean = js.native
  }
  object ITestPluginOptionsSchemaReturnType {
    
    @scala.inline
    def apply(errors: js.Array[String], isValid: Boolean): ITestPluginOptionsSchemaReturnType = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITestPluginOptionsSchemaReturnType]
    }
    
    @scala.inline
    implicit class ITestPluginOptionsSchemaReturnTypeMutableBuilder[Self <: ITestPluginOptionsSchemaReturnType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
}
