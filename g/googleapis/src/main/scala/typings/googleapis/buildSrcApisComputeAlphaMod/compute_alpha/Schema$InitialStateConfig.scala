package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initial State for shielded instance, these are public keys which are safe
  * to store in public
  */
@js.native
trait Schema$InitialStateConfig extends js.Object {
  /**
    * The Key Database (db).
    */
  var dbs: js.UndefOr[js.Array[Schema$FileContentBuffer]] = js.native
  /**
    * The forbidden key database (dbx).
    */
  var dbxs: js.UndefOr[js.Array[Schema$FileContentBuffer]] = js.native
  /**
    * The Key Exchange Key (KEK).
    */
  var keks: js.UndefOr[js.Array[Schema$FileContentBuffer]] = js.native
  /**
    * The Platform Key (PK).
    */
  var pk: js.UndefOr[Schema$FileContentBuffer] = js.native
}

object Schema$InitialStateConfig {
  @scala.inline
  def apply(
    dbs: js.Array[Schema$FileContentBuffer] = null,
    dbxs: js.Array[Schema$FileContentBuffer] = null,
    keks: js.Array[Schema$FileContentBuffer] = null,
    pk: Schema$FileContentBuffer = null
  ): Schema$InitialStateConfig = {
    val __obj = js.Dynamic.literal()
    if (dbs != null) __obj.updateDynamic("dbs")(dbs.asInstanceOf[js.Any])
    if (dbxs != null) __obj.updateDynamic("dbxs")(dbxs.asInstanceOf[js.Any])
    if (keks != null) __obj.updateDynamic("keks")(keks.asInstanceOf[js.Any])
    if (pk != null) __obj.updateDynamic("pk")(pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InitialStateConfig]
  }
}

