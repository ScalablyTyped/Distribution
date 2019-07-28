package typings.gapiDotClientDotServiceuser.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelDescriptor extends js.Object {
  /** A human-readable description for the label. */
  var description: js.UndefOr[String] = js.undefined
  /** The label key. */
  var key: js.UndefOr[String] = js.undefined
  /** The type of data that can be assigned to the label. */
  var valueType: js.UndefOr[String] = js.undefined
}

object LabelDescriptor {
  @scala.inline
  def apply(description: String = null, key: String = null, valueType: String = null): LabelDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (key != null) __obj.updateDynamic("key")(key)
    if (valueType != null) __obj.updateDynamic("valueType")(valueType)
    __obj.asInstanceOf[LabelDescriptor]
  }
}

