package typings.googleapis.buildSrcApisDnsV1beta2Mod.dns_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Change extends js.Object {
  var additions: js.UndefOr[js.Array[Schema$ResourceRecordSet]] = js.native
  var deletions: js.UndefOr[js.Array[Schema$ResourceRecordSet]] = js.native
  var id: js.UndefOr[String] = js.native
  var isServing: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#change&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var startTime: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object Schema$Change {
  @scala.inline
  def apply(
    additions: js.Array[Schema$ResourceRecordSet] = null,
    deletions: js.Array[Schema$ResourceRecordSet] = null,
    id: String = null,
    isServing: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    startTime: String = null,
    status: String = null
  ): Schema$Change = {
    val __obj = js.Dynamic.literal()
    if (additions != null) __obj.updateDynamic("additions")(additions.asInstanceOf[js.Any])
    if (deletions != null) __obj.updateDynamic("deletions")(deletions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isServing)) __obj.updateDynamic("isServing")(isServing.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Change]
  }
}

