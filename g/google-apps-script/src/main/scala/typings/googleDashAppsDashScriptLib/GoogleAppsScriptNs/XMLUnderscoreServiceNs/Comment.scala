package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  def detach(): Content
  def getParentElement(): Element
  def getText(): java.lang.String
  def getValue(): java.lang.String
  def setText(text: java.lang.String): Comment
}

object Comment {
  @scala.inline
  def apply(
    detach: js.Function0[Content],
    getParentElement: js.Function0[Element],
    getText: js.Function0[java.lang.String],
    getValue: js.Function0[java.lang.String],
    setText: js.Function1[java.lang.String, Comment]
  ): Comment = {
    val __obj = js.Dynamic.literal(detach = detach, getParentElement = getParentElement, getText = getText, getValue = getValue, setText = setText)
  
    __obj.asInstanceOf[Comment]
  }
}

