package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an account to which invoices are sent in consolidated billing. */
trait BillingAccount extends StObject {
  
  /** Returns the ID of the billing account. */
  def getId(): Double
  
  /** Returns the name of the billing account. */
  def getName(): String
  
  /** Returns the primary billing ID. */
  def getPrimaryBillingId(): String
  
  /** Returns the secondary billing ID or null if there is no secondary billing account. */
  def getSecondaryBillingId(): String
}
object BillingAccount {
  
  inline def apply(
    getId: () => Double,
    getName: () => String,
    getPrimaryBillingId: () => String,
    getSecondaryBillingId: () => String
  ): BillingAccount = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getPrimaryBillingId = js.Any.fromFunction0(getPrimaryBillingId), getSecondaryBillingId = js.Any.fromFunction0(getSecondaryBillingId))
    __obj.asInstanceOf[BillingAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingAccount] (val x: Self) extends AnyVal {
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetPrimaryBillingId(value: () => String): Self = StObject.set(x, "getPrimaryBillingId", js.Any.fromFunction0(value))
    
    inline def setGetSecondaryBillingId(value: () => String): Self = StObject.set(x, "getSecondaryBillingId", js.Any.fromFunction0(value))
  }
}
