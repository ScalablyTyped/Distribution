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
    detach: () => Content,
    getParentElement: () => Element,
    getText: () => java.lang.String,
    getValue: () => java.lang.String,
    setText: java.lang.String => Comment
  ): Comment = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getText = js.Any.fromFunction0(getText), getValue = js.Any.fromFunction0(getValue), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[Comment]
  }
}

