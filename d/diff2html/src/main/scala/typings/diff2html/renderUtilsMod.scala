package typings.diff2html

import typings.diff2html.anon.Content
import typings.diff2html.typesMod.DiffFile
import typings.diff2html.typesMod.DiffFileName
import typings.diff2html.typesMod.DiffLineParts
import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import typings.diff2html.typesMod.LineType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderUtilsMod {
  
  @JSImport("diff2html/lib/render-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deconstructLine(line: String, isCombined: Boolean): DiffLineParts = (^.asInstanceOf[js.Dynamic].applyDynamic("deconstructLine")(line.asInstanceOf[js.Any], isCombined.asInstanceOf[js.Any])).asInstanceOf[DiffLineParts]
  inline def deconstructLine(line: String, isCombined: Boolean, escape: Boolean): DiffLineParts = (^.asInstanceOf[js.Dynamic].applyDynamic("deconstructLine")(line.asInstanceOf[js.Any], isCombined.asInstanceOf[js.Any], escape.asInstanceOf[js.Any])).asInstanceOf[DiffLineParts]
  
  object defaultRenderConfig {
    
    @JSImport("diff2html/lib/render-utils", "defaultRenderConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("diff2html/lib/render-utils", "defaultRenderConfig.diffStyle")
    @js.native
    def diffStyle: DiffStyleType = js.native
    inline def diffStyle_=(x: DiffStyleType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diffStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/render-utils", "defaultRenderConfig.matchWordsThreshold")
    @js.native
    def matchWordsThreshold: Double = js.native
    inline def matchWordsThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchWordsThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/render-utils", "defaultRenderConfig.matching")
    @js.native
    def matching: LineMatchingType = js.native
    inline def matching_=(x: LineMatchingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matching")(x.asInstanceOf[js.Any])
    
    @JSImport("diff2html/lib/render-utils", "defaultRenderConfig.maxLineLengthHighlight")
    @js.native
    def maxLineLengthHighlight: Double = js.native
    inline def maxLineLengthHighlight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxLineLengthHighlight")(x.asInstanceOf[js.Any])
  }
  
  inline def diffHighlight(diffLine1: String, diffLine2: String, isCombined: Boolean): HighlightedLines = (^.asInstanceOf[js.Dynamic].applyDynamic("diffHighlight")(diffLine1.asInstanceOf[js.Any], diffLine2.asInstanceOf[js.Any], isCombined.asInstanceOf[js.Any])).asInstanceOf[HighlightedLines]
  inline def diffHighlight(diffLine1: String, diffLine2: String, isCombined: Boolean, config: RenderConfig): HighlightedLines = (^.asInstanceOf[js.Dynamic].applyDynamic("diffHighlight")(diffLine1.asInstanceOf[js.Any], diffLine2.asInstanceOf[js.Any], isCombined.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[HighlightedLines]
  
  inline def escapeForHtml(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeForHtml")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def filenameDiff(file: DiffFileName): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filenameDiff")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFileIcon(file: DiffFile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileIcon")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getHtmlId(file: DiffFileName): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHtmlId")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toCSSClass(lineType: LineType): CSSLineClass = ^.asInstanceOf[js.Dynamic].applyDynamic("toCSSClass")(lineType.asInstanceOf[js.Any]).asInstanceOf[CSSLineClass]
  
  /* Rewritten from type alias, can be one of: 
    - typings.diff2html.diff2htmlStrings.`d2h-ins`
    - typings.diff2html.diff2htmlStrings.`d2h-del`
    - typings.diff2html.diff2htmlStrings.`d2h-cntx`
    - typings.diff2html.diff2htmlStrings.`d2h-info`
    - typings.diff2html.diff2htmlStrings.`d2h-ins d2h-change`
    - typings.diff2html.diff2htmlStrings.`d2h-del d2h-change`
  */
  trait CSSLineClass extends StObject
  
  trait HighlightedLines extends StObject {
    
    var newLine: Content
    
    var oldLine: Content
  }
  object HighlightedLines {
    
    inline def apply(newLine: Content, oldLine: Content): HighlightedLines = {
      val __obj = js.Dynamic.literal(newLine = newLine.asInstanceOf[js.Any], oldLine = oldLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightedLines]
    }
    
    extension [Self <: HighlightedLines](x: Self) {
      
      inline def setNewLine(value: Content): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      inline def setOldLine(value: Content): Self = StObject.set(x, "oldLine", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderConfig extends StObject {
    
    var diffStyle: js.UndefOr[DiffStyleType] = js.undefined
    
    var matchWordsThreshold: js.UndefOr[Double] = js.undefined
    
    var matching: js.UndefOr[LineMatchingType] = js.undefined
    
    var maxLineLengthHighlight: js.UndefOr[Double] = js.undefined
  }
  object RenderConfig {
    
    inline def apply(): RenderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderConfig]
    }
    
    extension [Self <: RenderConfig](x: Self) {
      
      inline def setDiffStyle(value: DiffStyleType): Self = StObject.set(x, "diffStyle", value.asInstanceOf[js.Any])
      
      inline def setDiffStyleUndefined: Self = StObject.set(x, "diffStyle", js.undefined)
      
      inline def setMatchWordsThreshold(value: Double): Self = StObject.set(x, "matchWordsThreshold", value.asInstanceOf[js.Any])
      
      inline def setMatchWordsThresholdUndefined: Self = StObject.set(x, "matchWordsThreshold", js.undefined)
      
      inline def setMatching(value: LineMatchingType): Self = StObject.set(x, "matching", value.asInstanceOf[js.Any])
      
      inline def setMatchingUndefined: Self = StObject.set(x, "matching", js.undefined)
      
      inline def setMaxLineLengthHighlight(value: Double): Self = StObject.set(x, "maxLineLengthHighlight", value.asInstanceOf[js.Any])
      
      inline def setMaxLineLengthHighlightUndefined: Self = StObject.set(x, "maxLineLengthHighlight", js.undefined)
    }
  }
}
