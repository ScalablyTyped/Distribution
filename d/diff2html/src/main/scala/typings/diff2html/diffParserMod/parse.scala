package typings.diff2html.diffParserMod

import typings.diff2html.typesMod.DiffFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff2html/lib/diff-parser", "parse")
@js.native
object parse extends js.Object {
  
  def apply(diffInput: String): js.Array[DiffFile] = js.native
  def apply(diffInput: String, config: DiffParserConfig): js.Array[DiffFile] = js.native
}
