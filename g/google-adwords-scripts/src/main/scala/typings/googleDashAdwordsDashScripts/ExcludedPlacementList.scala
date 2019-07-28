package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Shared Sets
trait ExcludedPlacementList extends AdWordsEntity {
  def addExcludedPlacement(url: String): Unit
  def addExcludedPlacements(urls: js.Array[String]): Unit
  def campaigns(): AdWordsSelector[Campaign]
  def excludedPlacements(): AdWordsSelector[SharedExcludedPlacement]
  def getId(): Double
  def getName(): String
  def setName(name: String): Unit
}

object ExcludedPlacementList {
  @scala.inline
  def apply(
    addExcludedPlacement: String => Unit,
    addExcludedPlacements: js.Array[String] => Unit,
    campaigns: () => AdWordsSelector[Campaign],
    excludedPlacements: () => AdWordsSelector[SharedExcludedPlacement],
    getId: () => Double,
    getName: () => String,
    setName: String => Unit,
    getEntityType: () => String = null
  ): ExcludedPlacementList = {
    val __obj = js.Dynamic.literal(addExcludedPlacement = js.Any.fromFunction1(addExcludedPlacement), addExcludedPlacements = js.Any.fromFunction1(addExcludedPlacements), campaigns = js.Any.fromFunction0(campaigns), excludedPlacements = js.Any.fromFunction0(excludedPlacements), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), setName = js.Any.fromFunction1(setName))
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[ExcludedPlacementList]
  }
}

