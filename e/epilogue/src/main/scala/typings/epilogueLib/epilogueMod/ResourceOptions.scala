package typings
package epilogueLib.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResourceOptions extends js.Object {
  var actions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var associations: js.UndefOr[sequelizeLib.sequelizeMod.sequelizeNs.AssociationOptions] = js.undefined
  var endpoints: js.Array[java.lang.String]
  var excludeAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var include: js.UndefOr[js.Array[epilogueLib.Anon_Model | java.lang.String]] = js.undefined
  var model: js.Any
  var pagination: js.UndefOr[scala.Boolean] = js.undefined
  var readOnlyAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var reloadInstances: js.UndefOr[scala.Boolean] = js.undefined
  var search: js.UndefOr[ResourceSearchOption] = js.undefined
  var sort: js.UndefOr[ResourceSortOption] = js.undefined
  var updateMethod: js.UndefOr[java.lang.String] = js.undefined
}

