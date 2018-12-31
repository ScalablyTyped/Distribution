package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  /**
    * The content URL of the thumbnail image.
    *
    * The URL to the image has a default lifetime of 30 minutes.
    * This URL is tagged with the account of the requester. Anyone with the URL
    * effectively accesses the image as the original requester. Access to the
    * image may be lost if the presentation's sharing settings change.
    * The mime type of the thumbnail image is the same as specified in the
    * `GetPageThumbnailRequest`.
    */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The positive height in pixels of the thumbnail image. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The positive width in pixels of the thumbnail image. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

