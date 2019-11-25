package typings.gapiDotClientDotDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionString extends js.Object {
  /** Description of scope. */
  var description: js.UndefOr[String] = js.undefined
}

object Anon_DescriptionString {
  @scala.inline
  def apply(description: String = null): Anon_DescriptionString = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionString]
  }
}

