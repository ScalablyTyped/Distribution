package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Id extends js.Object {
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Anon_Id {
  @scala.inline
  def apply(id: String = null, label: String = null, `type`: String = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

