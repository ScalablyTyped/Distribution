package typings.emberDashData.emberDashDataMod

import typings.emberDashData.emberDashDataMod.DSNs.Model
import typings.emberDashData.emberDashDataNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeMeta[Model /* <: Model */] extends js.Object {
  var isAttribute: `true`
  var name: AttributesFor[Model]
  var options: js.Object
  var parentType: Model
  var `type`: String
}

object AttributeMeta {
  @scala.inline
  def apply[Model /* <: Model */](
    isAttribute: `true`,
    name: AttributesFor[Model],
    options: js.Object,
    parentType: Model,
    `type`: String
  ): AttributeMeta[Model] = {
    val __obj = js.Dynamic.literal(isAttribute = isAttribute, name = name.asInstanceOf[js.Any], options = options, parentType = parentType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AttributeMeta[Model]]
  }
}

