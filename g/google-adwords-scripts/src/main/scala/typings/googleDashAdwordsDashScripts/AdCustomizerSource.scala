package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCustomizerSource extends AdWordsEntity {
  def adCustomizerItemBuilder(): AdCustomizerItemBuilder[AdCustomizerItem]
  def getAttributes(): js.Object
  def getName(): String
  def items(): AdWordsSelector[AdCustomizerItem]
}

object AdCustomizerSource {
  @scala.inline
  def apply(
    adCustomizerItemBuilder: () => AdCustomizerItemBuilder[AdCustomizerItem],
    getAttributes: () => js.Object,
    getName: () => String,
    items: () => AdWordsSelector[AdCustomizerItem],
    getEntityType: () => String = null
  ): AdCustomizerSource = {
    val __obj = js.Dynamic.literal(adCustomizerItemBuilder = js.Any.fromFunction0(adCustomizerItemBuilder), getAttributes = js.Any.fromFunction0(getAttributes), getName = js.Any.fromFunction0(getName), items = js.Any.fromFunction0(items))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[AdCustomizerSource]
  }
}

