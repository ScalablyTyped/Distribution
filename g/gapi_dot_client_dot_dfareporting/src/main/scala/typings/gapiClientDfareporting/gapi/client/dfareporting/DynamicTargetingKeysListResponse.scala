package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicTargetingKeysListResponse extends js.Object {
  /** Dynamic targeting key collection. */
  var dynamicTargetingKeys: js.UndefOr[js.Array[DynamicTargetingKey]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#dynamicTargetingKeysListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object DynamicTargetingKeysListResponse {
  @scala.inline
  def apply(): DynamicTargetingKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicTargetingKeysListResponse]
  }
  @scala.inline
  implicit class DynamicTargetingKeysListResponseOps[Self <: DynamicTargetingKeysListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDynamicTargetingKeysVarargs(value: DynamicTargetingKey*): Self = this.set("dynamicTargetingKeys", js.Array(value :_*))
    @scala.inline
    def setDynamicTargetingKeys(value: js.Array[DynamicTargetingKey]): Self = this.set("dynamicTargetingKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicTargetingKeys: Self = this.set("dynamicTargetingKeys", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

