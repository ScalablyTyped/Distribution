package typings.gapiDotClientDotStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  /**
    * Required. A name assigned to this Level, restricted to 3 characters.
    * Consider how the elevator buttons would be labeled for this level if there
    * was an elevator.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Floor number, used for ordering. 0 indicates the ground level, 1 indicates
    * the first level above ground level, -1 indicates the first level under
    * ground level. Non-integer values are OK.
    */
  var number: js.UndefOr[Double] = js.undefined
}

object Level {
  @scala.inline
  def apply(name: String = null, number: Int | Double = null): Level = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

