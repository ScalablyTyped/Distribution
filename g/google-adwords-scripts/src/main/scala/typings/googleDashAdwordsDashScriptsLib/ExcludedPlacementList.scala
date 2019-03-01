package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Shared Sets
trait ExcludedPlacementList extends AdWordsEntity {
  def addExcludedPlacement(url: java.lang.String): scala.Unit
  def addExcludedPlacements(urls: js.Array[java.lang.String]): scala.Unit
  def campaigns(): AdWordsSelector[Campaign]
  def excludedPlacements(): AdWordsSelector[SharedExcludedPlacement]
  def getId(): scala.Double
  def getName(): java.lang.String
  def setName(name: java.lang.String): scala.Unit
}

object ExcludedPlacementList {
  @scala.inline
  def apply(
    addExcludedPlacement: js.Function1[java.lang.String, scala.Unit],
    addExcludedPlacements: js.Function1[js.Array[java.lang.String], scala.Unit],
    campaigns: js.Function0[AdWordsSelector[Campaign]],
    excludedPlacements: js.Function0[AdWordsSelector[SharedExcludedPlacement]],
    getId: js.Function0[scala.Double],
    getName: js.Function0[java.lang.String],
    setName: js.Function1[java.lang.String, scala.Unit],
    getEntityType: js.Function0[java.lang.String] = null
  ): ExcludedPlacementList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addExcludedPlacement")(addExcludedPlacement)
    __obj.updateDynamic("addExcludedPlacements")(addExcludedPlacements)
    __obj.updateDynamic("campaigns")(campaigns)
    __obj.updateDynamic("excludedPlacements")(excludedPlacements)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("setName")(setName)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[ExcludedPlacementList]
  }
}

