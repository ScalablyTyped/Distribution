package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Budget Orders
@js.native
trait BillingAccount extends js.Object {
  
  def getId(): Double = js.native
  
  def getName(): String = js.native
  
  def getPrimaryBillingId(): String = js.native
  
  def getSecondaryBillingId(): String = js.native
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
  implicit class BillingAccountOps[Self <: BillingAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrimaryBillingId(value: () => String): Self = this.set("getPrimaryBillingId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSecondaryBillingId(value: () => String): Self = this.set("getSecondaryBillingId", js.Any.fromFunction0(value))
  }
}
