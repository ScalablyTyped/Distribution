package typings.googleapis.anon

import typings.googleapis.booksV1Mod.booksV1.SchemaReadingPosition
import typings.googleapis.booksV1Mod.booksV1.SchemaReview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcquiredTime extends StObject {
  
  var acquiredTime: js.UndefOr[String] = js.native
  
  var acquisitionType: js.UndefOr[Double] = js.native
  
  var copy: js.UndefOr[LimitType] = js.native
  
  var entitlementType: js.UndefOr[Double] = js.native
  
  var familySharing: js.UndefOr[FamilyRole] = js.native
  
  var isFamilySharedFromUser: js.UndefOr[Boolean] = js.native
  
  var isFamilySharedToUser: js.UndefOr[Boolean] = js.native
  
  var isFamilySharingAllowed: js.UndefOr[Boolean] = js.native
  
  var isFamilySharingDisabledByFop: js.UndefOr[Boolean] = js.native
  
  var isInMyBooks: js.UndefOr[Boolean] = js.native
  
  var isPreordered: js.UndefOr[Boolean] = js.native
  
  var isPurchased: js.UndefOr[Boolean] = js.native
  
  var isUploaded: js.UndefOr[Boolean] = js.native
  
  var readingPosition: js.UndefOr[SchemaReadingPosition] = js.native
  
  var rentalPeriod: js.UndefOr[EndUtcSec] = js.native
  
  var rentalState: js.UndefOr[String] = js.native
  
  var review: js.UndefOr[SchemaReview] = js.native
  
  var updated: js.UndefOr[String] = js.native
  
  var userUploadedVolumeInfo: js.UndefOr[ProcessingState] = js.native
}
object AcquiredTime {
  
  @scala.inline
  def apply(): AcquiredTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcquiredTime]
  }
  
  @scala.inline
  implicit class AcquiredTimeMutableBuilder[Self <: AcquiredTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcquiredTime(value: String): Self = StObject.set(x, "acquiredTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcquiredTimeUndefined: Self = StObject.set(x, "acquiredTime", js.undefined)
    
    @scala.inline
    def setAcquisitionType(value: Double): Self = StObject.set(x, "acquisitionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcquisitionTypeUndefined: Self = StObject.set(x, "acquisitionType", js.undefined)
    
    @scala.inline
    def setCopy(value: LimitType): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setEntitlementType(value: Double): Self = StObject.set(x, "entitlementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementTypeUndefined: Self = StObject.set(x, "entitlementType", js.undefined)
    
    @scala.inline
    def setFamilySharing(value: FamilyRole): Self = StObject.set(x, "familySharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilySharingUndefined: Self = StObject.set(x, "familySharing", js.undefined)
    
    @scala.inline
    def setIsFamilySharedFromUser(value: Boolean): Self = StObject.set(x, "isFamilySharedFromUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFamilySharedFromUserUndefined: Self = StObject.set(x, "isFamilySharedFromUser", js.undefined)
    
    @scala.inline
    def setIsFamilySharedToUser(value: Boolean): Self = StObject.set(x, "isFamilySharedToUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFamilySharedToUserUndefined: Self = StObject.set(x, "isFamilySharedToUser", js.undefined)
    
    @scala.inline
    def setIsFamilySharingAllowed(value: Boolean): Self = StObject.set(x, "isFamilySharingAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFamilySharingAllowedUndefined: Self = StObject.set(x, "isFamilySharingAllowed", js.undefined)
    
    @scala.inline
    def setIsFamilySharingDisabledByFop(value: Boolean): Self = StObject.set(x, "isFamilySharingDisabledByFop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFamilySharingDisabledByFopUndefined: Self = StObject.set(x, "isFamilySharingDisabledByFop", js.undefined)
    
    @scala.inline
    def setIsInMyBooks(value: Boolean): Self = StObject.set(x, "isInMyBooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInMyBooksUndefined: Self = StObject.set(x, "isInMyBooks", js.undefined)
    
    @scala.inline
    def setIsPreordered(value: Boolean): Self = StObject.set(x, "isPreordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPreorderedUndefined: Self = StObject.set(x, "isPreordered", js.undefined)
    
    @scala.inline
    def setIsPurchased(value: Boolean): Self = StObject.set(x, "isPurchased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPurchasedUndefined: Self = StObject.set(x, "isPurchased", js.undefined)
    
    @scala.inline
    def setIsUploaded(value: Boolean): Self = StObject.set(x, "isUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUploadedUndefined: Self = StObject.set(x, "isUploaded", js.undefined)
    
    @scala.inline
    def setReadingPosition(value: SchemaReadingPosition): Self = StObject.set(x, "readingPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingPositionUndefined: Self = StObject.set(x, "readingPosition", js.undefined)
    
    @scala.inline
    def setRentalPeriod(value: EndUtcSec): Self = StObject.set(x, "rentalPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRentalPeriodUndefined: Self = StObject.set(x, "rentalPeriod", js.undefined)
    
    @scala.inline
    def setRentalState(value: String): Self = StObject.set(x, "rentalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRentalStateUndefined: Self = StObject.set(x, "rentalState", js.undefined)
    
    @scala.inline
    def setReview(value: SchemaReview): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewUndefined: Self = StObject.set(x, "review", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setUserUploadedVolumeInfo(value: ProcessingState): Self = StObject.set(x, "userUploadedVolumeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUploadedVolumeInfoUndefined: Self = StObject.set(x, "userUploadedVolumeInfo", js.undefined)
  }
}
