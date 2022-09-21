package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductType
  extends StObject
     with StatsFor {
  
  /** Returns a selector of the child product groups of this product type. */
  def children(): ProductGroupSelector = js.native
  
  /** Converts the product type into a negative product type. */
  def exclude(): Unit = js.native
  
  /** Returns the shopping ad group to which this product type belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  
  /** Returns the shopping campaign to which this product type belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  
  /** Returns the type of this entity as a String, in this case, "ProductType". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the product type. */
  def getId(): Double = js.native
  
  /** Returns the max cpc bid of the product type, in the currency of the account. */
  def getMaxCpc(): Double = js.native
  
  /** Returns the name of the product type. */
  def getType(): String = js.native
  
  /** Returns the value of the product type or null if this is the root product group. */
  def getValue(): String = js.native
  
  /** Converts the product type into a positive product type. */
  def include(): Unit = js.native
  
  /** Returns true if this is an excluded product type. */
  def isExcluded(): Boolean = js.native
  
  /** Returns true if the product type is a catch-all product type. */
  def isOtherCase(): Boolean = js.native
  
  /** Returns access to the product group builder space or null if the product type is excluded. */
  def newChild(): ProductGroupBuilderSpace = js.native
  
  /** Returns the parent product group of this product type or null if this is the root product group. */
  def parent(): ProductGroup = js.native
  
  /** Removes the product type. */
  def remove(): Unit = js.native
  
  /** Will remove all child product groups of this product type. */
  def removeAllChildren(): Unit = js.native
  
  /** Sets the max cpc bid of the product type to the specified value. */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}
