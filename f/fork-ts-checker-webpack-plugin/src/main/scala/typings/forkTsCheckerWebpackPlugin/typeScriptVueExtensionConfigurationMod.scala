package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.typeScriptVueExtensionOptionsMod.TypeScriptVueExtensionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptVueExtensionConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/extension/vue/TypeScriptVueExtensionConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createTypeScriptVueExtensionConfiguration(): TypeScriptVueExtensionConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeScriptVueExtensionConfiguration")().asInstanceOf[TypeScriptVueExtensionConfiguration]
  @scala.inline
  def createTypeScriptVueExtensionConfiguration(options: TypeScriptVueExtensionOptions): TypeScriptVueExtensionConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeScriptVueExtensionConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[TypeScriptVueExtensionConfiguration]
  
  trait TypeScriptVueExtensionConfiguration extends StObject {
    
    var compiler: String
    
    var enabled: Boolean
  }
  object TypeScriptVueExtensionConfiguration {
    
    @scala.inline
    def apply(compiler: String, enabled: Boolean): TypeScriptVueExtensionConfiguration = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeScriptVueExtensionConfiguration]
    }
    
    @scala.inline
    implicit class TypeScriptVueExtensionConfigurationMutableBuilder[Self <: TypeScriptVueExtensionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
