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
    evaluate: js.Function0[HtmlOutput],
    getCode: js.Function0[java.lang.String],
    getCodeWithComments: js.Function0[java.lang.String],
    getRawContent: js.Function0[java.lang.String]
  ): HtmlTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("evaluate")(evaluate)
    __obj.updateDynamic("getCode")(getCode)
    __obj.updateDynamic("getCodeWithComments")(getCodeWithComments)
    __obj.updateDynamic("getRawContent")(getRawContent)
    __obj.asInstanceOf[HtmlTemplate]
  }
}

