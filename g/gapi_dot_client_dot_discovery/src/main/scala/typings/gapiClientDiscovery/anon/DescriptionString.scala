package typings.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionString extends js.Object {
  /** Description of scope. */
  var description: js.UndefOr[String] = js.undefined
}

object DescriptionString {
  @scala.inline
  def apply(description: String = null): DescriptionString = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionString]
  }
}

