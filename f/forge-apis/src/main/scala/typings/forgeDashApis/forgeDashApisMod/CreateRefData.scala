package typings.forgeDashApis.forgeDashApisMod

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
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[CreateRefData]
  }
}

