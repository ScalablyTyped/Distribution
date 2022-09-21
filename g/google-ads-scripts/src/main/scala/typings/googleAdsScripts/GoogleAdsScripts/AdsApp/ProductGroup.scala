package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a generic product group. */
@js.native
trait ProductGroup
  extends StObject
     with StatsFor {
  
  /** Returns this product group represented as a product brand. */
  def asBrand(): ProductBrand = js.native
  
  /** Returns this product group represented as a product category. */
  def asCategory(): ProductCategory = js.native
  
  /** Returns this product group represented as a product channel. */
  def asChannel(): ProductChannel = js.native
  
  /** Returns this product group represented as a product channel exclusivity. */
  def asChannelExclusivity(): ProductChannelExclusivity = js.native
  
  /** Returns this product group represented as a product condition. */
  def asCondition(): ProductCondition = js.native
  
  /** Returns this product group represented as a product custom label. */
  def asCustomLabel(): ProductCustomLabel = js.native
  
  /** Returns this product group represented as a product item ID. */
  def asItemId(): ProductItemId = js.native
  
  /** Returns this product group represented as a product type. */
  def asProductType(): ProductType = js.native
  
  /** Returns a selector of the child product groups of this product group. */
  def children(): ProductGroupSelector = js.native
  
  /** Converts the product group into a negative product group. */
  def exclude(): Unit = js.native
  
  /** Returns the shopping ad group to which this product group belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  
  /** Returns the shopping campaign to which this product group belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  
  /** Returns the dimension of the product group. */
  def getDimension(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "ProductGroup". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the product group. */
  def getId(): Double = js.native
  
  /** Returns the max cpc bid of the product group, in the currency of the account. */
  def getMaxCpc(): Double = js.native
  
  /** Returns the value of the product group or null if this is the root product group. */
  def getValue(): String = js.native
  
  /** Converts the product group into a positive product group. */
  def include(): Unit = js.native
  
  /** Returns true if this is an excluded product group. */
  def isExcluded(): Boolean = js.native
  
  /** Returns true if the product group is a catch-all product group. */
  def isOtherCase(): Boolean = js.native
  
  /** Returns access to the product group builder space or null if the product group is excluded. */
  def newChild(): ProductGroupBuilderSpace = js.native
  
  /** Returns the parent product group of this product group or null if this is the root product group. */
  def parent(): ProductGroup = js.native
  
  /** Removes the product group. */
  def remove(): Unit = js.native
  
  /** Will remove all child product groups of this product group. */
  def removeAllChildren(): Unit = js.native
  
  /** Sets the max cpc bid of the product group to the specified value. */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}
