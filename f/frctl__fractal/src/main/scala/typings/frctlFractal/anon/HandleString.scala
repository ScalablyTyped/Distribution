package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleString extends js.Object {
  var handle: js.UndefOr[String] = js.undefined
}

object HandleString {
  @scala.inline
  def apply(handle: String = null): HandleString = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleString]
  }
}

