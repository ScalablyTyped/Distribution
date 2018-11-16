package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeBuilder extends js.Object {
  def addElement(element: Element): RangeBuilder = js.native
  def addElement(
    textElement: Text,
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): RangeBuilder = js.native
  def addElementsBetween(startElement: Element, endElementInclusive: Element): RangeBuilder = js.native
  def addElementsBetween(
    startTextElement: Text,
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endTextElementInclusive: Text,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): RangeBuilder = js.native
  def addRange(range: Range): RangeBuilder = js.native
  def build(): Range = js.native
  def getRangeElements(): js.Array[RangeElement] = js.native
  def getSelectedElements(): js.Array[RangeElement] = js.native
}

