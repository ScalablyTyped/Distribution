package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Anchor
import typings.expoConfigPlugins.anon.Src
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsGenerateCodeMod {
  
  @JSImport("@expo/config-plugins/build/utils/generateCode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createGeneratedHeaderComment(contents: String, tag: String, comment: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createGeneratedHeaderComment")(contents.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createHash(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mergeContents(param0: Anchor): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeContents")(param0.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
  
  inline def removeContents(param0: Src): MergeResults = ^.asInstanceOf[js.Dynamic].applyDynamic("removeContents")(param0.asInstanceOf[js.Any]).asInstanceOf[MergeResults]
  
  inline def removeGeneratedContents(src: String, tag: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("removeGeneratedContents")(src.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  trait MergeResults extends StObject {
    
    var contents: String
    
    var didClear: Boolean
    
    var didMerge: Boolean
  }
  object MergeResults {
    
    inline def apply(contents: String, didClear: Boolean, didMerge: Boolean): MergeResults = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], didClear = didClear.asInstanceOf[js.Any], didMerge = didMerge.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeResults]
    }
    
    extension [Self <: MergeResults](x: Self) {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setDidClear(value: Boolean): Self = StObject.set(x, "didClear", value.asInstanceOf[js.Any])
      
      inline def setDidMerge(value: Boolean): Self = StObject.set(x, "didMerge", value.asInstanceOf[js.Any])
    }
  }
}
