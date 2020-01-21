package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenRequest extends js.Object {
  var addTarget: js.UndefOr[Target] = js.undefined
  var labels: js.UndefOr[ApiClientObjectMap[String]] = js.undefined
  var removeTarget: js.UndefOr[Double] = js.undefined
}

object ListenRequest {
  @scala.inline
  def apply(
    addTarget: Target = null,
    labels: ApiClientObjectMap[String] = null,
    removeTarget: Int | Double = null
  ): ListenRequest = {
    val __obj = js.Dynamic.literal()
    if (addTarget != null) __obj.updateDynamic("addTarget")(addTarget.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (removeTarget != null) __obj.updateDynamic("removeTarget")(removeTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenRequest]
  }
}

