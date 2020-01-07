package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter on a specific property.
  */
@js.native
trait Schema$PropertyFilter extends js.Object {
  /**
    * The operator to filter by.
    */
  var op: js.UndefOr[String] = js.native
  /**
    * The property to filter by.
    */
  var property: js.UndefOr[Schema$PropertyReference] = js.native
  /**
    * The value to compare the property to.
    */
  var value: js.UndefOr[Schema$Value] = js.native
}

object Schema$PropertyFilter {
  @scala.inline
  def apply(op: String = null, property: Schema$PropertyReference = null, value: Schema$Value = null): Schema$PropertyFilter = {
    val __obj = js.Dynamic.literal()
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PropertyFilter]
  }
}

