package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Video extends js.Object {
  /** The video source's unique identifier for this video. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The video source. */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
               * An URL to a video. The URL is valid as long as the source video
               * exists and sharing settings do not change.
               */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The properties of the video. */
  var videoProperties: js.UndefOr[VideoProperties] = js.undefined
}

