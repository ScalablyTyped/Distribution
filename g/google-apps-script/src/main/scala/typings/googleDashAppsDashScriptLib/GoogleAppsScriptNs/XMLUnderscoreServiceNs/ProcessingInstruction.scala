package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessingInstruction extends js.Object {
  def detach(): Content
  def getData(): java.lang.String
  def getParentElement(): Element
  def getTarget(): java.lang.String
  def getValue(): java.lang.String
}

object ProcessingInstruction {
  @scala.inline
  def apply(
    detach: js.Function0[Content],
    getData: js.Function0[java.lang.String],
    getParentElement: js.Function0[Element],
    getTarget: js.Function0[java.lang.String],
    getValue: js.Function0[java.lang.String]
  ): ProcessingInstruction = {
    val __obj = js.Dynamic.literal(detach = detach, getData = getData, getParentElement = getParentElement, getTarget = getTarget, getValue = getValue)
  
    __obj.asInstanceOf[ProcessingInstruction]
  }
}

