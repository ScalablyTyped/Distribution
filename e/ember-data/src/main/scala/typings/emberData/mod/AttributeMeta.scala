package typings.emberData.mod

import typings.emberData.emberDataBooleans.`true`
import typings.emberData.emberDataStrings.boolean
import typings.emberData.emberDataStrings.date
import typings.emberData.emberDataStrings.number
import typings.emberData.emberDataStrings.string
import typings.emberData.mod.DS.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeMeta[Model /* <: Model */] extends js.Object {
  
  var isAttribute: `true` = js.native
  
  var name: AttributesFor[Model] = js.native
  
  var options: js.Object = js.native
  
  var parentType: Model = js.native
  
  var `type`: /* keyof ember-data.ember-data/types/registries/transform.TransformRegistry */ string | boolean | number | date = js.native
}
object AttributeMeta {
  
  @scala.inline
  def apply[Model /* <: typings.emberData.mod.DS.Model */](
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
  
  @scala.inline
  implicit class AttributeMetaOps[Self <: AttributeMeta[_], Model /* <: Model */] (val x: Self with AttributeMeta[Model]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsAttribute(value: `true`): Self = this.set("isAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AttributesFor[Model]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentType(value: Model): Self = this.set("parentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: /* keyof ember-data.ember-data/types/registries/transform.TransformRegistry */ string | boolean | number | date
    ): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
