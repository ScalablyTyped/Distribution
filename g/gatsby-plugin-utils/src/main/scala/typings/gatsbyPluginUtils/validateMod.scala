package typings.gatsbyPluginUtils

import typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ObjectSchema
import typings.gatsbyPluginUtils.typesMod.IPluginInfoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("gatsby-plugin-utils/dist/validate", "validateOptionsSchema")
  @js.native
  def validateOptionsSchema(pluginSchema: ObjectSchema[_], pluginOptions: IPluginInfoOptions): js.Promise[IPluginInfoOptions] = js.native
  @JSImport("gatsby-plugin-utils/dist/validate", "validateOptionsSchema")
  @js.native
  def validateOptionsSchema(pluginSchema: ObjectSchema[_], pluginOptions: IPluginInfoOptions, options: IOptions): js.Promise[IPluginInfoOptions] = js.native
  
  @js.native
  trait IOptions extends StObject {
    
    var validateExternalRules: js.UndefOr[Boolean] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidateExternalRules(value: Boolean): Self = StObject.set(x, "validateExternalRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateExternalRulesUndefined: Self = StObject.set(x, "validateExternalRules", js.undefined)
    }
  }
}
