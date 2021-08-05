package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Shared Sets
trait ExcludedPlacementList
  extends StObject
     with AdWordsEntity {
  
  def addExcludedPlacement(url: String): Unit
  
  def addExcludedPlacements(urls: js.Array[String]): Unit
  
  def campaigns(): AdWordsSelector[Campaign]
  
  def excludedPlacements(): AdWordsSelector[SharedExcludedPlacement]
  
  def getId(): Double
  
  def getName(): String
  
  def setName(name: String): Unit
}
object ExcludedPlacementList {
  
  inline def apply(
    addExcludedPlacement: String => Unit,
    addExcludedPlacements: js.Array[String] => Unit,
    campaigns: () => AdWordsSelector[Campaign],
    excludedPlacements: () => AdWordsSelector[SharedExcludedPlacement],
    getId: () => Double,
    getName: () => String,
    setName: String => Unit
  ): ExcludedPlacementList = {
    val __obj = js.Dynamic.literal(addExcludedPlacement = js.Any.fromFunction1(addExcludedPlacement), addExcludedPlacements = js.Any.fromFunction1(addExcludedPlacements), campaigns = js.Any.fromFunction0(campaigns), excludedPlacements = js.Any.fromFunction0(excludedPlacements), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[ExcludedPlacementList]
  }
  
  extension [Self <: ExcludedPlacementList](x: Self) {
    
    inline def setAddExcludedPlacement(value: String => Unit): Self = StObject.set(x, "addExcludedPlacement", js.Any.fromFunction1(value))
    
    inline def setAddExcludedPlacements(value: js.Array[String] => Unit): Self = StObject.set(x, "addExcludedPlacements", js.Any.fromFunction1(value))
    
    inline def setCampaigns(value: () => AdWordsSelector[Campaign]): Self = StObject.set(x, "campaigns", js.Any.fromFunction0(value))
    
    inline def setExcludedPlacements(value: () => AdWordsSelector[SharedExcludedPlacement]): Self = StObject.set(x, "excludedPlacements", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
