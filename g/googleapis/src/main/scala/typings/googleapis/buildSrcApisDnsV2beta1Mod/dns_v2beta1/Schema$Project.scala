package typings.googleapis.buildSrcApisDnsV2beta1Mod.dns_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Project extends js.Object {
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#project&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var number: js.UndefOr[String] = js.native
  var quota: js.UndefOr[Schema$Quota] = js.native
}

object Schema$Project {
  @scala.inline
  def apply(id: String = null, kind: String = null, number: String = null, quota: Schema$Quota = null): Schema$Project = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (quota != null) __obj.updateDynamic("quota")(quota.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Project]
  }
}

