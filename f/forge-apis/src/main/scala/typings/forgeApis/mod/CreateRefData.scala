package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRefData extends js.Object {
  var id: String
  var meta: js.UndefOr[CreateRefDataMeta] = js.undefined
  var `type`: String
}

object CreateRefData {
  @scala.inline
  def apply(id: String, `type`: String, meta: CreateRefDataMeta = null): CreateRefData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRefData]
  }
}

