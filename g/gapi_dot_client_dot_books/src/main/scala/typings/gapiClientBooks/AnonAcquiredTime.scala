package typings.gapiClientBooks

import typings.gapiClientBooks.gapi.client.books.ReadingPosition
import typings.gapiClientBooks.gapi.client.books.Review
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcquiredTime extends js.Object {
  /**
    * Timestamp when this volume was acquired by the user. (RFC 3339 UTC date-time format) Acquiring includes purchase, user upload, receiving family
    * sharing, etc.
    */
  var acquiredTime: js.UndefOr[String] = js.undefined
  /** How this volume was acquired. */
  var acquisitionType: js.UndefOr[Double] = js.undefined
  /** Copy/Paste accounting information. */
  var copy: js.UndefOr[AnonAllowedCharacterCountLimitType] = js.undefined
  /** Whether this volume is purchased, sample, pd download etc. */
  var entitlementType: js.UndefOr[Double] = js.undefined
  /** Information on the ability to share with the family. */
  var familySharing: js.UndefOr[AnonFamilyRole] = js.undefined
  /** Whether or not the user shared this volume with the family. */
  var isFamilySharedFromUser: js.UndefOr[Boolean] = js.undefined
  /** Whether or not the user received this volume through family sharing. */
  var isFamilySharedToUser: js.UndefOr[Boolean] = js.undefined
  /** Deprecated: Replaced by familySharing. */
  var isFamilySharingAllowed: js.UndefOr[Boolean] = js.undefined
  /** Deprecated: Replaced by familySharing. */
  var isFamilySharingDisabledByFop: js.UndefOr[Boolean] = js.undefined
  /** Whether or not this volume is currently in "my books." */
  var isInMyBooks: js.UndefOr[Boolean] = js.undefined
  /** Whether or not this volume was pre-ordered by the authenticated user making the request. (In LITE projection.) */
  var isPreordered: js.UndefOr[Boolean] = js.undefined
  /** Whether or not this volume was purchased by the authenticated user making the request. (In LITE projection.) */
  var isPurchased: js.UndefOr[Boolean] = js.undefined
  /** Whether or not this volume was user uploaded. */
  var isUploaded: js.UndefOr[Boolean] = js.undefined
  /** The user's current reading position in the volume, if one is available. (In LITE projection.) */
  var readingPosition: js.UndefOr[ReadingPosition] = js.undefined
  /** Period during this book is/was a valid rental. */
  var rentalPeriod: js.UndefOr[AnonEndUtcSec] = js.undefined
  /** Whether this book is an active or an expired rental. */
  var rentalState: js.UndefOr[String] = js.undefined
  /** This user's review of this volume, if one exists. */
  var review: js.UndefOr[Review] = js.undefined
  /**
    * Timestamp when this volume was last modified by a user action, such as a reading position update, volume purchase or writing a review. (RFC 3339 UTC
    * date-time format).
    */
  var updated: js.UndefOr[String] = js.undefined
  var userUploadedVolumeInfo: js.UndefOr[AnonProcessingState] = js.undefined
}

object AnonAcquiredTime {
  @scala.inline
  def apply(
    acquiredTime: String = null,
    acquisitionType: Int | Double = null,
    copy: AnonAllowedCharacterCountLimitType = null,
    entitlementType: Int | Double = null,
    familySharing: AnonFamilyRole = null,
    isFamilySharedFromUser: js.UndefOr[Boolean] = js.undefined,
    isFamilySharedToUser: js.UndefOr[Boolean] = js.undefined,
    isFamilySharingAllowed: js.UndefOr[Boolean] = js.undefined,
    isFamilySharingDisabledByFop: js.UndefOr[Boolean] = js.undefined,
    isInMyBooks: js.UndefOr[Boolean] = js.undefined,
    isPreordered: js.UndefOr[Boolean] = js.undefined,
    isPurchased: js.UndefOr[Boolean] = js.undefined,
    isUploaded: js.UndefOr[Boolean] = js.undefined,
    readingPosition: ReadingPosition = null,
    rentalPeriod: AnonEndUtcSec = null,
    rentalState: String = null,
    review: Review = null,
    updated: String = null,
    userUploadedVolumeInfo: AnonProcessingState = null
  ): AnonAcquiredTime = {
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
    __obj.asInstanceOf[AnonAcquiredTime]
  }
}

