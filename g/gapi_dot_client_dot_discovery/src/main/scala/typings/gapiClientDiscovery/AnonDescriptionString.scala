package typings.gapiClientDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionString extends js.Object {
  /** Description of scope. */
  var description: js.UndefOr[String] = js.undefined
}

object AnonDescriptionString {
  @scala.inline
  def apply(description: String = null): AnonDescriptionString = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionString]
  }
}

