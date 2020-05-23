package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebImage extends js.Object {
  /** (Deprecated) Overall relevancy score for the image. */
  var score: js.UndefOr[Double] = js.undefined
  /** The result image URL. */
  var url: js.UndefOr[String] = js.undefined
}

object WebImage {
  @scala.inline
  def apply(score: js.UndefOr[Double] = js.undefined, url: String = null): WebImage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebImage]
  }
}

