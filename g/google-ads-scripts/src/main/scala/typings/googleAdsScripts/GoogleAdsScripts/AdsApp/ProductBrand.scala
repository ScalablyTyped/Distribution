package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a product brand. */
@js.native
trait ProductBrand
  extends StObject
     with StatsFor {
  
  /** Returns a selector of the child product groups of this product brand. */
  def children(): ProductGroupSelector = js.native
  
  /** Converts the product brand into a negative product brand. */
  def exclude(): Unit = js.native
  
  /** Returns the shopping ad group to which this product brand belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  
  /** Returns the shopping campaign to which this product brand belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  
  /** Returns the type of this entity as a String, in this case, "ProductBrand". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the product brand. */
  def getId(): Double = js.native
  
  /** Returns the max cpc bid of the product brand, in the currency of the account. */
  def getMaxCpc(): Double = js.native
  
  /** Returns the name of the product brand. */
  def getName(): String = js.native
  
  /** Returns the value of the product brand or null if this is the root product group. */
  def getValue(): String = js.native
  
  /** Converts the product brand into a positive product brand. */
  def include(): Unit = js.native
  
  /** Returns true if this is an excluded product brand. */
  def isExcluded(): Boolean = js.native
  
  /** Returns true if the product brand is a catch-all product brand. */
  def isOtherCase(): Boolean = js.native
  
  /** Returns access to the product group builder space or null if the product brand is excluded. */
  def newChild(): ProductGroupBuilderSpace = js.native
  
  /** Returns the parent product group of this product brand or null if this is the root product group. */
  def parent(): ProductGroup = js.native
  
  /** Removes the product brand. */
  def remove(): Unit = js.native
  
  /** Will remove all child product groups of this product brand. */
  def removeAllChildren(): Unit = js.native
  
  /** Sets the max cpc bid of the product brand to the specified value. */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}
