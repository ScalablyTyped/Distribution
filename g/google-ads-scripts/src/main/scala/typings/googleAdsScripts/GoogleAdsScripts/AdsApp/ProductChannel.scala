package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a product channel. */
@js.native
trait ProductChannel
  extends StObject
     with StatsFor {
  
  /** Returns a selector of the child product groups of this product channel. */
  def children(): ProductGroupSelector = js.native
  
  /** Converts the product channel into a negative product channel. */
  def exclude(): Unit = js.native
  
  /** Returns the shopping ad group to which this product channel belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  
  /** Returns the shopping campaign to which this product channel belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  
  /** Returns the name of this product channel. */
  def getChannel(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "ProductChannel". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the product channel. */
  def getId(): Double = js.native
  
  /** Returns the max cpc bid of the product channel, in the currency of the account. */
  def getMaxCpc(): Double = js.native
  
  /** Returns the value of the product channel or null if this is the root product group. */
  def getValue(): String = js.native
  
  /** Converts the product channel into a positive product channel. */
  def include(): Unit = js.native
  
  /** Returns true if this is an excluded product channel. */
  def isExcluded(): Boolean = js.native
  
  /** Returns true if the product channel is a catch-all product channel. */
  def isOtherCase(): Boolean = js.native
  
  /** Returns access to the product group builder space or null if the product channel is excluded. */
  def newChild(): ProductGroupBuilderSpace = js.native
  
  /** Returns the parent product group of this product channel or null if this is the root product group. */
  def parent(): ProductGroup = js.native
  
  /** Removes the product channel. */
  def remove(): Unit = js.native
  
  /** Will remove all child product groups of this product channel. */
  def removeAllChildren(): Unit = js.native
  
  /** Sets the max cpc bid of the product channel to the specified value. */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}
