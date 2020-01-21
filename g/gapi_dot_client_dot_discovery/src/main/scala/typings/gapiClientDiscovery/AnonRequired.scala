package typings.gapiClientDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequired extends js.Object {
  /** A list of methods for which this property is required on requests. */
  var required: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonRequired {
  @scala.inline
  def apply(required: js.Array[String] = null): AnonRequired = {
    val __obj = js.Dynamic.literal()
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequired]
  }
}

