package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionTypesListResponse extends js.Object {
  /** Collection of connection types such as broadband and mobile. */
  var connectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#connectionTypesListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object ConnectionTypesListResponse {
  @scala.inline
  def apply(): ConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionTypesListResponse]
  }
  @scala.inline
  implicit class ConnectionTypesListResponseOps[Self <: ConnectionTypesListResponse] (val x: Self) extends AnyVal {
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
    def setConnectionTypesVarargs(value: ConnectionType*): Self = this.set("connectionTypes", js.Array(value :_*))
    @scala.inline
    def setConnectionTypes(value: js.Array[ConnectionType]): Self = this.set("connectionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionTypes: Self = this.set("connectionTypes", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

