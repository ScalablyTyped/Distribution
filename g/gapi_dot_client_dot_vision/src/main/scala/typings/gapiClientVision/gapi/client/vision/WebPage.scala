package typings.gapiClientVision.gapi.client.vision

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
  def apply(score: js.UndefOr[Double] = js.undefined, url: String = null): WebPage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPage]
  }
}

