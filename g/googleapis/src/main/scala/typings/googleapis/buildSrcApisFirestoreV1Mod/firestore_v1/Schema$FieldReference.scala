package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a field, such as `max(messages.time) as max_time`.
  */
@js.native
trait Schema$FieldReference extends js.Object {
  var fieldPath: js.UndefOr[String] = js.native
}

object Schema$FieldReference {
  @scala.inline
  def apply(fieldPath: String = null): Schema$FieldReference = {
    val __obj = js.Dynamic.literal()
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FieldReference]
  }
}

