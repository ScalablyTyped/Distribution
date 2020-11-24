package typings.diff2html.mod

import typings.diff2html.typesMod.DiffFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff2html", "parse")
@js.native
object parse extends js.Object {
  
  def apply(diffInput: String): js.Array[DiffFile] = js.native
  def apply(diffInput: String, configuration: Diff2HtmlConfig): js.Array[DiffFile] = js.native
}
