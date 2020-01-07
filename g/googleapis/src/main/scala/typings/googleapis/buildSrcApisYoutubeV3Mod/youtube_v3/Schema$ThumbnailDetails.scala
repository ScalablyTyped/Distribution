package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal representation of thumbnails for a YouTube resource.
  */
@js.native
trait Schema$ThumbnailDetails extends js.Object {
  /**
    * The default image for this resource.
    */
  var default: js.UndefOr[Schema$Thumbnail] = js.native
  /**
    * The high quality image for this resource.
    */
  var high: js.UndefOr[Schema$Thumbnail] = js.native
  /**
    * The maximum resolution quality image for this resource.
    */
  var maxres: js.UndefOr[Schema$Thumbnail] = js.native
  /**
    * The medium quality image for this resource.
    */
  var medium: js.UndefOr[Schema$Thumbnail] = js.native
  /**
    * The standard quality image for this resource.
    */
  var standard: js.UndefOr[Schema$Thumbnail] = js.native
}

object Schema$ThumbnailDetails {
  @scala.inline
  def apply(
    default: Schema$Thumbnail = null,
    high: Schema$Thumbnail = null,
    maxres: Schema$Thumbnail = null,
    medium: Schema$Thumbnail = null,
    standard: Schema$Thumbnail = null
  ): Schema$ThumbnailDetails = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (maxres != null) __obj.updateDynamic("maxres")(maxres.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (standard != null) __obj.updateDynamic("standard")(standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ThumbnailDetails]
  }
}

