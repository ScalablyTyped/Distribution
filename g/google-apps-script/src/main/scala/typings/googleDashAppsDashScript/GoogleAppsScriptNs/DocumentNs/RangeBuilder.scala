package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeBuilder extends js.Object {
  def addElement(element: Element): RangeBuilder = js.native
  def addElement(textElement: Text, startOffset: Integer, endOffsetInclusive: Integer): RangeBuilder = js.native
  def addElementsBetween(startElement: Element, endElementInclusive: Element): RangeBuilder = js.native
  def addElementsBetween(
    startTextElement: Text,
    startOffset: Integer,
    endTextElementInclusive: Text,
    endOffsetInclusive: Integer
  ): RangeBuilder = js.native
  def addRange(range: Range): RangeBuilder = js.native
  def build(): Range = js.native
  def getRangeElements(): js.Array[RangeElement] = js.native
  def getSelectedElements(): js.Array[RangeElement] = js.native
}

