package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanPurchaseUploadAllowance extends StObject {
  
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
  implicit class CanPurchaseUploadAllowanceMutableBuilder[Self <: CanPurchaseUploadAllowance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanPurchaseUploadAllowance(value: Boolean): Self = StObject.set(x, "canPurchaseUploadAllowance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanPurchaseUploadAllowanceUndefined: Self = StObject.set(x, "canPurchaseUploadAllowance", js.undefined)
    
    @scala.inline
    def setCurrentTime(value: Timestamp): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    @scala.inline
    def setPremium(value: Boolean): Self = StObject.set(x, "premium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumCancellationPending(value: Boolean): Self = StObject.set(x, "premiumCancellationPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumCancellationPendingUndefined: Self = StObject.set(x, "premiumCancellationPending", js.undefined)
    
    @scala.inline
    def setPremiumExpirationDate(value: Timestamp): Self = StObject.set(x, "premiumExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumExpirationDateUndefined: Self = StObject.set(x, "premiumExpirationDate", js.undefined)
    
    @scala.inline
    def setPremiumExtendable(value: Boolean): Self = StObject.set(x, "premiumExtendable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumExtendableUndefined: Self = StObject.set(x, "premiumExtendable", js.undefined)
    
    @scala.inline
    def setPremiumPending(value: Boolean): Self = StObject.set(x, "premiumPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumPendingUndefined: Self = StObject.set(x, "premiumPending", js.undefined)
    
    @scala.inline
    def setPremiumRecurring(value: Boolean): Self = StObject.set(x, "premiumRecurring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumRecurringUndefined: Self = StObject.set(x, "premiumRecurring", js.undefined)
    
    @scala.inline
    def setPremiumUndefined: Self = StObject.set(x, "premium", js.undefined)
    
    @scala.inline
    def setPremiumUpgradable(value: Boolean): Self = StObject.set(x, "premiumUpgradable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumUpgradableUndefined: Self = StObject.set(x, "premiumUpgradable", js.undefined)
  }
}
