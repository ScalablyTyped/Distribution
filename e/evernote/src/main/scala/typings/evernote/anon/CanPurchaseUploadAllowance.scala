package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanPurchaseUploadAllowance extends StObject {
  
  var canPurchaseUploadAllowance: js.UndefOr[Boolean] = js.undefined
  
  var currentTime: js.UndefOr[Timestamp] = js.undefined
  
  var premium: js.UndefOr[Boolean] = js.undefined
  
  var premiumCancellationPending: js.UndefOr[Boolean] = js.undefined
  
  var premiumExpirationDate: js.UndefOr[Timestamp] = js.undefined
  
  var premiumExtendable: js.UndefOr[Boolean] = js.undefined
  
  var premiumPending: js.UndefOr[Boolean] = js.undefined
  
  var premiumRecurring: js.UndefOr[Boolean] = js.undefined
  
  var premiumUpgradable: js.UndefOr[Boolean] = js.undefined
}
object CanPurchaseUploadAllowance {
  
  inline def apply(): CanPurchaseUploadAllowance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanPurchaseUploadAllowance]
  }
  
  extension [Self <: CanPurchaseUploadAllowance](x: Self) {
    
    inline def setCanPurchaseUploadAllowance(value: Boolean): Self = StObject.set(x, "canPurchaseUploadAllowance", value.asInstanceOf[js.Any])
    
    inline def setCanPurchaseUploadAllowanceUndefined: Self = StObject.set(x, "canPurchaseUploadAllowance", js.undefined)
    
    inline def setCurrentTime(value: Timestamp): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    inline def setPremium(value: Boolean): Self = StObject.set(x, "premium", value.asInstanceOf[js.Any])
    
    inline def setPremiumCancellationPending(value: Boolean): Self = StObject.set(x, "premiumCancellationPending", value.asInstanceOf[js.Any])
    
    inline def setPremiumCancellationPendingUndefined: Self = StObject.set(x, "premiumCancellationPending", js.undefined)
    
    inline def setPremiumExpirationDate(value: Timestamp): Self = StObject.set(x, "premiumExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setPremiumExpirationDateUndefined: Self = StObject.set(x, "premiumExpirationDate", js.undefined)
    
    inline def setPremiumExtendable(value: Boolean): Self = StObject.set(x, "premiumExtendable", value.asInstanceOf[js.Any])
    
    inline def setPremiumExtendableUndefined: Self = StObject.set(x, "premiumExtendable", js.undefined)
    
    inline def setPremiumPending(value: Boolean): Self = StObject.set(x, "premiumPending", value.asInstanceOf[js.Any])
    
    inline def setPremiumPendingUndefined: Self = StObject.set(x, "premiumPending", js.undefined)
    
    inline def setPremiumRecurring(value: Boolean): Self = StObject.set(x, "premiumRecurring", value.asInstanceOf[js.Any])
    
    inline def setPremiumRecurringUndefined: Self = StObject.set(x, "premiumRecurring", js.undefined)
    
    inline def setPremiumUndefined: Self = StObject.set(x, "premium", js.undefined)
    
    inline def setPremiumUpgradable(value: Boolean): Self = StObject.set(x, "premiumUpgradable", value.asInstanceOf[js.Any])
    
    inline def setPremiumUpgradableUndefined: Self = StObject.set(x, "premiumUpgradable", js.undefined)
  }
}
