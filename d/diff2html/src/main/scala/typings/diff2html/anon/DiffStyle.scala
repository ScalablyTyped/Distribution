package typings.diff2html.anon

import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import typings.diff2html.typesMod.OutputFormatType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffStyle extends js.Object {
  
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
  implicit class DiffStyleOps[Self <: DiffStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDiffStyle(value: DiffStyleType): Self = this.set("diffStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawFileList(value: Boolean): Self = this.set("drawFileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListStartVisible(value: Boolean): Self = this.set("fileListStartVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileListToggle(value: Boolean): Self = this.set("fileListToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchWordsThreshold(value: Double): Self = this.set("matchWordsThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatching(value: LineMatchingType): Self = this.set("matching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingMaxComparisons(value: Double): Self = this.set("matchingMaxComparisons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLineLengthHighlight(value: Double): Self = this.set("maxLineLengthHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLineSizeInBlockForComparison(value: Double): Self = this.set("maxLineSizeInBlockForComparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFormat(value: OutputFormatType): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderNothingWhenEmpty(value: Boolean): Self = this.set("renderNothingWhenEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartSelection(value: Boolean): Self = this.set("smartSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronisedScroll(value: Boolean): Self = this.set("synchronisedScroll", value.asInstanceOf[js.Any])
  }
}
