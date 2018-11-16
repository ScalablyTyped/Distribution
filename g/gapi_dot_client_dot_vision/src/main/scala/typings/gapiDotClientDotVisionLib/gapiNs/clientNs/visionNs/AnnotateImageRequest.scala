package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnnotateImageRequest extends js.Object {
  /** Requested features. */
  var features: js.UndefOr[js.Array[Feature]] = js.undefined
  /** The image to be processed. */
  var image: js.UndefOr[Image] = js.undefined
  /** Additional context that may accompany the image. */
  var imageContext: js.UndefOr[ImageContext] = js.undefined
}

