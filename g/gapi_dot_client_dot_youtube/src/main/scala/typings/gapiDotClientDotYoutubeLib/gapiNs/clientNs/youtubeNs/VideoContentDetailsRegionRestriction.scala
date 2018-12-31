package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoContentDetailsRegionRestriction extends js.Object {
  /**
    * A list of region codes that identify countries where the video is viewable. If this property is present and a country is not listed in its value, then
    * the video is blocked from appearing in that country. If this property is present and contains an empty list, the video is blocked in all countries.
    */
  var allowed: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A list of region codes that identify countries where the video is blocked. If this property is present and a country is not listed in its value, then
    * the video is viewable in that country. If this property is present and contains an empty list, the video is viewable in all countries.
    */
  var blocked: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

