package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Ad Param
trait AdParam extends AdWordsEntity {
  def getAdGroup(): AdGroup
  def getInde(): scala.Double
  def getInsertionText(): java.lang.String
  def getKeyword(): Keyword
  def remove(): scala.Unit
  def setInsertionText(insertionText: java.lang.String): scala.Unit
}

object AdParam {
  @scala.inline
  def apply(
    getAdGroup: js.Function0[AdGroup],
    getInde: js.Function0[scala.Double],
    getInsertionText: js.Function0[java.lang.String],
    getKeyword: js.Function0[Keyword],
    remove: js.Function0[scala.Unit],
    setInsertionText: js.Function1[java.lang.String, scala.Unit],
    getEntityType: js.Function0[java.lang.String] = null
  ): AdParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup)
    __obj.updateDynamic("getInde")(getInde)
    __obj.updateDynamic("getInsertionText")(getInsertionText)
    __obj.updateDynamic("getKeyword")(getKeyword)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("setInsertionText")(setInsertionText)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[AdParam]
  }
}

