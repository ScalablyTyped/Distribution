package typings.expoConfigPlugins

import typings.expoConfigPlugins.commonCodeModMod.CodeBlock
import typings.expoConfigPlugins.expoConfigPluginsStrings.java_
import typings.expoConfigPlugins.expoConfigPluginsStrings.kt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeModMod {
  
  @JSImport("@expo/config-plugins/build/android/codeMod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addImports(source: String, imports: js.Array[String], isJava: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addImports")(source.asInstanceOf[js.Any], imports.asInstanceOf[js.Any], isJava.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def appendContentsInsideDeclarationBlock(srcContents: String, declaration: String, insertion: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendContentsInsideDeclarationBlock")(srcContents.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any], insertion.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def findNewInstanceCodeBlock(contents: String, classDeclaration: String, language: java_ | kt): CodeBlock | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findNewInstanceCodeBlock")(contents.asInstanceOf[js.Any], classDeclaration.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[CodeBlock | Null]
}
