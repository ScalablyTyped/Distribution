package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a product item ID. */
@js.native
trait ProductItemId
  extends StObject
     with StatsFor {
  
  /** Returns a selector of the child product groups of this product item id. */
  def children(): ProductGroupSelector = js.native
  
  /** Converts the product item id into a negative product item id. */
  def exclude(): Unit = js.native
  
  /** Returns the shopping ad group to which this product item id belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  
  /** Returns the shopping campaign to which this product item id belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  
  /** Returns the type of this entity as a String, in this case, "ProductItemId". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the product item id. */
  def getId(): Double = js.native
  
  /** Returns the max cpc bid of the product item id, in the currency of the account. */
  def getMaxCpc(): Double = js.native
  
  /** Returns the value of the product item id or null if this is the root product group. */
  def getValue(): String = js.native
  
  /** Converts the product item id into a positive product item id. */
  def include(): Unit = js.native
  
  /** Returns true if this is an excluded product item id. */
  def isExcluded(): Boolean = js.native
  
  /** Returns true if the product item id is a catch-all product item id. */
  def isOtherCase(): Boolean = js.native
  
  /** Returns access to the product group builder space or null if the product item id is excluded. */
  def newChild(): ProductGroupBuilderSpace = js.native
  
  /** Returns the parent product group of this product item id or null if this is the root product group. */
  def parent(): ProductGroup = js.native
  
  /** Removes the product item id. */
  def remove(): Unit = js.native
  
  /** Will remove all child product groups of this product item id. */
  def removeAllChildren(): Unit = js.native
  
  /** Sets the max cpc bid of the product item id to the specified value. */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}
