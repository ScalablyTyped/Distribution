package typings.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchConfig[T] extends js.Object {
  var fields: js.UndefOr[FieldSearchConfig[T]] = js.native
}

object SearchConfig {
  @scala.inline
  def apply[T](): SearchConfig[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchConfig[T]]
  }
  @scala.inline
  implicit class SearchConfigOps[Self <: SearchConfig[_], T] (val x: Self with SearchConfig[T]) extends AnyVal {
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
    def setFields(value: FieldSearchConfig[T]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

