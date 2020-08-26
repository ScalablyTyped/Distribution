package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectionsQueryResponse extends js.Object {
  /** A list of available elections */
  var elections: js.UndefOr[js.Array[Election]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#electionsQueryResponse". */
  var kind: js.UndefOr[String] = js.native
}

object ElectionsQueryResponse {
  @scala.inline
  def apply(): ElectionsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElectionsQueryResponse]
  }
  @scala.inline
  implicit class ElectionsQueryResponseOps[Self <: ElectionsQueryResponse] (val x: Self) extends AnyVal {
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
    def setElectionsVarargs(value: Election*): Self = this.set("elections", js.Array(value :_*))
    @scala.inline
    def setElections(value: js.Array[Election]): Self = this.set("elections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElections: Self = this.set("elections", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

