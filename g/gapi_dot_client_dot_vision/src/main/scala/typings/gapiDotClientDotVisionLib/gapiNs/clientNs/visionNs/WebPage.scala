package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPage extends js.Object {
  /** (Deprecated) Overall relevancy score for the web page. */
  var score: js.UndefOr[scala.Double] = js.undefined
  /** The result web page URL. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object WebPage {
  @scala.inline
  def apply(score: scala.Int | scala.Double = null, url: java.lang.String = null): WebPage = {
    val __obj = js.Dynamic.literal()
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebPage]
  }
}

