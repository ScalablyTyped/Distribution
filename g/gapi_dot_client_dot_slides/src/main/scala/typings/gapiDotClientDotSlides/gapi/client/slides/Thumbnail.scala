package typings.gapiDotClientDotSlides.gapi.client.slides

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
  var contentUrl: js.UndefOr[String] = js.undefined
  /** The positive height in pixels of the thumbnail image. */
  var height: js.UndefOr[Double] = js.undefined
  /** The positive width in pixels of the thumbnail image. */
  var width: js.UndefOr[Double] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(contentUrl: String = null, height: Int | Double = null, width: Int | Double = null): Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

