package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Ad Param
trait AdParam extends AdWordsEntity {
  def getAdGroup(): AdGroup
  def getInde(): Double
  def getInsertionText(): String
  def getKeyword(): Keyword
  def remove(): Unit
  def setInsertionText(insertionText: String): Unit
}

object AdParam {
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getInde: () => Double,
    getInsertionText: () => String,
    getKeyword: () => Keyword,
    remove: () => Unit,
    setInsertionText: String => Unit,
    getEntityType: () => String = null
  ): AdParam = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getInde = js.Any.fromFunction0(getInde), getInsertionText = js.Any.fromFunction0(getInsertionText), getKeyword = js.Any.fromFunction0(getKeyword), remove = js.Any.fromFunction0(remove), setInsertionText = js.Any.fromFunction1(setInsertionText))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[AdParam]
  }
}

