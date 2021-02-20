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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Joi extends Shortcut {
    
    @JSImport("gatsby-plugin-utils/dist", "Joi")
    @js.native
    val ^ : PluginOptionsSchemaJoi = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("gatsby-plugin-utils/dist", "Joi.ValidationError")
    @js.native
    class ValidationErrorCls protected () extends ValidationError {
      def this(message: String, details: js.Any, original: js.Any) = this()
    }
    
    type _To = PluginOptionsSchemaJoi
    
    /* This means you don't have to write `^`, but can instead just say `Joi.foo` */
    override def _to: PluginOptionsSchemaJoi = ^
  }
  
  @JSImport("gatsby-plugin-utils/dist", "testPluginOptionsSchema")
  @js.native
  def testPluginOptionsSchema_pluginOptionsSchema(
    pluginSchemaFunction: Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GatsbyNode * / any['pluginOptionsSchema'] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ],
    pluginOptions: IPluginInfoOptions
  ): js.Promise[ITestPluginOptionsSchemaReturnType] = js.native
  
  @JSImport("gatsby-plugin-utils/dist", "validateOptionsSchema")
  @js.native
  def validateOptionsSchema(pluginSchema: ObjectSchema[_], pluginOptions: IPluginInfoOptions): js.Promise[IPluginInfoOptions] = js.native
  @JSImport("gatsby-plugin-utils/dist", "validateOptionsSchema")
  @js.native
  def validateOptionsSchema(pluginSchema: ObjectSchema[_], pluginOptions: IPluginInfoOptions, options: IOptions): js.Promise[IPluginInfoOptions] = js.native
}
