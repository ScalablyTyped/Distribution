package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKind extends js.Object {
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object AnonKind {
  @scala.inline
  def apply(id: String = null, kind: String = null): AnonKind = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKind]
  }
}

