package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volume2 extends js.Object {
  /** A list of volumes. */
  var items: js.UndefOr[js.Array[Volume]] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object Volume2 {
  @scala.inline
  def apply(): Volume2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume2]
  }
  @scala.inline
  implicit class Volume2Ops[Self <: Volume2] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Volume*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Volume]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

