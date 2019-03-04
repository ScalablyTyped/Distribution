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
    val __obj = js.Dynamic.literal(addExcludedPlacement = addExcludedPlacement, addExcludedPlacements = addExcludedPlacements, campaigns = campaigns, excludedPlacements = excludedPlacements, getId = getId, getName = getName, setName = setName)
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(getEntityType)
    __obj.asInstanceOf[ExcludedPlacementList]
  }
}

