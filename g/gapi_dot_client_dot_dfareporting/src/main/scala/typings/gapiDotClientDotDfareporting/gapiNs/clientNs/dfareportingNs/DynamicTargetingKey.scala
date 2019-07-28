package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKey extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#dynamicTargetingKey". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of this dynamic targeting key. This is a required field. Must be less than 256 characters long and cannot contain commas. All characters are
    * converted to lowercase.
    */
  var name: js.UndefOr[String] = js.undefined
  /** ID of the object of this dynamic targeting key. This is a required field. */
  var objectId: js.UndefOr[String] = js.undefined
  /** Type of the object of this dynamic targeting key. This is a required field. */
  var objectType: js.UndefOr[String] = js.undefined
}

object DynamicTargetingKey {
  @scala.inline
  def apply(kind: String = null, name: String = null, objectId: String = null, objectType: String = null): DynamicTargetingKey = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    __obj.asInstanceOf[DynamicTargetingKey]
  }
}

