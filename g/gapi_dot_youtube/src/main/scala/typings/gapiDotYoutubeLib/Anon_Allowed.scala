package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allowed extends js.Object {
  /**
    * A list of region codes that identify countries where the video is viewable. If this property is present and a country is not listed in its value, then the video is blocked from appearing in that country. If this property is present and contains an empty list, the video is blocked in all countries.
    */
  var allowed: js.Array[java.lang.String]
  /**
    * A list of region codes that identify countries where the video is blocked. If this property is present and a country is not listed in its value, then the video is viewable in that country. If this property is present and contains an empty list, the video is viewable in all countries.
    */
  var blocked: js.Array[java.lang.String]
}

object Anon_Allowed {
  @scala.inline
  def apply(allowed: js.Array[java.lang.String], blocked: js.Array[java.lang.String]): Anon_Allowed = {
    val __obj = js.Dynamic.literal(allowed = allowed, blocked = blocked)
  
    __obj.asInstanceOf[Anon_Allowed]
  }
}

