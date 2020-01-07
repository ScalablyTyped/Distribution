package typings.googleapis

import typings.googleapis.buildSrcApisBooksV1Mod.books_v1.Schema$ReadingPosition
import typings.googleapis.buildSrcApisBooksV1Mod.books_v1.Schema$Review
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AcquiredTime extends js.Object {
  var acquiredTime: js.UndefOr[String] = js.native
  var acquisitionType: js.UndefOr[Double] = js.native
  var copy: js.UndefOr[Anon_AllowedCharacterCountLimitType] = js.native
  var entitlementType: js.UndefOr[Double] = js.native
  var familySharing: js.UndefOr[Anon_FamilyRole] = js.native
  var isFamilySharedFromUser: js.UndefOr[Boolean] = js.native
  var isFamilySharedToUser: js.UndefOr[Boolean] = js.native
  var isFamilySharingAllowed: js.UndefOr[Boolean] = js.native
  var isFamilySharingDisabledByFop: js.UndefOr[Boolean] = js.native
  var isInMyBooks: js.UndefOr[Boolean] = js.native
  var isPreordered: js.UndefOr[Boolean] = js.native
  var isPurchased: js.UndefOr[Boolean] = js.native
  var isUploaded: js.UndefOr[Boolean] = js.native
  var readingPosition: js.UndefOr[Schema$ReadingPosition] = js.native
  var rentalPeriod: js.UndefOr[Anon_EndUtcSec] = js.native
  var rentalState: js.UndefOr[String] = js.native
  var review: js.UndefOr[Schema$Review] = js.native
  var updated: js.UndefOr[String] = js.native
  var userUploadedVolumeInfo: js.UndefOr[Anon_ProcessingState] = js.native
}

object Anon_AcquiredTime {
  @scala.inline
  def apply(
    acquiredTime: String = null,
    acquisitionType: Int | Double = null,
    copy: Anon_AllowedCharacterCountLimitType = null,
    entitlementType: Int | Double = null,
    familySharing: Anon_FamilyRole = null,
    isFamilySharedFromUser: js.UndefOr[Boolean] = js.undefined,
    isFamilySharedToUser: js.UndefOr[Boolean] = js.undefined,
    isFamilySharingAllowed: js.UndefOr[Boolean] = js.undefined,
    isFamilySharingDisabledByFop: js.UndefOr[Boolean] = js.undefined,
    isInMyBooks: js.UndefOr[Boolean] = js.undefined,
    isPreordered: js.UndefOr[Boolean] = js.undefined,
    isPurchased: js.UndefOr[Boolean] = js.undefined,
    isUploaded: js.UndefOr[Boolean] = js.undefined,
    readingPosition: Schema$ReadingPosition = null,
    rentalPeriod: Anon_EndUtcSec = null,
    rentalState: String = null,
    review: Schema$Review = null,
    updated: String = null,
    userUploadedVolumeInfo: Anon_ProcessingState = null
  ): Anon_AcquiredTime = {
    val __obj = js.Dynamic.literal()
    if (acquiredTime != null) __obj.updateDynamic("acquiredTime")(acquiredTime.asInstanceOf[js.Any])
    if (acquisitionType != null) __obj.updateDynamic("acquisitionType")(acquisitionType.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (entitlementType != null) __obj.updateDynamic("entitlementType")(entitlementType.asInstanceOf[js.Any])
    if (familySharing != null) __obj.updateDynamic("familySharing")(familySharing.asInstanceOf[js.Any])
    if (!js.isUndefined(isFamilySharedFromUser)) __obj.updateDynamic("isFamilySharedFromUser")(isFamilySharedFromUser.asInstanceOf[js.Any])
    if (!js.isUndefined(isFamilySharedToUser)) __obj.updateDynamic("isFamilySharedToUser")(isFamilySharedToUser.asInstanceOf[js.Any])
    if (!js.isUndefined(isFamilySharingAllowed)) __obj.updateDynamic("isFamilySharingAllowed")(isFamilySharingAllowed.asInstanceOf[js.Any])
    if (!js.isUndefined(isFamilySharingDisabledByFop)) __obj.updateDynamic("isFamilySharingDisabledByFop")(isFamilySharingDisabledByFop.asInstanceOf[js.Any])
    if (!js.isUndefined(isInMyBooks)) __obj.updateDynamic("isInMyBooks")(isInMyBooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isPreordered)) __obj.updateDynamic("isPreordered")(isPreordered.asInstanceOf[js.Any])
    if (!js.isUndefined(isPurchased)) __obj.updateDynamic("isPurchased")(isPurchased.asInstanceOf[js.Any])
    if (!js.isUndefined(isUploaded)) __obj.updateDynamic("isUploaded")(isUploaded.asInstanceOf[js.Any])
    if (readingPosition != null) __obj.updateDynamic("readingPosition")(readingPosition.asInstanceOf[js.Any])
    if (rentalPeriod != null) __obj.updateDynamic("rentalPeriod")(rentalPeriod.asInstanceOf[js.Any])
    if (rentalState != null) __obj.updateDynamic("rentalState")(rentalState.asInstanceOf[js.Any])
    if (review != null) __obj.updateDynamic("review")(review.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (userUploadedVolumeInfo != null) __obj.updateDynamic("userUploadedVolumeInfo")(userUploadedVolumeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AcquiredTime]
  }
}

