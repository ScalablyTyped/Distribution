package typings.atFrctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleString extends js.Object {
  var handle: js.UndefOr[String] = js.undefined
}

object Anon_HandleString {
  @scala.inline
  def apply(handle: String = null): Anon_HandleString = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HandleString]
  }
}

