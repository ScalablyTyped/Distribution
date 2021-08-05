package typings.gatsbyPluginUtils

import org.scalablytyped.runtime.Shortcut
import typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ObjectSchema
import typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.PluginOptionsSchemaJoi
import typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ValidationError
import typings.gatsbyPluginUtils.testPluginOptionsSchemaMod.ITestPluginOptionsSchemaReturnType
import typings.gatsbyPluginUtils.typesMod.IPluginInfoOptions
import typings.gatsbyPluginUtils.validateMod.IOptions
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-plugin-utils/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Joi extends Shortcut {
    
    @JSImport("gatsby-plugin-utils/dist", "Joi")
    @js.native
    val ^ : PluginOptionsSchemaJoi = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("gatsby-plugin-utils/dist", "Joi.ValidationError")
    @js.native
    class ValidationErrorCls protected ()
      extends StObject
         with ValidationError {
      def this(message: String, details: js.Any, original: js.Any) = this()
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
    }
    
    type _To = PluginOptionsSchemaJoi
    
    /* This means you don't have to write `^`, but can instead just say `Joi.foo` */
    override def _to: PluginOptionsSchemaJoi = ^
  }
  
  inline def testPluginOptionsSchema_pluginOptionsSchema(
    pluginSchemaFunction: Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GatsbyNode * / any['pluginOptionsSchema'] */ js.Any, 
      Unit
    ],
    pluginOptions: IPluginInfoOptions
  ): js.Promise[ITestPluginOptionsSchemaReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("testPluginOptionsSchema")(pluginSchemaFunction.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ITestPluginOptionsSchemaReturnType]]
  
  inline def validateOptionsSchema(pluginSchema: ObjectSchema[js.Any], pluginOptions: IPluginInfoOptions): js.Promise[IPluginInfoOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOptionsSchema")(pluginSchema.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IPluginInfoOptions]]
  inline def validateOptionsSchema(pluginSchema: ObjectSchema[js.Any], pluginOptions: IPluginInfoOptions, options: IOptions): js.Promise[IPluginInfoOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOptionsSchema")(pluginSchema.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IPluginInfoOptions]]
}
