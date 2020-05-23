package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  var done: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Status] = js.undefined
  var metadata: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var response: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    done: js.UndefOr[Boolean] = js.undefined,
    error: Status = null,
    metadata: ApiClientObjectMap[_] = null,
    name: String = null,
    response: ApiClientObjectMap[_] = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

