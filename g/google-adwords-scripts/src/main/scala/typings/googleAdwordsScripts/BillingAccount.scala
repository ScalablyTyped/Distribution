package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Budget Orders
trait BillingAccount extends StObject {
  
  def getId(): Double
  
  def getName(): String
  
  def getPrimaryBillingId(): String
  
  def getSecondaryBillingId(): String
}
object BillingAccount {
  
  @scala.inline
  def apply(
    getId: () => Double,
    getName: () => String,
    getPrimaryBillingId: () => String,
    getSecondaryBillingId: () => String
  ): BillingAccount = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getPrimaryBillingId = js.Any.fromFunction0(getPrimaryBillingId), getSecondaryBillingId = js.Any.fromFunction0(getSecondaryBillingId))
    __obj.asInstanceOf[BillingAccount]
  }
  
  @scala.inline
  implicit class BillingAccountMutableBuilder[Self <: BillingAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrimaryBillingId(value: () => String): Self = StObject.set(x, "getPrimaryBillingId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSecondaryBillingId(value: () => String): Self = StObject.set(x, "getSecondaryBillingId", js.Any.fromFunction0(value))
  }
}
