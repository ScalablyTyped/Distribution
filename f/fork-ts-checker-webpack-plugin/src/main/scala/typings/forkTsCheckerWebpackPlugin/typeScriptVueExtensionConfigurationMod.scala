package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.typeScriptVueExtensionOptionsMod.TypeScriptVueExtensionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptVueExtensionConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/extension/vue/TypeScriptVueExtensionConfiguration", "createTypeScriptVueExtensionConfiguration")
  @js.native
  def createTypeScriptVueExtensionConfiguration(): TypeScriptVueExtensionConfiguration = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/extension/vue/TypeScriptVueExtensionConfiguration", "createTypeScriptVueExtensionConfiguration")
  @js.native
  def createTypeScriptVueExtensionConfiguration(options: TypeScriptVueExtensionOptions): TypeScriptVueExtensionConfiguration = js.native
  
  @js.native
  trait TypeScriptVueExtensionConfiguration extends StObject {
    
    var compiler: String = js.native
    
    var enabled: Boolean = js.native
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
