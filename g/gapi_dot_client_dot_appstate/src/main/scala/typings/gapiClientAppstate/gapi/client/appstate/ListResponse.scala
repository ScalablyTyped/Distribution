package typings.gapiClientAppstate.gapi.client.appstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResponse extends js.Object {
  /** The app state data. */
  var items: js.UndefOr[js.Array[GetResponse]] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#listResponse. */
  var kind: js.UndefOr[String] = js.native
  /** The maximum number of keys allowed for this user. */
  var maximumKeyCount: js.UndefOr[Double] = js.native
}

object ListResponse {
  @scala.inline
  def apply(): ListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResponse]
  }
  @scala.inline
  implicit class ListResponseOps[Self <: ListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: GetResponse*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[GetResponse]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaximumKeyCount(value: Double): Self = this.set("maximumKeyCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumKeyCount: Self = this.set("maximumKeyCount", js.undefined)
  }
  
}

