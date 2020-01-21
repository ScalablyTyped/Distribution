package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapValue extends js.Object {
  var fields: js.UndefOr[ApiClientObjectMap[Value]] = js.undefined
}

object MapValue {
  @scala.inline
  def apply(fields: ApiClientObjectMap[Value] = null): MapValue = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapValue]
  }
}

