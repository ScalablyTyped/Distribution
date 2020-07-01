package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefString extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
}

object RefString {
  @scala.inline
  def apply($ref: String = null): RefString = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefString]
  }
}

