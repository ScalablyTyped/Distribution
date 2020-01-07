package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountsLinkResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountsLinkResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AccountsLinkResponse {
  @scala.inline
  def apply(kind: String = null): Schema$AccountsLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountsLinkResponse]
  }
}

