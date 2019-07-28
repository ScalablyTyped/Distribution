package typings.gapiDotClientDotDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Required extends js.Object {
  /** A list of methods for which this property is required on requests. */
  var required: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Required {
  @scala.inline
  def apply(required: js.Array[String] = null): Anon_Required = {
    val __obj = js.Dynamic.literal()
    if (required != null) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[Anon_Required]
  }
}

