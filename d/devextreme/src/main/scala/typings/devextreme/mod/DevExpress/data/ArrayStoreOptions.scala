package typings.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayStoreOptions[T] extends StoreOptions[T] {
  /** @name ArrayStore.Options.data */
  var data: js.UndefOr[js.Array[_]] = js.native
}

object ArrayStoreOptions {
  @scala.inline
  def apply[T](): ArrayStoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayStoreOptions[T]]
  }
  @scala.inline
  implicit class ArrayStoreOptionsOps[Self <: ArrayStoreOptions[_], T] (val x: Self with ArrayStoreOptions[T]) extends AnyVal {
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

