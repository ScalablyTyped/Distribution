package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a product custom label. */
@js.native
trait ProductCustomLabel
  extends StObject
     with StatsFor {
  
  /** Returns a selector of the child product groups of this product custom label. */
  def children(): ProductGroupSelector = js.native
  
  /** Converts the product custom label into a negative product custom label. */
  def exclude(): Unit = js.native
  
  /** Returns the shopping ad group to which this product custom label belongs. */
  def getAdGroup(): ShoppingAdGroup = js.native
  
  /** Returns the shopping campaign to which this product custom label belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  
  /** Returns the type of this entity as a String, in this case, "ProductCustomLabel". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the product custom label. */
  def getId(): Double = js.native
  
  /** Returns the max cpc bid of the product custom label, in the currency of the account. */
  def getMaxCpc(): Double = js.native
  
  /** Returns the type of the product custom label. */
  def getType(): String = js.native
  
  /** Returns the value of the product custom label or null if this is the root product group. */
  def getValue(): String = js.native
  
  /** Converts the product custom label into a positive product custom label. */
  def include(): Unit = js.native
  
  /** Returns true if this is an excluded product custom label. */
  def isExcluded(): Boolean = js.native
  
  /** Returns true if the product custom label is a catch-all product custom label. */
  def isOtherCase(): Boolean = js.native
  
  /** Returns access to the product group builder space or null if the product custom label is excluded. */
  def newChild(): ProductGroupBuilderSpace = js.native
  
  /** Returns the parent product group of this product custom label or null if this is the root product group. */
  def parent(): ProductGroup = js.native
  
  /** Removes the product custom label. */
  def remove(): Unit = js.native
  
  /** Will remove all child product groups of this product custom label. */
  def removeAllChildren(): Unit = js.native
  
  /** Sets the max cpc bid of the product custom label to the specified value. */
  def setMaxCpc(maxCpc: Double): Unit = js.native
}
