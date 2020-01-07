package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about monetization of a YouTube Video.
  */
@js.native
trait Schema$VideoMonetizationDetails extends js.Object {
  /**
    * The value of access indicates whether the video can be monetized or not.
    */
  var access: js.UndefOr[Schema$AccessPolicy] = js.native
}

object Schema$VideoMonetizationDetails {
  @scala.inline
  def apply(access: Schema$AccessPolicy = null): Schema$VideoMonetizationDetails = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoMonetizationDetails]
  }
}

