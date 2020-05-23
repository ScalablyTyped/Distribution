package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  /** Filters the contextual identity by name. */
  var name: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String = null): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

