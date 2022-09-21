package typings.diff2html

import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import typings.diff2html.typesMod.OutputFormatType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: String
    
    var prefix: String
  }
  object Content {
    
    inline def apply(content: String, prefix: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiffStyle extends StObject {
    
    var diffStyle: DiffStyleType
    
    var drawFileList: Boolean
    
    var fileContentToggle: Boolean
    
    var fileListStartVisible: Boolean
    
    var fileListToggle: Boolean
    
    var highlight: Boolean
    
    var matchWordsThreshold: Double
    
    var matching: LineMatchingType
    
    var matchingMaxComparisons: Double
    
    var maxLineLengthHighlight: Double
    
    var maxLineSizeInBlockForComparison: Double
    
    var outputFormat: OutputFormatType
    
    var renderNothingWhenEmpty: Boolean
    
    var smartSelection: Boolean
    
    var synchronisedScroll: Boolean
  }
  object DiffStyle {
    
    inline def apply(
      diffStyle: DiffStyleType,
      drawFileList: Boolean,
      fileContentToggle: Boolean,
      fileListStartVisible: Boolean,
      fileListToggle: Boolean,
      highlight: Boolean,
      matchWordsThreshold: Double,
      matching: LineMatchingType,
      matchingMaxComparisons: Double,
      maxLineLengthHighlight: Double,
      maxLineSizeInBlockForComparison: Double,
      outputFormat: OutputFormatType,
      renderNothingWhenEmpty: Boolean,
      smartSelection: Boolean,
      synchronisedScroll: Boolean
    ): DiffStyle = {
      val __obj = js.Dynamic.literal(diffStyle = diffStyle.asInstanceOf[js.Any], drawFileList = drawFileList.asInstanceOf[js.Any], fileContentToggle = fileContentToggle.asInstanceOf[js.Any], fileListStartVisible = fileListStartVisible.asInstanceOf[js.Any], fileListToggle = fileListToggle.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], matchWordsThreshold = matchWordsThreshold.asInstanceOf[js.Any], matching = matching.asInstanceOf[js.Any], matchingMaxComparisons = matchingMaxComparisons.asInstanceOf[js.Any], maxLineLengthHighlight = maxLineLengthHighlight.asInstanceOf[js.Any], maxLineSizeInBlockForComparison = maxLineSizeInBlockForComparison.asInstanceOf[js.Any], outputFormat = outputFormat.asInstanceOf[js.Any], renderNothingWhenEmpty = renderNothingWhenEmpty.asInstanceOf[js.Any], smartSelection = smartSelection.asInstanceOf[js.Any], synchronisedScroll = synchronisedScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffStyle]
    }
    
    extension [Self <: DiffStyle](x: Self) {
      
      inline def setDiffStyle(value: DiffStyleType): Self = StObject.set(x, "diffStyle", value.asInstanceOf[js.Any])
      
      inline def setDrawFileList(value: Boolean): Self = StObject.set(x, "drawFileList", value.asInstanceOf[js.Any])
      
      inline def setFileContentToggle(value: Boolean): Self = StObject.set(x, "fileContentToggle", value.asInstanceOf[js.Any])
      
      inline def setFileListStartVisible(value: Boolean): Self = StObject.set(x, "fileListStartVisible", value.asInstanceOf[js.Any])
      
      inline def setFileListToggle(value: Boolean): Self = StObject.set(x, "fileListToggle", value.asInstanceOf[js.Any])
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setMatchWordsThreshold(value: Double): Self = StObject.set(x, "matchWordsThreshold", value.asInstanceOf[js.Any])
      
      inline def setMatching(value: LineMatchingType): Self = StObject.set(x, "matching", value.asInstanceOf[js.Any])
      
      inline def setMatchingMaxComparisons(value: Double): Self = StObject.set(x, "matchingMaxComparisons", value.asInstanceOf[js.Any])
      
      inline def setMaxLineLengthHighlight(value: Double): Self = StObject.set(x, "maxLineLengthHighlight", value.asInstanceOf[js.Any])
      
      inline def setMaxLineSizeInBlockForComparison(value: Double): Self = StObject.set(x, "maxLineSizeInBlockForComparison", value.asInstanceOf[js.Any])
      
      inline def setOutputFormat(value: OutputFormatType): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setRenderNothingWhenEmpty(value: Boolean): Self = StObject.set(x, "renderNothingWhenEmpty", value.asInstanceOf[js.Any])
      
      inline def setSmartSelection(value: Boolean): Self = StObject.set(x, "smartSelection", value.asInstanceOf[js.Any])
      
      inline def setSynchronisedScroll(value: Boolean): Self = StObject.set(x, "synchronisedScroll", value.asInstanceOf[js.Any])
    }
  }
}
