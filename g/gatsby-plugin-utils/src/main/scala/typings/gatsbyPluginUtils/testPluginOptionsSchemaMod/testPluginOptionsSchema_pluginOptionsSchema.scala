package typings.gatsbyPluginUtils.testPluginOptionsSchemaMod

import typings.gatsbyPluginUtils.typesMod.IPluginInfoOptions
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gatsby-plugin-utils/dist/test-plugin-options-schema", "testPluginOptionsSchema")
@js.native
object testPluginOptionsSchema_pluginOptionsSchema extends js.Object {
  
  def apply(
    pluginSchemaFunction: Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GatsbyNode * / any['pluginOptionsSchema'] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ],
    pluginOptions: IPluginInfoOptions
  ): js.Promise[ITestPluginOptionsSchemaReturnType] = js.native
}
