package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AuthToken extends js.Object {
  var authToken: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Schema$AuthToken {
  @scala.inline
  def apply(authToken: String = null, `type`: String = null): Schema$AuthToken = {
    val __obj = js.Dynamic.literal()
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AuthToken]
  }
}

