package typings.gitlab.requestHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sudo extends js.Object {
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object Sudo {
  @scala.inline
  def apply(sudo: String | Double = null): Sudo = {
    val __obj = js.Dynamic.literal()
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sudo]
  }
}

