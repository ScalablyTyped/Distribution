package typings.diff2html.Diff2HtmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diff2Html extends js.Object {
  def getJsonFromDiff(input: String): js.Array[Result] = js.native
  def getJsonFromDiff(input: String, configuration: Options): js.Array[Result] = js.native
  def getPrettyHtml(input: js.Any): String = js.native
  def getPrettyHtml(input: js.Any, configuration: Options): String = js.native
}

