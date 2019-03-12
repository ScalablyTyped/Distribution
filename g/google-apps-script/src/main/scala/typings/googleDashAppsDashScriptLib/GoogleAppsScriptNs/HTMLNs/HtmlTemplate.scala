package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlTemplate extends js.Object {
  def evaluate(): HtmlOutput
  def getCode(): java.lang.String
  def getCodeWithComments(): java.lang.String
  def getRawContent(): java.lang.String
}

object HtmlTemplate {
  @scala.inline
  def apply(
    evaluate: () => HtmlOutput,
    getCode: () => java.lang.String,
    getCodeWithComments: () => java.lang.String,
    getRawContent: () => java.lang.String
  ): HtmlTemplate = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction0(evaluate), getCode = js.Any.fromFunction0(getCode), getCodeWithComments = js.Any.fromFunction0(getCodeWithComments), getRawContent = js.Any.fromFunction0(getRawContent))
  
    __obj.asInstanceOf[HtmlTemplate]
  }
}

