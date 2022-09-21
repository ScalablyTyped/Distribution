package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for Experiment objects.
  *
  * Example usage:
  *
  *      // Create an experiment builder.
  *      var experimentBuilder = AdsApp.drafts().get().next().newExperimentBuilder();
  *
  *      // Create the experiment. Note that startBuilding() returns nothing.
  *      experimentBuilder
  *        .withName("Sample Experiment")                // required
  *        .withTrafficSplitPercent(50)                  // required
  *        .startBuilding();
  *
  *      //Head to the "All experiments" tab of the UI to track the new experiment's creation.
  */
@js.native
trait ExperimentBuilder extends StObject {
  
  /** Starts creating an Experiment. */
  def startBuilding(): Unit = js.native
  
  /** Sets the experiment's end date from either an object containing year, month, and day fields, or an 8-digit string in YYYYMMDD format. */
  def withEndDate(date: String): Unit = js.native
  def withEndDate(date: GoogleAdsDate): Unit = js.native
  
  /** Sets the name of the new experiment to the specified value. */
  def withName(name: String): this.type = js.native
  
  /** Sets the experiment's start date from either an object containing year, month, and day fields, or an 8-digit string in YYYYMMDD format. */
  def withStartDate(date: String): this.type = js.native
  def withStartDate(date: GoogleAdsDate): this.type = js.native
  
  /** Sets the traffic split percent (percent of traffic directed to ads from the experiment campaign) of the new experiment to the specified value. */
  def withTrafficSplitPercent(trafficSplitPercent: Double): this.type = js.native
}
