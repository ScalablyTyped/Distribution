package typings.gapiDotClientDotFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldReference extends js.Object {
  var fieldPath: js.UndefOr[String] = js.undefined
}

object FieldReference {
  @scala.inline
  def apply(fieldPath: String = null): FieldReference = {
    val __obj = js.Dynamic.literal()
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldReference]
  }
}

