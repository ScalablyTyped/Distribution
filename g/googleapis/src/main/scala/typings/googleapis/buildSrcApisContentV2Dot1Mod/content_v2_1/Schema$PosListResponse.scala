package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PosListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#posListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var resources: js.UndefOr[js.Array[Schema$PosStore]] = js.native
}

object Schema$PosListResponse {
  @scala.inline
  def apply(kind: String = null, resources: js.Array[Schema$PosStore] = null): Schema$PosListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PosListResponse]
  }
}

