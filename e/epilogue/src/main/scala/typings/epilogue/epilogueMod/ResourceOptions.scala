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
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    if (excludeAttributes != null) __obj.updateDynamic("excludeAttributes")(excludeAttributes.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (readOnlyAttributes != null) __obj.updateDynamic("readOnlyAttributes")(readOnlyAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadInstances)) __obj.updateDynamic("reloadInstances")(reloadInstances.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (updateMethod != null) __obj.updateDynamic("updateMethod")(updateMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceOptions]
  }
}

