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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detach")(detach)
    __obj.updateDynamic("getParentElement")(getParentElement)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("setText")(setText)
    __obj.asInstanceOf[Comment]
  }
}

