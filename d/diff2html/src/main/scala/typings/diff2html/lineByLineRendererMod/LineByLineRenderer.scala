package typings.diff2html.lineByLineRendererMod

import typings.diff2html.rematchMod.MatcherFn
import typings.diff2html.typesMod.DiffBlock
import typings.diff2html.typesMod.DiffFile
import typings.diff2html.typesMod.DiffLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineByLineRenderer extends js.Object {
  
  def applyLineGroupping(block: DiffBlock): DiffLineGroups = js.native
  
  def applyRematchMatching(oldLines: js.Array[DiffLine], newLines: js.Array[DiffLine], matcher: MatcherFn[DiffLine]): js.Array[js.Array[js.Array[DiffLine]]] = js.native
  
  val config: js.Any = js.native
  
  def generateEmptyDiff(): String = js.native
  
  def generateFileHtml(file: DiffFile): String = js.native
  
  def generateLineHtml(): FileHtml = js.native
  def generateLineHtml(oldLine: js.UndefOr[scala.Nothing], newLine: DiffPreparedLine): FileHtml = js.native
  def generateLineHtml(oldLine: DiffPreparedLine): FileHtml = js.native
  def generateLineHtml(oldLine: DiffPreparedLine, newLine: DiffPreparedLine): FileHtml = js.native
  
  def generateSingleLineHtml(): String = js.native
  def generateSingleLineHtml(line: DiffPreparedLine): String = js.native
  
  val hoganUtils: js.Any = js.native
  
  def makeFileDiffHtml(file: DiffFile, diffs: String): String = js.native
  
  def processChangedLines(isCombined: Boolean, oldLines: js.Array[DiffLine], newLines: js.Array[DiffLine]): FileHtml = js.native
  
  def render(diffFiles: js.Array[DiffFile]): String = js.native
}
