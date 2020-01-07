package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array value.
  */
@js.native
trait Schema$ArrayValue extends js.Object {
  /**
    * Values in the array.
    */
  var values: js.UndefOr[js.Array[Schema$Value]] = js.native
}

object Schema$ArrayValue {
  @scala.inline
  def apply(values: js.Array[Schema$Value] = null): Schema$ArrayValue = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ArrayValue]
  }
}

