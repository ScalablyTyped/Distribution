package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndoorLevel extends js.Object {
  /** The name of this level. */
  var name: js.UndefOr[String] = js.undefined
}

object IndoorLevel {
  @scala.inline
  def apply(name: String = null): IndoorLevel = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndoorLevel]
  }
}

