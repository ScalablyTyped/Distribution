package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1_SafeSearchAnnotation extends js.Object {
  /** Likelihood of adult content. */
  var adult: js.UndefOr[java.lang.String] = js.undefined
  /** Likelihood of medical content. */
  var medical: js.UndefOr[java.lang.String] = js.undefined
  /** Likelihood of racy content. */
  var racy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Likelihood that an obvious modification was made to the original
    * version to make it appear funny or offensive.
    */
  var spoof: js.UndefOr[java.lang.String] = js.undefined
  /** Video time offset in microseconds. */
  var timeOffset: js.UndefOr[java.lang.String] = js.undefined
  /** Likelihood of violent content. */
  var violent: js.UndefOr[java.lang.String] = js.undefined
}

