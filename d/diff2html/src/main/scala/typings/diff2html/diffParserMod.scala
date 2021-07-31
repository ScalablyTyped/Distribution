package typings.diff2html

import typings.diff2html.typesMod.DiffFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffParserMod {
  
  @JSImport("diff2html/lib/diff-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(diffInput: String): js.Array[DiffFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(diffInput.asInstanceOf[js.Any]).asInstanceOf[js.Array[DiffFile]]
  @scala.inline
  def parse(diffInput: String, config: DiffParserConfig): js.Array[DiffFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(diffInput.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiffFile]]
  
  trait DiffParserConfig extends StObject {
    
    var dstPrefix: js.UndefOr[String] = js.undefined
    
    var srcPrefix: js.UndefOr[String] = js.undefined
  }
  object DiffParserConfig {
    
    @scala.inline
    def apply(): DiffParserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffParserConfig]
    }
    
    @scala.inline
    implicit class DiffParserConfigMutableBuilder[Self <: DiffParserConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDstPrefix(value: String): Self = StObject.set(x, "dstPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDstPrefixUndefined: Self = StObject.set(x, "dstPrefix", js.undefined)
      
      @scala.inline
      def setSrcPrefix(value: String): Self = StObject.set(x, "srcPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcPrefixUndefined: Self = StObject.set(x, "srcPrefix", js.undefined)
    }
  }
}
