package typings.emberData.mod

import typings.emberData.emberDataBooleans.`true`
import typings.emberData.emberDataStrings.boolean
import typings.emberData.emberDataStrings.date
import typings.emberData.emberDataStrings.number
import typings.emberData.emberDataStrings.string
import typings.emberData.mod.DS.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeMeta[Model /* <: Model */] extends js.Object {
  var isAttribute: `true`
  var name: AttributesFor[Model]
  var options: js.Object
  var parentType: Model
  var `type`: /* keyof ember-data.ember-data/types/registries/transform.TransformRegistry */ string | boolean | number | date
}

object AttributeMeta {
  @scala.inline
  def apply[/* <: typings.emberData.mod.DS.Model */ Model](
    isAttribute: `true`,
    name: AttributesFor[Model],
    options: js.Object,
    parentType: Model,
    `type`: /* keyof ember-data.ember-data/types/registries/transform.TransformRegistry */ string | boolean | number | date
  ): AttributeMeta[Model] = {
    val __obj = js.Dynamic.literal(isAttribute = isAttribute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeMeta[Model]]
  }
}

