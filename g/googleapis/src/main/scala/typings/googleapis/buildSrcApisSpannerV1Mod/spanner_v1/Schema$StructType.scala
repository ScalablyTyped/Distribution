package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `StructType` defines the fields of a STRUCT type.
  */
@js.native
trait Schema$StructType extends js.Object {
  /**
    * The list of fields that make up this struct. Order is significant,
    * because values of this struct type are represented as lists, where the
    * order of field values matches the order of fields in the StructType. In
    * turn, the order of fields matches the order of columns in a read request,
    * or the order of fields in the `SELECT` clause of a query.
    */
  var fields: js.UndefOr[js.Array[Schema$Field]] = js.native
}

object Schema$StructType {
  @scala.inline
  def apply(fields: js.Array[Schema$Field] = null): Schema$StructType = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StructType]
  }
}

