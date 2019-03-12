package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  def append(text: java.lang.String): Text
  def detach(): Content
  def getParentElement(): Element
  def getText(): java.lang.String
  def getValue(): java.lang.String
  def setText(text: java.lang.String): Text
}

object Text {
  @scala.inline
  def apply(
    append: java.lang.String => Text,
    detach: () => Content,
    getParentElement: () => Element,
    getText: () => java.lang.String,
    getValue: () => java.lang.String,
    setText: java.lang.String => Text
  ): Text = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getText = js.Any.fromFunction0(getText), getValue = js.Any.fromFunction0(getValue), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[Text]
  }
}

