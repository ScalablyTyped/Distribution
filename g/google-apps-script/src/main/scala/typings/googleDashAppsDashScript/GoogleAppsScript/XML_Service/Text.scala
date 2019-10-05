package typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  def append(text: String): Text
  def detach(): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content
  def getParentElement(): Element
  def getText(): String
  def getValue(): String
  def setText(text: String): Text
}

object Text {
  @scala.inline
  def apply(
    append: String => Text,
    detach: () => typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content,
    getParentElement: () => Element,
    getText: () => String,
    getValue: () => String,
    setText: String => Text
  ): Text = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getText = js.Any.fromFunction0(getText), getValue = js.Any.fromFunction0(getValue), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[Text]
  }
}

