package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRotation extends js.Object {
  def getDegrees(): Integer
  def isVertical(): Boolean
}

object TextRotation {
  @scala.inline
  def apply(getDegrees: () => Integer, isVertical: () => Boolean): TextRotation = {
    val __obj = js.Dynamic.literal(getDegrees = js.Any.fromFunction0(getDegrees), isVertical = js.Any.fromFunction0(isVertical))
  
    __obj.asInstanceOf[TextRotation]
  }
}

