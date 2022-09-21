package typings.diff2html

import typings.diff2html.typesMod.DiffFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffParserMod {
  
  @JSImport("diff2html/lib/diff-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(diffInput: String): js.Array[DiffFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(diffInput.asInstanceOf[js.Any]).asInstanceOf[js.Array[DiffFile]]
  inline def parse(diffInput: String, config: DiffParserConfig): js.Array[DiffFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(diffInput.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiffFile]]
  
  trait DiffParserConfig extends StObject {
    
    var diffMaxChanges: js.UndefOr[Double] = js.undefined
    
    var diffMaxLineLength: js.UndefOr[Double] = js.undefined
    
    var diffTooBigMessage: js.UndefOr[js.Function1[/* fileIndex */ Double, String]] = js.undefined
    
    var dstPrefix: js.UndefOr[String] = js.undefined
    
    var srcPrefix: js.UndefOr[String] = js.undefined
  }
  object DiffParserConfig {
    
    inline def apply(): DiffParserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffParserConfig]
    }
    
    extension [Self <: DiffParserConfig](x: Self) {
      
      inline def setDiffMaxChanges(value: Double): Self = StObject.set(x, "diffMaxChanges", value.asInstanceOf[js.Any])
      
      inline def setDiffMaxChangesUndefined: Self = StObject.set(x, "diffMaxChanges", js.undefined)
      
      inline def setDiffMaxLineLength(value: Double): Self = StObject.set(x, "diffMaxLineLength", value.asInstanceOf[js.Any])
      
      inline def setDiffMaxLineLengthUndefined: Self = StObject.set(x, "diffMaxLineLength", js.undefined)
      
      inline def setDiffTooBigMessage(value: /* fileIndex */ Double => String): Self = StObject.set(x, "diffTooBigMessage", js.Any.fromFunction1(value))
      
      inline def setDiffTooBigMessageUndefined: Self = StObject.set(x, "diffTooBigMessage", js.undefined)
      
      inline def setDstPrefix(value: String): Self = StObject.set(x, "dstPrefix", value.asInstanceOf[js.Any])
      
      inline def setDstPrefixUndefined: Self = StObject.set(x, "dstPrefix", js.undefined)
      
      inline def setSrcPrefix(value: String): Self = StObject.set(x, "srcPrefix", value.asInstanceOf[js.Any])
      
      inline def setSrcPrefixUndefined: Self = StObject.set(x, "srcPrefix", js.undefined)
    }
  }
}
