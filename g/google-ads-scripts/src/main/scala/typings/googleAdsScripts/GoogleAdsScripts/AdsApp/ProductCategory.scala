package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a product category. */
@js.native
trait ProductCategory
  extends StObject
     with StatsFor {
  
  /** Returns a selector of the child product groups of this product category. */
  def children(): ProductGroupSelector = js.native
  
  /** Converts the product category into a negative product category. */
  def exclude(): Unit = js.native
  
  /** Returns the shopping ad group to which this product category belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  
  /** Returns the shopping campaign to which this product category belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  
  /** Returns the name of the country of the product category or null if this is an other case. */
  def getCountry(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "ProductCategory". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the product category. */
  def getId(): Double = js.native
  
  /** Returns the max cpc bid of the product category, in the currency of the account. */
  def getMaxCpc(): Double = js.native
  
  /** Returns the name of the product category or null if this is an other case. */
  def getName(): String = js.native
  
  /** Returns the value of the product category or null if this is the root product group. */
  def getValue(): String = js.native
  
  /** Converts the product category into a positive product category. */
  def include(): Unit = js.native
  
  /** Returns true if this is an excluded product category. */
  def isExcluded(): Boolean = js.native
  
  /** Returns true if the product category is a catch-all product category. */
  def isOtherCase(): Boolean = js.native
  
  /** Returns access to the product group builder space or null if the product category is excluded. */
  def newChild(): ProductGroupBuilderSpace = js.native
  
  /** Returns the parent product group of this product category or null if this is the root product group. */
  def parent(): ProductGroup = js.native
  
  /** Removes the product category. */
  def remove(): Unit = js.native
  
  /** Will remove all child product groups of this product category. */
  def removeAllChildren(): Unit = js.native
  
  /** Sets the max cpc bid of the product category to the specified value. */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}
