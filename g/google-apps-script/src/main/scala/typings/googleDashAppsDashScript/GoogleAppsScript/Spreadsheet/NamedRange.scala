package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRange extends js.Object {
  def getName(): String
  def getRange(): Range
  def remove(): Unit
  def setName(name: String): NamedRange
  def setRange(range: Range): NamedRange
}

object NamedRange {
  @scala.inline
  def apply(
    getName: () => String,
    getRange: () => Range,
    remove: () => Unit,
    setName: String => NamedRange,
    setRange: Range => NamedRange
  ): NamedRange = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), getRange = js.Any.fromFunction0(getRange), remove = js.Any.fromFunction0(remove), setName = js.Any.fromFunction1(setName), setRange = js.Any.fromFunction1(setRange))
  
    __obj.asInstanceOf[NamedRange]
  }
}

