package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCustomizerSource extends AdWordsEntity {
  def adCustomizerItemBuilder(): AdCustomizerItemBuilder[AdCustomizerItem]
  def getAttributes(): js.Object
  def getName(): java.lang.String
  def items(): AdWordsSelector[AdCustomizerItem]
}

object AdCustomizerSource {
  @scala.inline
  def apply(
    adCustomizerItemBuilder: js.Function0[AdCustomizerItemBuilder[AdCustomizerItem]],
    getAttributes: js.Function0[js.Object],
    getName: js.Function0[java.lang.String],
    items: js.Function0[AdWordsSelector[AdCustomizerItem]],
    getEntityType: js.Function0[java.lang.String] = null
  ): AdCustomizerSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adCustomizerItemBuilder")(adCustomizerItemBuilder)
    __obj.updateDynamic("getAttributes")(getAttributes)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("items")(items)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[AdCustomizerSource]
  }
}

