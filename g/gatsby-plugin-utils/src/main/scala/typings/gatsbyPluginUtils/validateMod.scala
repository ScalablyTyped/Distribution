package typings.gatsbyPluginUtils

import typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ObjectSchema
import typings.gatsbyPluginUtils.typesMod.IPluginInfoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("gatsby-plugin-utils/dist/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateOptionsSchema(pluginSchema: ObjectSchema[js.Any], pluginOptions: IPluginInfoOptions): js.Promise[IPluginInfoOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOptionsSchema")(pluginSchema.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IPluginInfoOptions]]
  inline def validateOptionsSchema(pluginSchema: ObjectSchema[js.Any], pluginOptions: IPluginInfoOptions, options: IOptions): js.Promise[IPluginInfoOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOptionsSchema")(pluginSchema.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IPluginInfoOptions]]
  
  trait IOptions extends StObject {
    
    var validateExternalRules: js.UndefOr[Boolean] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setValidateExternalRules(value: Boolean): Self = StObject.set(x, "validateExternalRules", value.asInstanceOf[js.Any])
      
      inline def setValidateExternalRulesUndefined: Self = StObject.set(x, "validateExternalRules", js.undefined)
    }
  }
}
