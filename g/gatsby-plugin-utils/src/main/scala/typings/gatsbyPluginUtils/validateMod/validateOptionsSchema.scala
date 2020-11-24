package typings.gatsbyPluginUtils.validateMod

import typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ObjectSchema
import typings.gatsbyPluginUtils.typesMod.IPluginInfoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gatsby-plugin-utils/dist/validate", "validateOptionsSchema")
@js.native
object validateOptionsSchema extends js.Object {
  
  def apply(pluginSchema: ObjectSchema[_], pluginOptions: IPluginInfoOptions): js.Promise[IPluginInfoOptions] = js.native
  def apply(pluginSchema: ObjectSchema[_], pluginOptions: IPluginInfoOptions, options: IOptions): js.Promise[IPluginInfoOptions] = js.native
}
