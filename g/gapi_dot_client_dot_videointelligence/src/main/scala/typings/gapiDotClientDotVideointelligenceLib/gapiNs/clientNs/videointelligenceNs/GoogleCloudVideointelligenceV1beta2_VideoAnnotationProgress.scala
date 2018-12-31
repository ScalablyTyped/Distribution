package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2_VideoAnnotationProgress extends js.Object {
  /**
    * Video file location in
    * [Google Cloud Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Approximate percentage processed thus far.
    * Guaranteed to be 100 when fully processed.
    */
  var progressPercent: js.UndefOr[scala.Double] = js.undefined
  /** Time when the request was received. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Time of the most recent update. */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

