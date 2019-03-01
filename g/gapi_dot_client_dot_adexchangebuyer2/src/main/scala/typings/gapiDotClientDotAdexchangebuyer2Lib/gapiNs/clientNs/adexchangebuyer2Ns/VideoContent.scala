package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoContent extends js.Object {
  /** The URL to fetch a video ad. */
  var videoUrl: js.UndefOr[java.lang.String] = js.undefined
}

object VideoContent {
  @scala.inline
  def apply(videoUrl: java.lang.String = null): VideoContent = {
    val __obj = js.Dynamic.literal()
    if (videoUrl != null) __obj.updateDynamic("videoUrl")(videoUrl)
    __obj.asInstanceOf[VideoContent]
  }
}

