package typings.emberDashData.emberDashDataMod

import typings.emberDashData.emberDashDataMod.DS.Model
import typings.emberDashData.emberDashDataNumbers.`true`
import typings.emberDashData.emberDashDataStrings.belongsTo
import typings.emberDashData.emberDashDataStrings.hasMany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipMeta[Model /* <: Model */] extends js.Object {
  var isRelationship: `true`
  var key: RelationshipsFor[Model]
  var kind: belongsTo | hasMany
  var name: String
  var options: RelationshipMetaOptions
  var parentType: Model
  var `type`: String
}

object RelationshipMeta {
  @scala.inline
  def apply[Model /* <: Model */](
    isRelationship: `true`,
    key: RelationshipsFor[Model],
    kind: belongsTo | hasMany,
    name: String,
    options: RelationshipMetaOptions,
    parentType: Model,
    `type`: String
  ): RelationshipMeta[Model] = {
    val __obj = js.Dynamic.literal(isRelationship = isRelationship, key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name, options = options, parentType = parentType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RelationshipMeta[Model]]
  }
}

