package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanPurchaseUploadAllowance extends js.Object {
  
  var canPurchaseUploadAllowance: js.UndefOr[Boolean] = js.native
  
  var currentTime: js.UndefOr[Timestamp] = js.native
  
  var premium: js.UndefOr[Boolean] = js.native
  
  var premiumCancellationPending: js.UndefOr[Boolean] = js.native
  
  var premiumExpirationDate: js.UndefOr[Timestamp] = js.native
  
  var premiumExtendable: js.UndefOr[Boolean] = js.native
  
  var premiumPending: js.UndefOr[Boolean] = js.native
  
  var premiumRecurring: js.UndefOr[Boolean] = js.native
  
  var premiumUpgradable: js.UndefOr[Boolean] = js.native
}
object CanPurchaseUploadAllowance {
  
  @scala.inline
  def apply(): CanPurchaseUploadAllowance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanPurchaseUploadAllowance]
  }
  
  @scala.inline
  implicit class CanPurchaseUploadAllowanceOps[Self <: CanPurchaseUploadAllowance] (val x: Self) extends AnyVal {
    
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
    def setCanPurchaseUploadAllowance(value: Boolean): Self = this.set("canPurchaseUploadAllowance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanPurchaseUploadAllowance: Self = this.set("canPurchaseUploadAllowance", js.undefined)
    
    @scala.inline
    def setCurrentTime(value: Timestamp): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTime: Self = this.set("currentTime", js.undefined)
    
    @scala.inline
    def setPremium(value: Boolean): Self = this.set("premium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremium: Self = this.set("premium", js.undefined)
    
    @scala.inline
    def setPremiumCancellationPending(value: Boolean): Self = this.set("premiumCancellationPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremiumCancellationPending: Self = this.set("premiumCancellationPending", js.undefined)
    
    @scala.inline
    def setPremiumExpirationDate(value: Timestamp): Self = this.set("premiumExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremiumExpirationDate: Self = this.set("premiumExpirationDate", js.undefined)
    
    @scala.inline
    def setPremiumExtendable(value: Boolean): Self = this.set("premiumExtendable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremiumExtendable: Self = this.set("premiumExtendable", js.undefined)
    
    @scala.inline
    def setPremiumPending(value: Boolean): Self = this.set("premiumPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremiumPending: Self = this.set("premiumPending", js.undefined)
    
    @scala.inline
    def setPremiumRecurring(value: Boolean): Self = this.set("premiumRecurring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremiumRecurring: Self = this.set("premiumRecurring", js.undefined)
    
    @scala.inline
    def setPremiumUpgradable(value: Boolean): Self = this.set("premiumUpgradable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremiumUpgradable: Self = this.set("premiumUpgradable", js.undefined)
  }
}
