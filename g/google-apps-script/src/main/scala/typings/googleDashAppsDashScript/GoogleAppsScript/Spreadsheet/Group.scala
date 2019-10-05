package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  def collapse(): Group
  def expand(): Group
  def getControlIndex(): Integer
  def getDepth(): Integer
  def getRange(): Range
  def isCollapsed(): Boolean
  def remove(): Unit
}

object Group {
  @scala.inline
  def apply(
    collapse: () => Group,
    expand: () => Group,
    getControlIndex: () => Integer,
    getDepth: () => Integer,
    getRange: () => Range,
    isCollapsed: () => Boolean,
    remove: () => Unit
  ): Group = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction0(collapse), expand = js.Any.fromFunction0(expand), getControlIndex = js.Any.fromFunction0(getControlIndex), getDepth = js.Any.fromFunction0(getDepth), getRange = js.Any.fromFunction0(getRange), isCollapsed = js.Any.fromFunction0(isCollapsed), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[Group]
  }
}

