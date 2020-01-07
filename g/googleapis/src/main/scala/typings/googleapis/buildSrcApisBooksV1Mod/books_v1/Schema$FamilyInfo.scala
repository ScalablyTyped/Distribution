package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleapis.Anon_AcquirePermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$FamilyInfo extends js.Object {
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Family membership info of the user that made the request.
    */
  var membership: js.UndefOr[Anon_AcquirePermission] = js.native
}

object Schema$FamilyInfo {
  @scala.inline
  def apply(kind: String = null, membership: Anon_AcquirePermission = null): Schema$FamilyInfo = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (membership != null) __obj.updateDynamic("membership")(membership.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FamilyInfo]
  }
}

