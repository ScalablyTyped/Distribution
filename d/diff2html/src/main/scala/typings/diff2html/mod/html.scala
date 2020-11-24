package typings.diff2html.mod

import typings.diff2html.typesMod.DiffFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff2html", "html")
@js.native
object html extends js.Object {
  
  def apply(diffInput: String): String = js.native
  def apply(diffInput: String, configuration: Diff2HtmlConfig): String = js.native
  def apply(diffInput: js.Array[DiffFile]): String = js.native
  def apply(diffInput: js.Array[DiffFile], configuration: Diff2HtmlConfig): String = js.native
}
