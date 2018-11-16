package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CropHint extends js.Object {
  /**
               * The bounding polygon for the crop region. The coordinates of the bounding
               * box are in the original image's scale, as returned in `ImageParams`.
               */
  var boundingPoly: js.UndefOr[BoundingPoly] = js.undefined
  /** Confidence of this being a salient region.  Range [0, 1]. */
  var confidence: js.UndefOr[scala.Double] = js.undefined
  /**
               * Fraction of importance of this salient region with respect to the original
               * image.
               */
  var importanceFraction: js.UndefOr[scala.Double] = js.undefined
}

