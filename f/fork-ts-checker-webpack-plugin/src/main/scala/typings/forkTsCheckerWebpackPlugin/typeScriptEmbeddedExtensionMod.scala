package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.Dotjs
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.Dotts
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.Dottsx
import typings.forkTsCheckerWebpackPlugin.typeScriptExtensionMod.TypeScriptExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeScriptEmbeddedExtensionMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/extension/TypeScriptEmbeddedExtension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * It handles most of the logic required to process embedded TypeScript code (like in Vue components or MDX)
    *
    * @param embeddedExtensions List of file extensions that should be treated as an embedded TypeScript source
    *                           (for example ['.vue'])
    * @param getEmbeddedSource  Function that returns embedded TypeScript source text and extension that this file
    *                           would have if it would be a regular TypeScript file
    */
  @scala.inline
  def createTypeScriptEmbeddedExtension(hasEmbeddedExtensionsGetEmbeddedSource: TypeScriptEmbeddedExtensionHost): TypeScriptExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeScriptEmbeddedExtension")(hasEmbeddedExtensionsGetEmbeddedSource.asInstanceOf[js.Any]).asInstanceOf[TypeScriptExtension]
  
  trait TypeScriptEmbeddedExtensionHost extends StObject {
    
    var embeddedExtensions: js.Array[String]
    
    def getEmbeddedSource(fileName: String): js.UndefOr[TypeScriptEmbeddedSource]
  }
  object TypeScriptEmbeddedExtensionHost {
    
    @scala.inline
    def apply(
      embeddedExtensions: js.Array[String],
      getEmbeddedSource: String => js.UndefOr[TypeScriptEmbeddedSource]
    ): TypeScriptEmbeddedExtensionHost = {
      val __obj = js.Dynamic.literal(embeddedExtensions = embeddedExtensions.asInstanceOf[js.Any], getEmbeddedSource = js.Any.fromFunction1(getEmbeddedSource))
      __obj.asInstanceOf[TypeScriptEmbeddedExtensionHost]
    }
    
    @scala.inline
    implicit class TypeScriptEmbeddedExtensionHostMutableBuilder[Self <: TypeScriptEmbeddedExtensionHost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmbeddedExtensions(value: js.Array[String]): Self = StObject.set(x, "embeddedExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbeddedExtensionsVarargs(value: String*): Self = StObject.set(x, "embeddedExtensions", js.Array(value :_*))
      
      @scala.inline
      def setGetEmbeddedSource(value: String => js.UndefOr[TypeScriptEmbeddedSource]): Self = StObject.set(x, "getEmbeddedSource", js.Any.fromFunction1(value))
    }
  }
  
  trait TypeScriptEmbeddedSource extends StObject {
    
    var `extension`: Dotts | Dottsx | Dotjs
    
    var sourceText: String
  }
  object TypeScriptEmbeddedSource {
    
    @scala.inline
    def apply(`extension`: Dotts | Dottsx | Dotjs, sourceText: String): TypeScriptEmbeddedSource = {
      val __obj = js.Dynamic.literal(sourceText = sourceText.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeScriptEmbeddedSource]
    }
    
    @scala.inline
    implicit class TypeScriptEmbeddedSourceMutableBuilder[Self <: TypeScriptEmbeddedSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtension(value: Dotts | Dottsx | Dotjs): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceText(value: String): Self = StObject.set(x, "sourceText", value.asInstanceOf[js.Any])
    }
  }
}
