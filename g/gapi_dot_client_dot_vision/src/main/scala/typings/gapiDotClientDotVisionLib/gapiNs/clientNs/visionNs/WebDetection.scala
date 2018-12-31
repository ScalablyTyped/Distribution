package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebDetection extends js.Object {
  /**
    * Fully matching images from the Internet.
    * Can include resized copies of the query image.
    */
  var fullMatchingImages: js.UndefOr[js.Array[WebImage]] = js.undefined
  /** Web pages containing the matching images from the Internet. */
  var pagesWithMatchingImages: js.UndefOr[js.Array[WebPage]] = js.undefined
  /**
    * Partial matching images from the Internet.
    * Those images are similar enough to share some key-point features. For
    * example an original image will likely have partial matching for its crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[WebImage]] = js.undefined
  /** The visually similar image results. */
  var visuallySimilarImages: js.UndefOr[js.Array[WebImage]] = js.undefined
  /** Deduced entities from similar images on the Internet. */
  var webEntities: js.UndefOr[js.Array[WebEntity]] = js.undefined
}

