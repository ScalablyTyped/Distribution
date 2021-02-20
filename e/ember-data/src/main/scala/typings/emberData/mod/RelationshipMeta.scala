package typings.emberData.mod

import typings.emberData.emberDataBooleans.`true`
import typings.emberData.emberDataStrings.belongsTo
import typings.emberData.emberDataStrings.hasMany
import typings.emberData.mod.DS.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipMeta[Model /* <: Model */] extends StObject {
  
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
  implicit class RelationshipMetaMutableBuilder[Self <: RelationshipMeta[_], Model /* <: Model */] (val x: Self with RelationshipMeta[Model]) extends AnyVal {
    
    @scala.inline
    def setIsRelationship(value: `true`): Self = StObject.set(x, "isRelationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: RelationshipsFor[Model]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: belongsTo | hasMany): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: RelationshipMetaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentType(value: Model): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
