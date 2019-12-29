package typings.fundamentalDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameString extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object Anon_ClassNameString {
  @scala.inline
  def apply(className: String = null): Anon_ClassNameString = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameString]
  }
}

