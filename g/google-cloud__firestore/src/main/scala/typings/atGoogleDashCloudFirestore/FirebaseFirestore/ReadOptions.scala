package typings.atGoogleDashCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  /**
    * Specifies the set of fields to return and reduces the amount of data
    * transmitted by the backend.
    *
    * Adding a field mask does not filter results. Documents do not need to
    * contain values for all the fields in the mask to be part of the result
    * set.
    */
  val fieldMask: js.UndefOr[js.Array[String | FieldPath]] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply(fieldMask: js.Array[String | FieldPath] = null): ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (fieldMask != null) __obj.updateDynamic("fieldMask")(fieldMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions]
  }
}

