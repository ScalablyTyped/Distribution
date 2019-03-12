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
    detach: () => Content,
    getData: () => java.lang.String,
    getParentElement: () => Element,
    getTarget: () => java.lang.String,
    getValue: () => java.lang.String
  ): ProcessingInstruction = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getData = js.Any.fromFunction0(getData), getParentElement = js.Any.fromFunction0(getParentElement), getTarget = js.Any.fromFunction0(getTarget), getValue = js.Any.fromFunction0(getValue))
  
    __obj.asInstanceOf[ProcessingInstruction]
  }
}

