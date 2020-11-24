package typings.forkTsCheckerWebpackPlugin.typeScriptEmbeddedExtensionMod

import typings.forkTsCheckerWebpackPlugin.typeScriptExtensionMod.TypeScriptExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/extension/TypeScriptEmbeddedExtension", "createTypeScriptEmbeddedExtension")
@js.native
object createTypeScriptEmbeddedExtension extends js.Object {
  
  /**
    * It handles most of the logic required to process embedded TypeScript code (like in Vue components or MDX)
    *
    * @param embeddedExtensions List of file extensions that should be treated as an embedded TypeScript source
    *                           (for example ['.vue'])
    * @param getEmbeddedSource  Function that returns embedded TypeScript source text and extension that this file
    *                           would have if it would be a regular TypeScript file
    */
  def apply(hasEmbeddedExtensionsGetEmbeddedSource: TypeScriptEmbeddedExtensionHost): TypeScriptExtension = js.native
}
