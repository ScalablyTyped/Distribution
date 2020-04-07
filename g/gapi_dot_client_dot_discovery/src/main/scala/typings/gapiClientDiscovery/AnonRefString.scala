package typings.gapiClientDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRefString extends js.Object {
  /** Schema ID for the response schema. */
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
}

object AnonRefString {
  @scala.inline
  def apply($ref: String = null): AnonRefString = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRefString]
  }
}

