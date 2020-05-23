package typings.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Required extends js.Object {
  /** A list of methods for which this property is required on requests. */
  var required: js.UndefOr[js.Array[String]] = js.undefined
}

object Required {
  @scala.inline
  def apply(required: js.Array[String] = null): Required = {
    val __obj = js.Dynamic.literal()
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
}

