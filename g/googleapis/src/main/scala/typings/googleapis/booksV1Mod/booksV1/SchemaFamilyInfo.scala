package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.AnonAcquirePermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFamilyInfo extends js.Object {
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Family membership info of the user that made the request.
    */
  var membership: js.UndefOr[AnonAcquirePermission] = js.native
}

object SchemaFamilyInfo {
  @scala.inline
  def apply(kind: String = null, membership: AnonAcquirePermission = null): SchemaFamilyInfo = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (membership != null) __obj.updateDynamic("membership")(membership.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFamilyInfo]
  }
}

