package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initial State for shielded instance, these are public keys which are safe
  * to store in public
  */
@js.native
trait SchemaInitialStateConfig extends js.Object {
  /**
    * The Key Database (db).
    */
  var dbs: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  /**
    * The forbidden key database (dbx).
    */
  var dbxs: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  /**
    * The Key Exchange Key (KEK).
    */
  var keks: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  /**
    * The Platform Key (PK).
    */
  var pk: js.UndefOr[SchemaFileContentBuffer] = js.native
}

object SchemaInitialStateConfig {
  @scala.inline
  def apply(
    dbs: js.Array[SchemaFileContentBuffer] = null,
    dbxs: js.Array[SchemaFileContentBuffer] = null,
    keks: js.Array[SchemaFileContentBuffer] = null,
    pk: SchemaFileContentBuffer = null
  ): SchemaInitialStateConfig = {
    val __obj = js.Dynamic.literal()
    if (dbs != null) __obj.updateDynamic("dbs")(dbs.asInstanceOf[js.Any])
    if (dbxs != null) __obj.updateDynamic("dbxs")(dbxs.asInstanceOf[js.Any])
    if (keks != null) __obj.updateDynamic("keks")(keks.asInstanceOf[js.Any])
    if (pk != null) __obj.updateDynamic("pk")(pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInitialStateConfig]
  }
}

