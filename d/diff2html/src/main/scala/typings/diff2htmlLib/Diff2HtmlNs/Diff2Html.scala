package typings
package diff2htmlLib.Diff2HtmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diff2Html extends js.Object {
  def getJsonFromDiff(input: java.lang.String): js.Array[Result] = js.native
  def getJsonFromDiff(input: java.lang.String, configuration: Options): js.Array[Result] = js.native
  def getPrettyHtml(input: js.Any): java.lang.String = js.native
  def getPrettyHtml(input: js.Any, configuration: Options): java.lang.String = js.native
  def getPrettyHtmlFromJson(input: js.Array[Result]): java.lang.String = js.native
  def getPrettyHtmlFromJson(input: js.Array[Result], configuration: Options): java.lang.String = js.native
}

