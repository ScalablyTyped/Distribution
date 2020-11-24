package typings.diff2html.renderUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff2html/lib/render-utils", "diffHighlight")
@js.native
object diffHighlight extends js.Object {
  
  def apply(diffLine1: String, diffLine2: String, isCombined: Boolean): HighlightedLines = js.native
  def apply(diffLine1: String, diffLine2: String, isCombined: Boolean, config: RenderConfig): HighlightedLines = js.native
}
