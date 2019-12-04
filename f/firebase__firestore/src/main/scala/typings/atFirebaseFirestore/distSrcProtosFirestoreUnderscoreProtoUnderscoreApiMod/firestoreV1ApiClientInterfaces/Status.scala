package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var code: js.UndefOr[Double] = js.undefined
  var details: js.UndefOr[js.Array[ApiClientObjectMap[_]]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object Status {
  @scala.inline
  def apply(code: Int | Double = null, details: js.Array[ApiClientObjectMap[_]] = null, message: String = null): Status = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
}

