package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcquisitionType extends js.Object {
  /**
    * Timestamp when this volume was acquired by the user. (RFC 3339 UTC date-time format) Acquiring includes purchase, user upload, receiving family
    * sharing, etc.
    */
  var acquiredTime: js.UndefOr[java.lang.String] = js.undefined
  /** How this volume was acquired. */
  var acquisitionType: js.UndefOr[scala.Double] = js.undefined
  /** Copy/Paste accounting information. */
  var copy: js.UndefOr[Anon_Updated] = js.undefined
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

