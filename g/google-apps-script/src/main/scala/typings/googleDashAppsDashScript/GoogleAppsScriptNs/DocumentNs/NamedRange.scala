package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRange extends js.Object {
  def getId(): String
  def getName(): String
  def getRange(): Range
  def remove(): Unit
}

object NamedRange {
  @scala.inline
  def apply(getId: () => String, getName: () => String, getRange: () => Range, remove: () => Unit): NamedRange = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getRange = js.Any.fromFunction0(getRange), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[NamedRange]
  }
}

