package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GooglePrivacyDlpV2beta1FixedSizeBucketingConfig extends js.Object {
  /**
               * Size of each bucket (except for minimum and maximum buckets). So if
               * `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the
               * following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60,
               * 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works. [Required].
               */
  var bucketSize: js.UndefOr[scala.Double] = js.undefined
  /**
               * Lower bound value of buckets. All values less than `lower_bound` are
               * grouped together into a single bucket; for example if `lower_bound` = 10,
               * then all values less than 10 are replaced with the value “-10”. [Required].
               */
  var lowerBound: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
  /**
               * Upper bound value of buckets. All values greater than upper_bound are
               * grouped together into a single bucket; for example if `upper_bound` = 89,
               * then all values greater than 89 are replaced with the value “89+”.
               * [Required].
               */
  var upperBound: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
}

