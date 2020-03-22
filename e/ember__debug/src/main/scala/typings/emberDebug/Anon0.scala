package typings.emberDebug

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(id: String = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

