package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedExcludedPlacement extends AdWordsEntity {
  def getExcludedPlacementList(): ExcludedPlacementList
  def getUrl(): java.lang.String
  def remove(): scala.Unit
}

object SharedExcludedPlacement {
  @scala.inline
  def apply(
    getExcludedPlacementList: js.Function0[ExcludedPlacementList],
    getUrl: js.Function0[java.lang.String],
    remove: js.Function0[scala.Unit],
    getEntityType: js.Function0[java.lang.String] = null
  ): SharedExcludedPlacement = {
    val __obj = js.Dynamic.literal(getExcludedPlacementList = getExcludedPlacementList, getUrl = getUrl, remove = remove)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[SharedExcludedPlacement]
  }
}

