package typings.gapiDotClientDotVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPage extends js.Object {
  /** (Deprecated) Overall relevancy score for the web page. */
  var score: js.UndefOr[Double] = js.undefined
  /** The result web page URL. */
  var url: js.UndefOr[String] = js.undefined
}

object WebPage {
  @scala.inline
  def apply(score: Int | Double = null, url: String = null): WebPage = {
    val __obj = js.Dynamic.literal()
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebPage]
  }
}

