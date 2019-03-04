package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitStop extends js.Object {
  /** the location of the transit station/stop, represented as a `lat` and `lng` field. */
  var location: LatLngLiteral
  /** the name of the transit station/stop. eg. "Union Square". */
  var name: java.lang.String
}

object TransitStop {
  @scala.inline
  def apply(location: LatLngLiteral, name: java.lang.String): TransitStop = {
    val __obj = js.Dynamic.literal(location = location, name = name)
  
    __obj.asInstanceOf[TransitStop]
  }
}

