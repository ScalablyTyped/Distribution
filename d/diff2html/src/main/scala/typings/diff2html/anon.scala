package typings.diff2html

import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import typings.diff2html.typesMod.OutputFormatType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Content extends StObject {
    
    var content: String = js.native
    
    var prefix: String = js.native
  }
  object Content {
    
    @scala.inline
    def apply(content: String, prefix: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DiffStyle extends StObject {
    
    var diffStyle: DiffStyleType = js.native
    
    var drawFileList: Boolean = js.native
    
    var fileListStartVisible: Boolean = js.native
    
    var fileListToggle: Boolean = js.native
    
    var highlight: Boolean = js.native
    
    var matchWordsThreshold: Double = js.native
    
    var matching: LineMatchingType = js.native
    
    var matchingMaxComparisons: Double = js.native
    
    var maxLineLengthHighlight: Double = js.native
    
    var maxLineSizeInBlockForComparison: Double = js.native
    
    var outputFormat: OutputFormatType = js.native
    
    var renderNothingWhenEmpty: Boolean = js.native
    
    var smartSelection: Boolean = js.native
    
    var synchronisedScroll: Boolean = js.native
  }
  object DiffStyle {
    
    @scala.inline
    def apply(
      diffStyle: DiffStyleType,
      drawFileList: Boolean,
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
      val __obj = js.Dynamic.literal(diffStyle = diffStyle.asInstanceOf[js.Any], drawFileList = drawFileList.asInstanceOf[js.Any], fileListStartVisible = fileListStartVisible.asInstanceOf[js.Any], fileListToggle = fileListToggle.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], matchWordsThreshold = matchWordsThreshold.asInstanceOf[js.Any], matching = matching.asInstanceOf[js.Any], matchingMaxComparisons = matchingMaxComparisons.asInstanceOf[js.Any], maxLineLengthHighlight = maxLineLengthHighlight.asInstanceOf[js.Any], maxLineSizeInBlockForComparison = maxLineSizeInBlockForComparison.asInstanceOf[js.Any], outputFormat = outputFormat.asInstanceOf[js.Any], renderNothingWhenEmpty = renderNothingWhenEmpty.asInstanceOf[js.Any], smartSelection = smartSelection.asInstanceOf[js.Any], synchronisedScroll = synchronisedScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffStyle]
    }
    
    @scala.inline
    implicit class DiffStyleMutableBuilder[Self <: DiffStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiffStyle(value: DiffStyleType): Self = StObject.set(x, "diffStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawFileList(value: Boolean): Self = StObject.set(x, "drawFileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListStartVisible(value: Boolean): Self = StObject.set(x, "fileListStartVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListToggle(value: Boolean): Self = StObject.set(x, "fileListToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchWordsThreshold(value: Double): Self = StObject.set(x, "matchWordsThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatching(value: LineMatchingType): Self = StObject.set(x, "matching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchingMaxComparisons(value: Double): Self = StObject.set(x, "matchingMaxComparisons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLineLengthHighlight(value: Double): Self = StObject.set(x, "maxLineLengthHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLineSizeInBlockForComparison(value: Double): Self = StObject.set(x, "maxLineSizeInBlockForComparison", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormat(value: OutputFormatType): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderNothingWhenEmpty(value: Boolean): Self = StObject.set(x, "renderNothingWhenEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartSelection(value: Boolean): Self = StObject.set(x, "smartSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynchronisedScroll(value: Boolean): Self = StObject.set(x, "synchronisedScroll", value.asInstanceOf[js.Any])
    }
  }
}
