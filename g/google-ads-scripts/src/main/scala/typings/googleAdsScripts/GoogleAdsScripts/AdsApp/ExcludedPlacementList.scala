package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedPlacementList extends StObject {
  
  /** Adds a SharedExcludedPlacement to an excluded placement list. */
  def addExcludedPlacement(url: String): Unit
  
  /** Adds a list of SharedExcludedPlacement objects to an excluded placement list. */
  def addExcludedPlacements(urls: js.Array[String]): Unit
  
  /** Returns a selector of all campaigns this excluded placement list has been applied to. */
  def campaigns(): CampaignSelector
  
  /** Returns a selector of the shared excluded placements in an excluded placement list. */
  def excludedPlacements(): SharedExcludedPlacementSelector
  
  /** Returns the type of this entity as a String, in this case, "ExcludedPlacementList". */
  def getEntityType(): String
  
  /** Returns the ID of the excluded placement list. */
  def getId(): Double
  
  /** Returns the name of an excluded placement list. */
  def getName(): String
  
  /** Sets the name of an excluded placement list. */
  def setName(name: String): Unit
}
object ExcludedPlacementList {
  
  inline def apply(
    addExcludedPlacement: String => Unit,
    addExcludedPlacements: js.Array[String] => Unit,
    campaigns: () => CampaignSelector,
    excludedPlacements: () => SharedExcludedPlacementSelector,
    getEntityType: () => String,
    getId: () => Double,
    getName: () => String,
    setName: String => Unit
  ): ExcludedPlacementList = {
    val __obj = js.Dynamic.literal(addExcludedPlacement = js.Any.fromFunction1(addExcludedPlacement), addExcludedPlacements = js.Any.fromFunction1(addExcludedPlacements), campaigns = js.Any.fromFunction0(campaigns), excludedPlacements = js.Any.fromFunction0(excludedPlacements), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[ExcludedPlacementList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedPlacementList] (val x: Self) extends AnyVal {
    
    inline def setAddExcludedPlacement(value: String => Unit): Self = StObject.set(x, "addExcludedPlacement", js.Any.fromFunction1(value))
    
    inline def setAddExcludedPlacements(value: js.Array[String] => Unit): Self = StObject.set(x, "addExcludedPlacements", js.Any.fromFunction1(value))
    
    inline def setCampaigns(value: () => CampaignSelector): Self = StObject.set(x, "campaigns", js.Any.fromFunction0(value))
    
    inline def setExcludedPlacements(value: () => SharedExcludedPlacementSelector): Self = StObject.set(x, "excludedPlacements", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
