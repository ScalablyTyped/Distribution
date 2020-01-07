package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersCancelTestOrderByCustomerResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersCancelTestOrderByCustomerResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$OrdersCancelTestOrderByCustomerResponse {
  @scala.inline
  def apply(kind: String = null): Schema$OrdersCancelTestOrderByCustomerResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersCancelTestOrderByCustomerResponse]
  }
}

