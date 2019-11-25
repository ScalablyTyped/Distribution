package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

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
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicTargetingKey]
  }
}

