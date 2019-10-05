package typings.gapiDotClientDotVision.gapi.client.vision

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
  def apply(score: Int | Double = null, url: String = null): WebImage = {
    val __obj = js.Dynamic.literal()
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebImage]
  }
}

