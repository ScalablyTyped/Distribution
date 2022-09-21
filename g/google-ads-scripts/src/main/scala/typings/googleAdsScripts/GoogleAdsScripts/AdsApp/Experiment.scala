package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads experiment.
  * Experiments are used to run the changes made in a draft campaign side by side with the base campaign.
  * For more information, refer to our guide to Drafts and Experiments.
  */
@js.native
trait Experiment extends StObject {
  
  /** Finishes the experiment. */
  def finish(): Unit = js.native
  
  /** Returns the base campaign to which this experiment belongs. */
  def getBaseCampaign(): Campaign = js.native
  
  /** Returns the draft from which this experiment is running. */
  def getDraft(): Draft = js.native
  
  /** Returns the experiment's end date, or null if there is no end date. */
  def getEndDate(): GoogleAdsDate = js.native
  
  /** Returns the type of this entity as a String, in this case, "Experiment". */
  def getEntityType(): String = js.native
  
  /** Returns the experiment campaign associated with this experiment. */
  def getExperimentCampaign(): Campaign = js.native
  
  /** Returns the ID of the experiment. */
  def getId(): Double = js.native
  
  /** Returns the name of the experiment. */
  def getName(): String = js.native
  
  /** Returns the experiment's start date. */
  def getStartDate(): GoogleAdsDate = js.native
  
  /** Returns the status of the experiment. */
  def getStatus(): String = js.native
  
  /** Returns the traffic split percent (percent of traffic directed to ads from the experiment campaign) of this experiment. */
  def getTrafficSplitPercent(): Double = js.native
  
  /** Graduates the experiment, establishing the experiment campaign as an active, full-fledged campaign immediately. */
  def graduate(): Unit = js.native
  
  /** Removes the experiment, thereby removing its associated experiment campaign, but not removing the associated base campaign. */
  def remove(): Unit = js.native
  
  /** Sets the experiment's end date from either an object containing year, month, and day fields, or an 8-digit string in YYYYMMDD format. */
  def setEndDate(date: String): Unit = js.native
  def setEndDate(date: GoogleAdsDate): Unit = js.native
  
  /** Sets the name of the experiment. */
  def setName(name: String): Unit = js.native
  
  /** Sets the experiment's start date from either an object containing year, month, and day fields, or an 8-digit string in YYYYMMDD format. */
  def setStartDate(date: String): Unit = js.native
  def setStartDate(date: GoogleAdsDate): Unit = js.native
  
  /** Starts applying the experiment's changes back to the base campaign. */
  def startApplying(): Unit = js.native
}
