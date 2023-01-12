package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libTypescriptExtensionVueTypeScriptVueExtensionOptionsMod.TypeScriptVueExtensionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptExtensionVueTypeScriptVueExtensionConfigMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript/extension/vue/type-script-vue-extension-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTypeScriptVueExtensionConfig(): TypeScriptVueExtensionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeScriptVueExtensionConfig")().asInstanceOf[TypeScriptVueExtensionConfig]
  inline def createTypeScriptVueExtensionConfig(options: TypeScriptVueExtensionOptions): TypeScriptVueExtensionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeScriptVueExtensionConfig")(options.asInstanceOf[js.Any]).asInstanceOf[TypeScriptVueExtensionConfig]
  
  trait TypeScriptVueExtensionConfig extends StObject {
    
    var compiler: String
    
    var enabled: Boolean
  }
  object TypeScriptVueExtensionConfig {
    
    inline def apply(compiler: String, enabled: Boolean): TypeScriptVueExtensionConfig = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeScriptVueExtensionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeScriptVueExtensionConfig] (val x: Self) extends AnyVal {
      
      inline def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
