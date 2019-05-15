package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlTemplate
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
    getRawContent: () => java.lang.String,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): HtmlTemplate = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction0(evaluate), getCode = js.Any.fromFunction0(getCode), getCodeWithComments = js.Any.fromFunction0(getCodeWithComments), getRawContent = js.Any.fromFunction0(getRawContent))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HtmlTemplate]
  }
}

