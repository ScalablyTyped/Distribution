package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A create, update, or delete of a particular column family.
  */
@js.native
trait Schema$Modification extends js.Object {
  /**
    * Create a new column family with the specified schema, or fail if one
    * already exists with the given ID.
    */
  var create: js.UndefOr[Schema$ColumnFamily] = js.native
  /**
    * Drop (delete) the column family with the given ID, or fail if no such
    * family exists.
    */
  var drop: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the column family to be modified.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Update an existing column family to the specified schema, or fail if no
    * column family exists with the given ID.
    */
  var update: js.UndefOr[Schema$ColumnFamily] = js.native
}

object Schema$Modification {
  @scala.inline
  def apply(
    create: Schema$ColumnFamily = null,
    drop: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    update: Schema$ColumnFamily = null
  ): Schema$Modification = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (!js.isUndefined(drop)) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Modification]
  }
}

