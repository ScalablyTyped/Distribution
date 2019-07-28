package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedExcludedPlacement extends AdWordsEntity {
  def getExcludedPlacementList(): ExcludedPlacementList
  def getUrl(): String
  def remove(): Unit
}

object SharedExcludedPlacement {
  @scala.inline
  def apply(
    getExcludedPlacementList: () => ExcludedPlacementList,
    getUrl: () => String,
    remove: () => Unit,
    getEntityType: () => String = null
  ): SharedExcludedPlacement = {
    val __obj = js.Dynamic.literal(getExcludedPlacementList = js.Any.fromFunction0(getExcludedPlacementList), getUrl = js.Any.fromFunction0(getUrl), remove = js.Any.fromFunction0(remove))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[SharedExcludedPlacement]
  }
}

