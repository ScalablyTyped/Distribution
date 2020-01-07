package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LiasettingsSetInventoryVerificationContactResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsSetInventoryVerificationContactResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$LiasettingsSetInventoryVerificationContactResponse {
  @scala.inline
  def apply(kind: String = null): Schema$LiasettingsSetInventoryVerificationContactResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiasettingsSetInventoryVerificationContactResponse]
  }
}

