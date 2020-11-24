package typings.diff2html.sideBySideRendererMod

import typings.diff2html.rematchMod.MatcherFn
import typings.diff2html.typesMod.DiffBlock
import typings.diff2html.typesMod.DiffFile
import typings.diff2html.typesMod.DiffLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SideBySideRenderer extends js.Object {
  
  def applyLineGroupping(block: DiffBlock): DiffLineGroups = js.native
  
  def applyRematchMatching(oldLines: js.Array[DiffLine], newLines: js.Array[DiffLine], matcher: MatcherFn[DiffLine]): js.Array[js.Array[js.Array[DiffLine]]] = js.native
  
  val config: js.Any = js.native
  
  def generateEmptyDiff(): FileHtml = js.native
  
  def generateFileHtml(file: DiffFile): FileHtml = js.native
  
  def generateLineHtml(): FileHtml = js.native
  def generateLineHtml(oldLine: js.UndefOr[scala.Nothing], newLine: DiffPreparedLine): FileHtml = js.native
  def generateLineHtml(oldLine: DiffPreparedLine): FileHtml = js.native
  def generateLineHtml(oldLine: DiffPreparedLine, newLine: DiffPreparedLine): FileHtml = js.native
  
  def generateSingleHtml(): String = js.native
  def generateSingleHtml(line: DiffPreparedLine): String = js.native
  
  val hoganUtils: js.Any = js.native
  
  def makeFileDiffHtml(file: DiffFile, diffs: FileHtml): String = js.native
  
  def makeHeaderHtml(blockHeader: String): String = js.native
  
  def processChangedLines(isCombined: Boolean, oldLines: js.Array[DiffLine], newLines: js.Array[DiffLine]): FileHtml = js.native
  
  def render(diffFiles: js.Array[DiffFile]): String = js.native
}
