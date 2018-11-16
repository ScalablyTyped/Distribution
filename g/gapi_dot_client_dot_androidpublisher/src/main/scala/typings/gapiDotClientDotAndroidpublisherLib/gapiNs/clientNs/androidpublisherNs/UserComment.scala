package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UserComment extends js.Object {
  /** Integer Android SDK version of the user's device at the time the review was written, e.g. 23 is Marshmallow. May be absent. */
  var androidOsVersion: js.UndefOr[scala.Double] = js.undefined
  /** Integer version code of the app as installed at the time the review was written. May be absent. */
  var appVersionCode: js.UndefOr[scala.Double] = js.undefined
  /** String version name of the app as installed at the time the review was written. May be absent. */
  var appVersionName: js.UndefOr[java.lang.String] = js.undefined
  /** Codename for the reviewer's device, e.g. klte, flounder. May be absent. */
  var device: js.UndefOr[java.lang.String] = js.undefined
  /** Some information about the characteristics of the user's device */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
  /** The last time at which this comment was updated. */
  var lastModified: js.UndefOr[Timestamp] = js.undefined
  /** Untranslated text of the review, in the case where the review has been translated. If the review has not been translated this is left blank. */
  var originalText: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Language code for the reviewer. This is taken from the device settings so is not guaranteed to match the language the review is written in. May be
               * absent.
               */
  var reviewerLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** The star rating associated with the review, from 1 to 5. */
  var starRating: js.UndefOr[scala.Double] = js.undefined
  /**
               * The content of the comment, i.e. review body. In some cases users have been able to write a review with separate title and body; in those cases the
               * title and body are concatenated and separated by a tab character.
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Number of users who have given this review a thumbs down */
  var thumbsDownCount: js.UndefOr[scala.Double] = js.undefined
  /** Number of users who have given this review a thumbs up */
  var thumbsUpCount: js.UndefOr[scala.Double] = js.undefined
}

