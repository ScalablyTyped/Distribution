package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads draft.
  * Drafts can be used to prepare changes to campaigns, either by applying them directly or running an experiment.
  * For more information, refer to our guide to Drafts and Experiments.
  */
trait Draft extends StObject {
  
  /** Returns the base campaign to which this draft belongs. */
  def getBaseCampaign(): Campaign
  
  /** Returns the draft campaign associated with this draft. */
  def getDraftCampaign(): Campaign
  
  /** Returns the type of this entity as a String, in this case, "Draft". */
  def getEntityType(): String
  
  /** Returns the ID of the draft. */
  def getId(): Double
  
  /** Returns the name of the draft. */
  def getName(): String
  
  /** Returns the status of the draft. */
  def getStatus(): String
  
  /** Returns true if the draft has a currently-running experiment. */
  def hasRunningExperiment(): Boolean
  
  /** Returns a new experiment builder for this draft. */
  def newExperimentBuilder(): ExperimentBuilder
  
  /** Removes the draft, thereby removing its associated draft campaign, but not removing the associated base campaign. */
  def remove(): Unit
  
  /** Sets the name of the draft. */
  def setName(name: String): Unit
  
  /** Starts applying the draft's changes back to the base campaign. */
  def startApplying(): Unit
}
object Draft {
  
  inline def apply(
    getBaseCampaign: () => Campaign,
    getDraftCampaign: () => Campaign,
    getEntityType: () => String,
    getId: () => Double,
    getName: () => String,
    getStatus: () => String,
    hasRunningExperiment: () => Boolean,
    newExperimentBuilder: () => ExperimentBuilder,
    remove: () => Unit,
    setName: String => Unit,
    startApplying: () => Unit
  ): Draft = {
    val __obj = js.Dynamic.literal(getBaseCampaign = js.Any.fromFunction0(getBaseCampaign), getDraftCampaign = js.Any.fromFunction0(getDraftCampaign), getEntityType = js.Any.fromFunction0(getEntityType), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getStatus = js.Any.fromFunction0(getStatus), hasRunningExperiment = js.Any.fromFunction0(hasRunningExperiment), newExperimentBuilder = js.Any.fromFunction0(newExperimentBuilder), remove = js.Any.fromFunction0(remove), setName = js.Any.fromFunction1(setName), startApplying = js.Any.fromFunction0(startApplying))
    __obj.asInstanceOf[Draft]
  }
  
  extension [Self <: Draft](x: Self) {
    
    inline def setGetBaseCampaign(value: () => Campaign): Self = StObject.set(x, "getBaseCampaign", js.Any.fromFunction0(value))
    
    inline def setGetDraftCampaign(value: () => Campaign): Self = StObject.set(x, "getDraftCampaign", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetStatus(value: () => String): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
    
    inline def setHasRunningExperiment(value: () => Boolean): Self = StObject.set(x, "hasRunningExperiment", js.Any.fromFunction0(value))
    
    inline def setNewExperimentBuilder(value: () => ExperimentBuilder): Self = StObject.set(x, "newExperimentBuilder", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setStartApplying(value: () => Unit): Self = StObject.set(x, "startApplying", js.Any.fromFunction0(value))
  }
}
