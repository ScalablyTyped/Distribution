package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a shopping ad group. */
@js.native
trait ShoppingAdGroup
  extends StObject
     with StatsFor {
  
  /** Returns the selector of all product ads in the shopping ad group. */
  def ads(): ProductAdSelector = js.native
  
  /** Applies a label to the shopping ad group. */
  def applyLabel(name: String): Unit = js.native
  
  /** Provides access to this shopping ad group's bidding fields. */
  def bidding(): ShoppingAdGroupBidding = js.native
  
  /** Creates a new negative keyword with the specified text. */
  def createNegativeKeyword(): Unit = js.native
  
  /** Creates the root product group of the shopping ad group (if one doesn't already exist). */
  def createRootProductGroup(): ProductGroupOperation = js.native
  
  /** Returns an AdGroupDevices instance associated with the shopping ad group. */
  def devices(): AdGroupDevices = js.native
  
  /** Enables the shopping ad group. */
  def enable(): Unit = js.native
  
  /** Returns the shopping campaign to which this shopping ad group belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  
  /** Returns the type of this entity as a String, in this case, "ShoppingAdGroup". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the shopping ad group. */
  def getId(): Double = js.native
  
  /** Returns the mobile bid modifier for this ad group. */
  def getMobileBidModifier(): Double = js.native
  
  /** Returns the name of the shopping ad group. */
  def getName(): String = js.native
  
  /** Returns true if the shopping ad group is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the shopping ad group is paused. */
  def isPaused(): Boolean = js.native
  
  /** Returns true if the shopping ad group is removed. */
  def isRemoved(): Boolean = js.native
  
  /** Creates a selector of all labels applied to the shopping ad group. */
  def labels(): LabelSelector = js.native
  
  /** Returns a selector of all negative keywords in the ad group. */
  def negativeKeywords(): NegativeKeywordSelector = js.native
  
  /** Returns a product ad builder. */
  def newAdBuilder(): ProductAdBuilder = js.native
  
  /** Pauses the shopping ad group. */
  def pause(): Unit = js.native
  
  /** Returns the selector of all product groups in the shopping ad group. */
  def productGroups(): ProductGroupSelector = js.native
  
  /** Removes a label from the shopping ad group. */
  def removeLabel(name: String): Unit = js.native
  
  /** Returns the root product group of the shopping ad group or null if one does not exist. */
  def rootProductGroup(): ProductGroup = js.native
  
  /** Sets the mobile bid modifier for this ad group to the specified value. */
  def setMobileBidModifier(modifier: Double): Unit = js.native
  
  /** Sets the name of the shopping ad group. */
  def setName(name: String): Unit = js.native
  
  /** Provides access to this shopping ad group's targeting criteria: audiences */
  def targeting(): ShoppingAdGroupTargeting = js.native
}
