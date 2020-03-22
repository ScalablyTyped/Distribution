package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdvertiserName extends js.Object {
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

object AnonAdvertiserName {
  @scala.inline
  def apply(
    advertiserName: String = null,
    destinationUrl: String = null,
    displayFrequency: Int | Double = null,
    displaySeconds: Int | Double = null,
    height: Int | Double = null,
    html: String = null,
    id: Int | Double = null,
    image: String = null,
    imageMime: String = null,
    imageUrl: String = null,
    openInTrunk: js.UndefOr[Boolean] = js.undefined,
    score: Int | Double = null,
    width: Int | Double = null
  ): AnonAdvertiserName = {
    val __obj = js.Dynamic.literal()
    if (advertiserName != null) __obj.updateDynamic("advertiserName")(advertiserName.asInstanceOf[js.Any])
    if (destinationUrl != null) __obj.updateDynamic("destinationUrl")(destinationUrl.asInstanceOf[js.Any])
    if (displayFrequency != null) __obj.updateDynamic("displayFrequency")(displayFrequency.asInstanceOf[js.Any])
    if (displaySeconds != null) __obj.updateDynamic("displaySeconds")(displaySeconds.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageMime != null) __obj.updateDynamic("imageMime")(imageMime.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(openInTrunk)) __obj.updateDynamic("openInTrunk")(openInTrunk.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdvertiserName]
  }
}

