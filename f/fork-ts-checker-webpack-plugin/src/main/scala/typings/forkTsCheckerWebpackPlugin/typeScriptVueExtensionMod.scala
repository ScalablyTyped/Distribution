package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.typeScriptExtensionMod.TypeScriptExtension
import typings.forkTsCheckerWebpackPlugin.typeScriptVueExtensionConfigurationMod.TypeScriptVueExtensionConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptVueExtensionMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/extension/vue/TypeScriptVueExtension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createTypeScriptVueExtension(configuration: TypeScriptVueExtensionConfiguration): TypeScriptExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeScriptVueExtension")(configuration.asInstanceOf[js.Any]).asInstanceOf[TypeScriptExtension]
}
