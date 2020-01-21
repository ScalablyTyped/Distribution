package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suffix extends js.Object {
  /** Suffix option. */
  var option: js.UndefOr[String] = js.undefined
}

object Suffix {
  @scala.inline
  def apply(option: String = null): Suffix = {
    val __obj = js.Dynamic.literal()
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suffix]
  }
}

