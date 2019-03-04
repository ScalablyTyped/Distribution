package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  /** contains a human-readable representation of the duration. */
  var text: java.lang.String
  /** indicates the duration in seconds. */
  var value: scala.Double
}

object Duration {
  @scala.inline
  def apply(text: java.lang.String, value: scala.Double): Duration = {
    val __obj = js.Dynamic.literal(text = text, value = value)
  
    __obj.asInstanceOf[Duration]
  }
}

