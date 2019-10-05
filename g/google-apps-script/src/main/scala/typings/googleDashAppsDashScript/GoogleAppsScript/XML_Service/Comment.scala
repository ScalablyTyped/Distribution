package typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  def detach(): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content
  def getParentElement(): Element
  def getText(): String
  def getValue(): String
  def setText(text: String): Comment
}

object Comment {
  @scala.inline
  def apply(
    detach: () => typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content,
    getParentElement: () => Element,
    getText: () => String,
    getValue: () => String,
    setText: String => Comment
  ): Comment = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getText = js.Any.fromFunction0(getText), getValue = js.Any.fromFunction0(getValue), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[Comment]
  }
}

