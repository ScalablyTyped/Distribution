package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DescriptionString extends js.Object {
  var description: js.UndefOr[String] = js.native
}

object Anon_DescriptionString {
  @scala.inline
  def apply(description: String = null): Anon_DescriptionString = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionString]
  }
}

