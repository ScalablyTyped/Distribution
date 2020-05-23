package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserName extends js.Object {
  var advertiserName: js.UndefOr[String] = js.undefined
  var destinationUrl: js.UndefOr[String] = js.undefined
  var displayFrequency: js.UndefOr[Double] = js.undefined
  var displaySeconds: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var imageMime: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var openInTrunk: js.UndefOr[Boolean] = js.undefined
  var score: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AdvertiserName {
  @scala.inline
  def apply(
    advertiserName: String = null,
    destinationUrl: String = null,
    displayFrequency: js.UndefOr[Double] = js.undefined,
    displaySeconds: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    html: String = null,
    id: js.UndefOr[Double] = js.undefined,
    image: String = null,
    imageMime: String = null,
    imageUrl: String = null,
    openInTrunk: js.UndefOr[Boolean] = js.undefined,
    score: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): AdvertiserName = {
    val __obj = js.Dynamic.literal()
    if (advertiserName != null) __obj.updateDynamic("advertiserName")(advertiserName.asInstanceOf[js.Any])
    if (destinationUrl != null) __obj.updateDynamic("destinationUrl")(destinationUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(displayFrequency)) __obj.updateDynamic("displayFrequency")(displayFrequency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displaySeconds)) __obj.updateDynamic("displaySeconds")(displaySeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageMime != null) __obj.updateDynamic("imageMime")(imageMime.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(openInTrunk)) __obj.updateDynamic("openInTrunk")(openInTrunk.get.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertiserName]
  }
}

