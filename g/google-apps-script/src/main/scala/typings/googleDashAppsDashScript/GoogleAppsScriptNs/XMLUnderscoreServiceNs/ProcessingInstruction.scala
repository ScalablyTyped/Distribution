package typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessingInstruction extends js.Object {
  def detach(): typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.Content
  def getData(): String
  def getParentElement(): Element
  def getTarget(): String
  def getValue(): String
}

object ProcessingInstruction {
  @scala.inline
  def apply(
    detach: () => typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.Content,
    getData: () => String,
    getParentElement: () => Element,
    getTarget: () => String,
    getValue: () => String
  ): ProcessingInstruction = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getData = js.Any.fromFunction0(getData), getParentElement = js.Any.fromFunction0(getParentElement), getTarget = js.Any.fromFunction0(getTarget), getValue = js.Any.fromFunction0(getValue))
  
    __obj.asInstanceOf[ProcessingInstruction]
  }
}

