package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleCloudVideointelligenceV1beta1_LabelLocation extends js.Object {
  /** Confidence that the label is accurate. Range: [0, 1]. */
  var confidence: js.UndefOr[scala.Double] = js.undefined
  /** Label level. */
  var level: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Video segment. Set to [-1, -1] for video-level labels.
               * Set to [timestamp, timestamp] for frame-level labels.
               * Otherwise, corresponds to one of `AnnotateSpec.segments`
               * (if specified) or to shot boundaries (if requested).
               */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1beta1_VideoSegment] = js.undefined
}

