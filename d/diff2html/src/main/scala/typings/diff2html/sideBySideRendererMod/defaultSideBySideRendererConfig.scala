package typings.diff2html.sideBySideRendererMod

import typings.diff2html.typesMod.DiffStyleType
import typings.diff2html.typesMod.LineMatchingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff2html/lib/side-by-side-renderer", "defaultSideBySideRendererConfig")
@js.native
object defaultSideBySideRendererConfig extends js.Object {
  
  var diffStyle: DiffStyleType = js.native
  
  var matchWordsThreshold: Double = js.native
  
  var matching: LineMatchingType = js.native
  
  var matchingMaxComparisons: Double = js.native
  
  var maxLineLengthHighlight: Double = js.native
  
  var maxLineSizeInBlockForComparison: Double = js.native
  
  var renderNothingWhenEmpty: Boolean = js.native
}
