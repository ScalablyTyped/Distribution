package typings.epilogue.epilogueMod

import typings.epilogue.Anon_Model
import typings.sequelize.sequelizeMod.AssociationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceOptions extends js.Object {
  var actions: js.UndefOr[js.Array[String]] = js.undefined
  var associations: js.UndefOr[AssociationOptions] = js.undefined
  var endpoints: js.Array[String]
  var excludeAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var include: js.UndefOr[js.Array[Anon_Model | String]] = js.undefined
  var model: js.Any
  var pagination: js.UndefOr[Boolean] = js.undefined
  var readOnlyAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var reloadInstances: js.UndefOr[Boolean] = js.undefined
  var search: js.UndefOr[ResourceSearchOption] = js.undefined
  var sort: js.UndefOr[ResourceSortOption] = js.undefined
  var updateMethod: js.UndefOr[String] = js.undefined
}

object ResourceOptions {
  @scala.inline
  def apply(
    endpoints: js.Array[String],
    model: js.Any,
    actions: js.Array[String] = null,
    associations: AssociationOptions = null,
    excludeAttributes: js.Array[String] = null,
    include: js.Array[Anon_Model | String] = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    readOnlyAttributes: js.Array[String] = null,
    reloadInstances: js.UndefOr[Boolean] = js.undefined,
    search: ResourceSearchOption = null,
    sort: ResourceSortOption = null,
    updateMethod: String = null
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

