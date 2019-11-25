package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  /** contains a human-readable representation of the duration. */
  var text: String
  /** indicates the duration in seconds. */
  var value: Double
}

object Duration {
  @scala.inline
  def apply(text: String, value: Double): Duration = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Duration]
  }
}

