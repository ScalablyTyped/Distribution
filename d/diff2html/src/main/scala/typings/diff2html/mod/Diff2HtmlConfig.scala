package typings.diff2html.mod

import typings.diff2html.diffParserMod.DiffParserConfig
import typings.diff2html.hoganjsUtilsMod.HoganJsUtilsConfig
import typings.diff2html.lineByLineRendererMod.LineByLineRendererConfig
import typings.diff2html.typesMod.OutputFormatType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.diff2html.renderUtilsMod.RenderConfig because Already inherited
- typings.diff2html.sideBySideRendererMod.SideBySideRendererConfig because var conflicts: diffStyle, matchWordsThreshold, matching, matchingMaxComparisons, maxLineLengthHighlight, maxLineSizeInBlockForComparison, renderNothingWhenEmpty. Inlined  */ @js.native
trait Diff2HtmlConfig
  extends LineByLineRendererConfig
     with DiffParserConfig
     with HoganJsUtilsConfig {
  
  var drawFileList: js.UndefOr[Boolean] = js.native
  
  var outputFormat: js.UndefOr[OutputFormatType] = js.native
}
object Diff2HtmlConfig {
  
  @scala.inline
  def apply(): Diff2HtmlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diff2HtmlConfig]
  }
  
  @scala.inline
  implicit class Diff2HtmlConfigOps[Self <: Diff2HtmlConfig] (val x: Self) extends AnyVal {
    
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
    def setDrawFileList(value: Boolean): Self = this.set("drawFileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawFileList: Self = this.set("drawFileList", js.undefined)
    
    @scala.inline
    def setOutputFormat(value: OutputFormatType): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFormat: Self = this.set("outputFormat", js.undefined)
  }
}
