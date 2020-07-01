package typings.googleapis.anon

import typings.googleapis.booksV1Mod.booksV1.SchemaReadingPosition
import typings.googleapis.booksV1Mod.booksV1.SchemaReview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcquiredTime extends js.Object {
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
  def apply(
    acquiredTime: String = null,
    acquisitionType: js.UndefOr[Double] = js.undefined,
    copy: LimitType = null,
    entitlementType: js.UndefOr[Double] = js.undefined,
    familySharing: FamilyRole = null,
    isFamilySharedFromUser: js.UndefOr[Boolean] = js.undefined,
    isFamilySharedToUser: js.UndefOr[Boolean] = js.undefined,
    isFamilySharingAllowed: js.UndefOr[Boolean] = js.undefined,
    isFamilySharingDisabledByFop: js.UndefOr[Boolean] = js.undefined,
    isInMyBooks: js.UndefOr[Boolean] = js.undefined,
    isPreordered: js.UndefOr[Boolean] = js.undefined,
    isPurchased: js.UndefOr[Boolean] = js.undefined,
    isUploaded: js.UndefOr[Boolean] = js.undefined,
    readingPosition: SchemaReadingPosition = null,
    rentalPeriod: EndUtcSec = null,
    rentalState: String = null,
    review: SchemaReview = null,
    updated: String = null,
    userUploadedVolumeInfo: ProcessingState = null
  ): AcquiredTime = {
    val __obj = js.Dynamic.literal()
    if (acquiredTime != null) __obj.updateDynamic("acquiredTime")(acquiredTime.asInstanceOf[js.Any])
    if (!js.isUndefined(acquisitionType)) __obj.updateDynamic("acquisitionType")(acquisitionType.get.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (!js.isUndefined(entitlementType)) __obj.updateDynamic("entitlementType")(entitlementType.get.asInstanceOf[js.Any])
    if (familySharing != null) __obj.updateDynamic("familySharing")(familySharing.asInstanceOf[js.Any])
    if (!js.isUndefined(isFamilySharedFromUser)) __obj.updateDynamic("isFamilySharedFromUser")(isFamilySharedFromUser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFamilySharedToUser)) __obj.updateDynamic("isFamilySharedToUser")(isFamilySharedToUser.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFamilySharingAllowed)) __obj.updateDynamic("isFamilySharingAllowed")(isFamilySharingAllowed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFamilySharingDisabledByFop)) __obj.updateDynamic("isFamilySharingDisabledByFop")(isFamilySharingDisabledByFop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInMyBooks)) __obj.updateDynamic("isInMyBooks")(isInMyBooks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPreordered)) __obj.updateDynamic("isPreordered")(isPreordered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPurchased)) __obj.updateDynamic("isPurchased")(isPurchased.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isUploaded)) __obj.updateDynamic("isUploaded")(isUploaded.get.asInstanceOf[js.Any])
    if (readingPosition != null) __obj.updateDynamic("readingPosition")(readingPosition.asInstanceOf[js.Any])
    if (rentalPeriod != null) __obj.updateDynamic("rentalPeriod")(rentalPeriod.asInstanceOf[js.Any])
    if (rentalState != null) __obj.updateDynamic("rentalState")(rentalState.asInstanceOf[js.Any])
    if (review != null) __obj.updateDynamic("review")(review.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (userUploadedVolumeInfo != null) __obj.updateDynamic("userUploadedVolumeInfo")(userUploadedVolumeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquiredTime]
  }
}

