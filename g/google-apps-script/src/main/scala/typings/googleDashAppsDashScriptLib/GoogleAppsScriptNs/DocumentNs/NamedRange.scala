package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRange extends js.Object {
  def getId(): java.lang.String
  def getName(): java.lang.String
  def getRange(): Range
  def remove(): scala.Unit
}

object NamedRange {
  @scala.inline
  def apply(
    getId: () => java.lang.String,
    getName: () => java.lang.String,
    getRange: () => Range,
    remove: () => scala.Unit
  ): NamedRange = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getRange = js.Any.fromFunction0(getRange), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[NamedRange]
  }
}

