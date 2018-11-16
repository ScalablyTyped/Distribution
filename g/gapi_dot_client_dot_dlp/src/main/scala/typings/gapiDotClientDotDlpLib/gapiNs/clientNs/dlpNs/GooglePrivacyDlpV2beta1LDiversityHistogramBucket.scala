package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GooglePrivacyDlpV2beta1LDiversityHistogramBucket extends js.Object {
  /** Total number of records in this bucket. */
  var bucketSize: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Sample of equivalence classes in this bucket. The total number of
               * classes returned per bucket is capped at 20.
               */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1LDiversityEquivalenceClass]] = js.undefined
  /**
               * Lower bound on the sensitive value frequencies of the equivalence
               * classes in this bucket.
               */
  var sensitiveValueFrequencyLowerBound: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Upper bound on the sensitive value frequencies of the equivalence
               * classes in this bucket.
               */
  var sensitiveValueFrequencyUpperBound: js.UndefOr[java.lang.String] = js.undefined
}

