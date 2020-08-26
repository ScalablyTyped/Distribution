package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystemsListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** Operating system collection. */
  var operatingSystems: js.UndefOr[js.Array[OperatingSystem]] = js.native
}

object OperatingSystemsListResponse {
  @scala.inline
  def apply(): OperatingSystemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemsListResponse]
  }
  @scala.inline
  implicit class OperatingSystemsListResponseOps[Self <: OperatingSystemsListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOperatingSystemsVarargs(value: OperatingSystem*): Self = this.set("operatingSystems", js.Array(value :_*))
    @scala.inline
    def setOperatingSystems(value: js.Array[OperatingSystem]): Self = this.set("operatingSystems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystems: Self = this.set("operatingSystems", js.undefined)
  }
  
}

