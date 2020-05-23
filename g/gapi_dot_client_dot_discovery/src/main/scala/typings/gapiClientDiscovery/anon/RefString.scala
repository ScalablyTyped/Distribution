package typings.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefString extends js.Object {
  /** Schema ID for the response schema. */
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
}

object RefString {
  @scala.inline
  def apply($ref: String = null): RefString = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefString]
  }
}

