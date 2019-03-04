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
    getName: js.Function0[java.lang.String],
    getRange: js.Function0[Range],
    remove: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, NamedRange],
    setRange: js.Function1[Range, NamedRange]
  ): NamedRange = {
    val __obj = js.Dynamic.literal(getName = getName, getRange = getRange, remove = remove, setName = setName, setRange = setRange)
  
    __obj.asInstanceOf[NamedRange]
  }
}

