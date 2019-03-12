package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRange extends js.Object {
  def getName(): java.lang.String
  def getRange(): Range
  def remove(): scala.Unit
  def setName(name: java.lang.String): NamedRange
  def setRange(range: Range): NamedRange
}

object NamedRange {
  @scala.inline
  def apply(
    getName: () => java.lang.String,
    getRange: () => Range,
    remove: () => scala.Unit,
    setName: java.lang.String => NamedRange,
    setRange: Range => NamedRange
  ): NamedRange = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), getRange = js.Any.fromFunction0(getRange), remove = js.Any.fromFunction0(remove), setName = js.Any.fromFunction1(setName), setRange = js.Any.fromFunction1(setRange))
  
    __obj.asInstanceOf[NamedRange]
  }
}

