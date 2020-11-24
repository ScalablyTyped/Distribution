package typings.emberData.mod

import typings.emberData.emberDataBooleans.`true`
import typings.emberData.emberDataStrings.belongsTo
import typings.emberData.emberDataStrings.hasMany
import typings.emberData.mod.DS.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipMeta[Model /* <: Model */] extends js.Object {
  
  var isRelationship: `true` = js.native
  
  var key: RelationshipsFor[Model] = js.native
  
  var kind: belongsTo | hasMany = js.native
  
  var name: String = js.native
  
  var options: RelationshipMetaOptions = js.native
  
  var parentType: Model = js.native
  
  var `type`: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String = js.native
}
object RelationshipMeta {
  
  @scala.inline
  def apply[Model /* <: typings.emberData.mod.DS.Model */](
    isRelationship: `true`,
    key: RelationshipsFor[Model],
    kind: belongsTo | hasMany,
    name: String,
    options: RelationshipMetaOptions,
    parentType: Model,
    `type`: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String
  ): RelationshipMeta[Model] = {
    val __obj = js.Dynamic.literal(isRelationship = isRelationship.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipMeta[Model]]
  }
  
  @scala.inline
  implicit class RelationshipMetaOps[Self <: RelationshipMeta[_], Model /* <: Model */] (val x: Self with RelationshipMeta[Model]) extends AnyVal {
    
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
    def setIsRelationship(value: `true`): Self = this.set("isRelationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: RelationshipsFor[Model]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: belongsTo | hasMany): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: RelationshipMetaOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentType(value: Model): Self = this.set("parentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
