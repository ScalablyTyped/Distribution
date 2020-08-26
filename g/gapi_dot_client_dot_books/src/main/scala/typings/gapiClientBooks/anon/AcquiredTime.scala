package typings.gapiClientBooks.anon

import typings.gapiClientBooks.gapi.client.books.ReadingPosition
import typings.gapiClientBooks.gapi.client.books.Review
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcquiredTime extends js.Object {
  /**
    * Timestamp when this volume was acquired by the user. (RFC 3339 UTC date-time format) Acquiring includes purchase, user upload, receiving family
    * sharing, etc.
    */
  var acquiredTime: js.UndefOr[String] = js.native
  /** How this volume was acquired. */
  var acquisitionType: js.UndefOr[Double] = js.native
  /** Copy/Paste accounting information. */
  var copy: js.UndefOr[LimitType] = js.native
  /** Whether this volume is purchased, sample, pd download etc. */
  var entitlementType: js.UndefOr[Double] = js.native
  /** Information on the ability to share with the family. */
  var familySharing: js.UndefOr[FamilyRole] = js.native
  /** Whether or not the user shared this volume with the family. */
  var isFamilySharedFromUser: js.UndefOr[Boolean] = js.native
  /** Whether or not the user received this volume through family sharing. */
  var isFamilySharedToUser: js.UndefOr[Boolean] = js.native
  /** Deprecated: Replaced by familySharing. */
  var isFamilySharingAllowed: js.UndefOr[Boolean] = js.native
  /** Deprecated: Replaced by familySharing. */
  var isFamilySharingDisabledByFop: js.UndefOr[Boolean] = js.native
  /** Whether or not this volume is currently in "my books." */
  var isInMyBooks: js.UndefOr[Boolean] = js.native
  /** Whether or not this volume was pre-ordered by the authenticated user making the request. (In LITE projection.) */
  var isPreordered: js.UndefOr[Boolean] = js.native
  /** Whether or not this volume was purchased by the authenticated user making the request. (In LITE projection.) */
  var isPurchased: js.UndefOr[Boolean] = js.native
  /** Whether or not this volume was user uploaded. */
  var isUploaded: js.UndefOr[Boolean] = js.native
  /** The user's current reading position in the volume, if one is available. (In LITE projection.) */
  var readingPosition: js.UndefOr[ReadingPosition] = js.native
  /** Period during this book is/was a valid rental. */
  var rentalPeriod: js.UndefOr[EndUtcSec] = js.native
  /** Whether this book is an active or an expired rental. */
  var rentalState: js.UndefOr[String] = js.native
  /** This user's review of this volume, if one exists. */
  var review: js.UndefOr[Review] = js.native
  /**
    * Timestamp when this volume was last modified by a user action, such as a reading position update, volume purchase or writing a review. (RFC 3339 UTC
    * date-time format).
    */
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
  implicit class AcquiredTimeOps[Self <: AcquiredTime] (val x: Self) extends AnyVal {
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
    def setAcquiredTime(value: String): Self = this.set("acquiredTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcquiredTime: Self = this.set("acquiredTime", js.undefined)
    @scala.inline
    def setAcquisitionType(value: Double): Self = this.set("acquisitionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcquisitionType: Self = this.set("acquisitionType", js.undefined)
    @scala.inline
    def setCopy(value: LimitType): Self = this.set("copy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    @scala.inline
    def setEntitlementType(value: Double): Self = this.set("entitlementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlementType: Self = this.set("entitlementType", js.undefined)
    @scala.inline
    def setFamilySharing(value: FamilyRole): Self = this.set("familySharing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilySharing: Self = this.set("familySharing", js.undefined)
    @scala.inline
    def setIsFamilySharedFromUser(value: Boolean): Self = this.set("isFamilySharedFromUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFamilySharedFromUser: Self = this.set("isFamilySharedFromUser", js.undefined)
    @scala.inline
    def setIsFamilySharedToUser(value: Boolean): Self = this.set("isFamilySharedToUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFamilySharedToUser: Self = this.set("isFamilySharedToUser", js.undefined)
    @scala.inline
    def setIsFamilySharingAllowed(value: Boolean): Self = this.set("isFamilySharingAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFamilySharingAllowed: Self = this.set("isFamilySharingAllowed", js.undefined)
    @scala.inline
    def setIsFamilySharingDisabledByFop(value: Boolean): Self = this.set("isFamilySharingDisabledByFop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFamilySharingDisabledByFop: Self = this.set("isFamilySharingDisabledByFop", js.undefined)
    @scala.inline
    def setIsInMyBooks(value: Boolean): Self = this.set("isInMyBooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInMyBooks: Self = this.set("isInMyBooks", js.undefined)
    @scala.inline
    def setIsPreordered(value: Boolean): Self = this.set("isPreordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPreordered: Self = this.set("isPreordered", js.undefined)
    @scala.inline
    def setIsPurchased(value: Boolean): Self = this.set("isPurchased", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPurchased: Self = this.set("isPurchased", js.undefined)
    @scala.inline
    def setIsUploaded(value: Boolean): Self = this.set("isUploaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUploaded: Self = this.set("isUploaded", js.undefined)
    @scala.inline
    def setReadingPosition(value: ReadingPosition): Self = this.set("readingPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadingPosition: Self = this.set("readingPosition", js.undefined)
    @scala.inline
    def setRentalPeriod(value: EndUtcSec): Self = this.set("rentalPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRentalPeriod: Self = this.set("rentalPeriod", js.undefined)
    @scala.inline
    def setRentalState(value: String): Self = this.set("rentalState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRentalState: Self = this.set("rentalState", js.undefined)
    @scala.inline
    def setReview(value: Review): Self = this.set("review", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReview: Self = this.set("review", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setUserUploadedVolumeInfo(value: ProcessingState): Self = this.set("userUploadedVolumeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserUploadedVolumeInfo: Self = this.set("userUploadedVolumeInfo", js.undefined)
  }
  
}

