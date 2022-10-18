package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Position
import typings.expoConfigPlugins.buildUtilsCommonCodeModMod.CodeBlock
import typings.expoConfigPlugins.expoConfigPluginsStrings.head
import typings.expoConfigPlugins.expoConfigPluginsStrings.tail
import typings.expoConfigPlugins.expoConfigPluginsStrings.tailBeforeLastReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosCodeModMod {
  
  @JSImport("@expo/config-plugins/build/ios/codeMod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addObjcImports(source: String, imports: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addObjcImports")(source.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def findObjcFunctionCodeBlock(contents: String, selector: String): CodeBlock | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findObjcFunctionCodeBlock")(contents.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[CodeBlock | Null]
  
  inline def findObjcInterfaceCodeBlock(contents: String, declaration: String): CodeBlock | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findObjcInterfaceCodeBlock")(contents.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any])).asInstanceOf[CodeBlock | Null]
  
  inline def findSwiftFunctionCodeBlock(contents: String, selector: String): CodeBlock | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findSwiftFunctionCodeBlock")(contents.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[CodeBlock | Null]
  
  inline def insertContentsInsideObjcFunctionBlock(srcContents: String, selector: String, insertion: String, options: InsertContentFunctionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContentsInsideObjcFunctionBlock")(srcContents.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], insertion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def insertContentsInsideObjcInterfaceBlock(srcContents: String, declaration: String, insertion: String, options: Position): String = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContentsInsideObjcInterfaceBlock")(srcContents.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any], insertion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def insertContentsInsideSwiftClassBlock(srcContents: String, declaration: String, insertion: String, options: Position): String = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContentsInsideSwiftClassBlock")(srcContents.asInstanceOf[js.Any], declaration.asInstanceOf[js.Any], insertion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def insertContentsInsideSwiftFunctionBlock(srcContents: String, selector: String, insertion: String, options: InsertContentFunctionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContentsInsideSwiftFunctionBlock")(srcContents.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], insertion.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait InsertContentFunctionOptions extends StObject {
    
    var indent: js.UndefOr[Double] = js.undefined
    
    var position: head | tail | tailBeforeLastReturn
  }
  object InsertContentFunctionOptions {
    
    inline def apply(position: head | tail | tailBeforeLastReturn): InsertContentFunctionOptions = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertContentFunctionOptions]
    }
    
    extension [Self <: InsertContentFunctionOptions](x: Self) {
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setPosition(value: head | tail | tailBeforeLastReturn): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
