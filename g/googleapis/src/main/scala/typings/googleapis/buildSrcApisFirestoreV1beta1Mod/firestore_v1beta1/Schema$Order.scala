package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An order on a field.
  */
@js.native
trait Schema$Order extends js.Object {
  /**
    * The direction to order by. Defaults to `ASCENDING`.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * The field to order by.
    */
  var field: js.UndefOr[Schema$FieldReference] = js.native
}

object Schema$Order {
  @scala.inline
  def apply(direction: String = null, field: Schema$FieldReference = null): Schema$Order = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Order]
  }
}

