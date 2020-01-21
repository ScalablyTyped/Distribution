package typings.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyFilter extends js.Object {
  /** The operator to filter by. */
  var op: js.UndefOr[String] = js.undefined
  /** The property to filter by. */
  var property: js.UndefOr[PropertyReference] = js.undefined
  /** The value to compare the property to. */
  var value: js.UndefOr[Value] = js.undefined
}

object PropertyFilter {
  @scala.inline
  def apply(op: String = null, property: PropertyReference = null, value: Value = null): PropertyFilter = {
    val __obj = js.Dynamic.literal()
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyFilter]
  }
}

