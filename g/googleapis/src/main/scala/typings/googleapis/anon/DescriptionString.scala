package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescriptionString extends js.Object {
  var description: js.UndefOr[String] = js.native
}

object DescriptionString {
  @scala.inline
  def apply(description: String = null): DescriptionString = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionString]
  }
}

