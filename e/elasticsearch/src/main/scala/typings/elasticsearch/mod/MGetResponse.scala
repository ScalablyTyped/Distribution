package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MGetResponse[T] extends js.Object {
  var docs: js.UndefOr[js.Array[GetResponse[T]]] = js.native
}

object MGetResponse {
  @scala.inline
  def apply[T](): MGetResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MGetResponse[T]]
  }
  @scala.inline
  implicit class MGetResponseOps[Self <: MGetResponse[_], T] (val x: Self with MGetResponse[T]) extends AnyVal {
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
    def setDocsVarargs(value: GetResponse[T]*): Self = this.set("docs", js.Array(value :_*))
    @scala.inline
    def setDocs(value: js.Array[GetResponse[T]]): Self = this.set("docs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocs: Self = this.set("docs", js.undefined)
  }
  
}

