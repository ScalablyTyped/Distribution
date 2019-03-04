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

object ResourceOptions {
  @scala.inline
  def apply(
    endpoints: js.Array[java.lang.String],
    model: js.Any,
    actions: js.Array[java.lang.String] = null,
    associations: sequelizeLib.sequelizeMod.sequelizeNs.AssociationOptions = null,
    excludeAttributes: js.Array[java.lang.String] = null,
    include: js.Array[epilogueLib.Anon_Model | java.lang.String] = null,
    pagination: js.UndefOr[scala.Boolean] = js.undefined,
    readOnlyAttributes: js.Array[java.lang.String] = null,
    reloadInstances: js.UndefOr[scala.Boolean] = js.undefined,
    search: ResourceSearchOption = null,
    sort: ResourceSortOption = null,
    updateMethod: java.lang.String = null
  ): ResourceOptions = {
    val __obj = js.Dynamic.literal(endpoints = endpoints, model = model)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (associations != null) __obj.updateDynamic("associations")(associations)
    if (excludeAttributes != null) __obj.updateDynamic("excludeAttributes")(excludeAttributes)
    if (include != null) __obj.updateDynamic("include")(include)
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination)
    if (readOnlyAttributes != null) __obj.updateDynamic("readOnlyAttributes")(readOnlyAttributes)
    if (!js.isUndefined(reloadInstances)) __obj.updateDynamic("reloadInstances")(reloadInstances)
    if (search != null) __obj.updateDynamic("search")(search)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (updateMethod != null) __obj.updateDynamic("updateMethod")(updateMethod)
    __obj.asInstanceOf[ResourceOptions]
  }
}

