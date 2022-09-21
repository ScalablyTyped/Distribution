package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads product ad. */
@js.native
trait ProductAd
  extends StObject
     with StatsFor {
  
  /** Applies a label to the product ad. */
  def applyLabel(name: String): Unit = js.native
  
  /** Enables the product ad. */
  def enable(): Unit = js.native
  
  /** Returns the shopping ad group to which this product ad belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  
  /** Returns the shopping campaign to which this product ad belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  
  /** Returns the type of this entity as a String, in this case, "ProductAd". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the product ad. */
  def getId(): Double = js.native
  
  /** Returns the type of the ad. */
  def getType(): String = js.native
  
  /** Returns true if the product ad is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the product ad specifies mobile device preference or false otherwise. */
  def isMobilePreferred(): Boolean = js.native
  
  /** Returns true if the product ad is paused. */
  def isPaused(): Boolean = js.native
  
  /** Creates a selector of all labels applied to the product ad. */
  def labels(): LabelSelector = js.native
  
  /** Pauses the product ad. */
  def pause(): Unit = js.native
  
  /** Removes the product ad. */
  def remove(): Unit = js.native
  
  /** Removes a label from the product ad. */
  def removeLabel(name: String): Unit = js.native
}
