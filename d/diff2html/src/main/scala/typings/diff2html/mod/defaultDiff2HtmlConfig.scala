package typings.diff2html.mod

import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import typings.diff2html.typesMod.OutputFormatType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff2html", "defaultDiff2HtmlConfig")
@js.native
object defaultDiff2HtmlConfig extends js.Object {
  
  var diffStyle: DiffStyleType = js.native
  
  var drawFileList: Boolean = js.native
  
  var matchWordsThreshold: Double = js.native
  
  var matching: LineMatchingType = js.native
  
  var matchingMaxComparisons: Double = js.native
  
  var maxLineLengthHighlight: Double = js.native
  
  var maxLineSizeInBlockForComparison: Double = js.native
  
  var outputFormat: OutputFormatType = js.native
  
  var renderNothingWhenEmpty: Boolean = js.native
}
