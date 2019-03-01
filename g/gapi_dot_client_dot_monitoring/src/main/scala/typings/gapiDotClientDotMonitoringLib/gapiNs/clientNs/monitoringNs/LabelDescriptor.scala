package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelDescriptor extends js.Object {
  /** A human-readable description for the label. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The label key. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The type of data that can be assigned to the label. */
  var valueType: js.UndefOr[java.lang.String] = js.undefined
}

object LabelDescriptor {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    key: java.lang.String = null,
    valueType: java.lang.String = null
  ): LabelDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (key != null) __obj.updateDynamic("key")(key)
    if (valueType != null) __obj.updateDynamic("valueType")(valueType)
    __obj.asInstanceOf[LabelDescriptor]
  }
}

