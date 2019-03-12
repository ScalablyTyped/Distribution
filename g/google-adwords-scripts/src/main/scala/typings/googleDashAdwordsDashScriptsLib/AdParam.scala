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
    getAdGroup: () => AdGroup,
    getInde: () => scala.Double,
    getInsertionText: () => java.lang.String,
    getKeyword: () => Keyword,
    remove: () => scala.Unit,
    setInsertionText: java.lang.String => scala.Unit,
    getEntityType: () => java.lang.String = null
  ): AdParam = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getInde = js.Any.fromFunction0(getInde), getInsertionText = js.Any.fromFunction0(getInsertionText), getKeyword = js.Any.fromFunction0(getKeyword), remove = js.Any.fromFunction0(remove), setInsertionText = js.Any.fromFunction1(setInsertionText))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[AdParam]
  }
}

