package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cdata extends js.Object {
  def append(text: java.lang.String): Text
  def detach(): Content
  def getParentElement(): Element
  def getText(): java.lang.String
  def getValue(): java.lang.String
  def setText(text: java.lang.String): Text
}

object Cdata {
  @scala.inline
  def apply(
    append: js.Function1[java.lang.String, Text],
    detach: js.Function0[Content],
    getParentElement: js.Function0[Element],
    getText: js.Function0[java.lang.String],
    getValue: js.Function0[java.lang.String],
    setText: js.Function1[java.lang.String, Text]
  ): Cdata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(append)
    __obj.updateDynamic("detach")(detach)
    __obj.updateDynamic("getParentElement")(getParentElement)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("setText")(setText)
    __obj.asInstanceOf[Cdata]
  }
}

