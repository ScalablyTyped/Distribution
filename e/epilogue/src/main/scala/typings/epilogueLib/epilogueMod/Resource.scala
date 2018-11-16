package typings
package epilogueLib.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("epilogue", "Resource")
@js.native
class Resource protected () extends js.Object {
  def this(options: ResourceOptions) = this()
  var actions: js.Array[java.lang.String] = js.native
  var app: expressLib.expressMod.eNs.Express = js.native
  var associationOptions: ResourceAssociationOptions = js.native
  var attributes: js.Array[java.lang.String] = js.native
  var controllers: Controllers = js.native
  var endpoints: epilogueLib.Anon_Singular = js.native
  var excludeAttributes: js.Array[java.lang.String] = js.native
  var include: js.Array[epilogueLib.Anon_Model | java.lang.String] = js.native
  var model: js.Any = js.native
  var pagination: scala.Boolean = js.native
  var readOnlyAttributes: js.Array[java.lang.String] = js.native
  var reloadInstances: scala.Boolean = js.native
  var search: ResourceSearchOption = js.native
  var sequelize: sequelizeLib.sequelizeMod.sequelizeNs.Sequelize = js.native
  var sort: ResourceSortOption = js.native
  var updateMethod: java.lang.String = js.native
}

