package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcquiredTime extends js.Object {
  /**
    * Timestamp when this volume was acquired by the user. (RFC 3339 UTC date-time format) Acquiring includes purchase, user upload, receiving family
    * sharing, etc.
    */
  var acquiredTime: js.UndefOr[java.lang.String] = js.undefined
  /** How this volume was acquired. */
  var acquisitionType: js.UndefOr[scala.Double] = js.undefined
  /** Copy/Paste accounting information. */
  var copy: js.UndefOr[Anon_AllowedCharacterCountLimitType] = js.undefined
  /** Whether this volume is purchased, sample, pd download etc. */
  var entitlementType: js.UndefOr[scala.Double] = js.undefined
  /** Information on the ability to share with the family. */
  var familySharing: js.UndefOr[Anon_FamilyRole] = js.undefined
  /** Whether or not the user shared this volume with the family. */
  var isFamilySharedFromUser: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not the user received this volume through family sharing. */
  var isFamilySharedToUser: js.UndefOr[scala.Boolean] = js.undefined
  /** Deprecated: Replaced by familySharing. */
  var isFamilySharingAllowed: js.UndefOr[scala.Boolean] = js.undefined
  /** Deprecated: Replaced by familySharing. */
  var isFamilySharingDisabledByFop: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not this volume is currently in "my books." */
  var isInMyBooks: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not this volume was pre-ordered by the authenticated user making the request. (In LITE projection.) */
  var isPreordered: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not this volume was purchased by the authenticated user making the request. (In LITE projection.) */
  var isPurchased: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not this volume was user uploaded. */
  var isUploaded: js.UndefOr[scala.Boolean] = js.undefined
  /** The user's current reading position in the volume, if one is available. (In LITE projection.) */
  var readingPosition: js.UndefOr[gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.ReadingPosition] = js.undefined
  /** Period during this book is/was a valid rental. */
  var rentalPeriod: js.UndefOr[Anon_EndUtcSec] = js.undefined
  /** Whether this book is an active or an expired rental. */
  var rentalState: js.UndefOr[java.lang.String] = js.undefined
  /** This user's review of this volume, if one exists. */
  var review: js.UndefOr[gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.Review] = js.undefined
  /**
    * Timestamp when this volume was last modified by a user action, such as a reading position update, volume purchase or writing a review. (RFC 3339 UTC
    * date-time format).
    */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  var userUploadedVolumeInfo: js.UndefOr[Anon_ProcessingState] = js.undefined
}

object Anon_AcquiredTime {
  @scala.inline
  def apply(
    acquiredTime: java.lang.String = null,
    acquisitionType: scala.Int | scala.Double = null,
    copy: Anon_AllowedCharacterCountLimitType = null,
    entitlementType: scala.Int | scala.Double = null,
    familySharing: Anon_FamilyRole = null,
    isFamilySharedFromUser: js.UndefOr[scala.Boolean] = js.undefined,
    isFamilySharedToUser: js.UndefOr[scala.Boolean] = js.undefined,
    isFamilySharingAllowed: js.UndefOr[scala.Boolean] = js.undefined,
    isFamilySharingDisabledByFop: js.UndefOr[scala.Boolean] = js.undefined,
    isInMyBooks: js.UndefOr[scala.Boolean] = js.undefined,
    isPreordered: js.UndefOr[scala.Boolean] = js.undefined,
    isPurchased: js.UndefOr[scala.Boolean] = js.undefined,
    isUploaded: js.UndefOr[scala.Boolean] = js.undefined,
    readingPosition: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.ReadingPosition = null,
    rentalPeriod: Anon_EndUtcSec = null,
    rentalState: java.lang.String = null,
    review: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.Review = null,
    updated: java.lang.String = null,
    userUploadedVolumeInfo: Anon_ProcessingState = null
  ): Anon_AcquiredTime = {
    val __obj = js.Dynamic.literal()
    if (acquiredTime != null) __obj.updateDynamic("acquiredTime")(acquiredTime)
    if (acquisitionType != null) __obj.updateDynamic("acquisitionType")(acquisitionType.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (entitlementType != null) __obj.updateDynamic("entitlementType")(entitlementType.asInstanceOf[js.Any])
    if (familySharing != null) __obj.updateDynamic("familySharing")(familySharing)
    if (!js.isUndefined(isFamilySharedFromUser)) __obj.updateDynamic("isFamilySharedFromUser")(isFamilySharedFromUser)
    if (!js.isUndefined(isFamilySharedToUser)) __obj.updateDynamic("isFamilySharedToUser")(isFamilySharedToUser)
    if (!js.isUndefined(isFamilySharingAllowed)) __obj.updateDynamic("isFamilySharingAllowed")(isFamilySharingAllowed)
    if (!js.isUndefined(isFamilySharingDisabledByFop)) __obj.updateDynamic("isFamilySharingDisabledByFop")(isFamilySharingDisabledByFop)
    if (!js.isUndefined(isInMyBooks)) __obj.updateDynamic("isInMyBooks")(isInMyBooks)
    if (!js.isUndefined(isPreordered)) __obj.updateDynamic("isPreordered")(isPreordered)
    if (!js.isUndefined(isPurchased)) __obj.updateDynamic("isPurchased")(isPurchased)
    if (!js.isUndefined(isUploaded)) __obj.updateDynamic("isUploaded")(isUploaded)
    if (readingPosition != null) __obj.updateDynamic("readingPosition")(readingPosition)
    if (rentalPeriod != null) __obj.updateDynamic("rentalPeriod")(rentalPeriod)
    if (rentalState != null) __obj.updateDynamic("rentalState")(rentalState)
    if (review != null) __obj.updateDynamic("review")(review)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (userUploadedVolumeInfo != null) __obj.updateDynamic("userUploadedVolumeInfo")(userUploadedVolumeInfo)
    __obj.asInstanceOf[Anon_AcquiredTime]
  }
}

