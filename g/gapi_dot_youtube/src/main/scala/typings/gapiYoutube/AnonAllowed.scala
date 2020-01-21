package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowed extends js.Object {
  /**
    * A list of region codes that identify countries where the video is viewable. If this property is present and a country is not listed in its value, then the video is blocked from appearing in that country. If this property is present and contains an empty list, the video is blocked in all countries.
    */
  var allowed: js.Array[String]
  /**
    * A list of region codes that identify countries where the video is blocked. If this property is present and a country is not listed in its value, then the video is viewable in that country. If this property is present and contains an empty list, the video is viewable in all countries.
    */
  var blocked: js.Array[String]
}

object AnonAllowed {
  @scala.inline
  def apply(allowed: js.Array[String], blocked: js.Array[String]): AnonAllowed = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllowed]
  }
}

