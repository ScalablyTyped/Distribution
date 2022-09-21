package typings.expoConfigPlugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonCodeModMod {
  
  @JSImport("@expo/config-plugins/build/utils/commonCodeMod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def insertContentsAtOffset(srcContents: String, insertion: String, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("insertContentsAtOffset")(srcContents.asInstanceOf[js.Any], insertion.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def replaceContentsWithOffset(contents: String, replacement: String, startOffset: Double, endOffset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceContentsWithOffset")(contents.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], startOffset.asInstanceOf[js.Any], endOffset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def searchFromOffset(source: String, regexp: js.RegExp, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("searchFromOffset")(source.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait CodeBlock extends StObject {
    
    var code: String
    
    var end: Double
    
    var start: Double
  }
  object CodeBlock {
    
    inline def apply(code: String, end: Double, start: Double): CodeBlock = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeBlock]
    }
    
    extension [Self <: CodeBlock](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
