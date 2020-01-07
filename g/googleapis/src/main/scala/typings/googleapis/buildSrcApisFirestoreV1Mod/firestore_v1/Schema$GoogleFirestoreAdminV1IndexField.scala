package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A field in an index. The field_path describes which field is indexed, the
  * value_mode describes how the field value is indexed.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1IndexField extends js.Object {
  /**
    * Indicates that this field supports operations on `array_value`s.
    */
  var arrayConfig: js.UndefOr[String] = js.native
  /**
    * Can be __name__. For single field indexes, this must match the name of
    * the field or may be omitted.
    */
  var fieldPath: js.UndefOr[String] = js.native
  /**
    * Indicates that this field supports ordering by the specified order or
    * comparing using =, &lt;, &lt;=, &gt;, &gt;=.
    */
  var order: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1IndexField {
  @scala.inline
  def apply(arrayConfig: String = null, fieldPath: String = null, order: String = null): Schema$GoogleFirestoreAdminV1IndexField = {
    val __obj = js.Dynamic.literal()
    if (arrayConfig != null) __obj.updateDynamic("arrayConfig")(arrayConfig.asInstanceOf[js.Any])
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1IndexField]
  }
}

