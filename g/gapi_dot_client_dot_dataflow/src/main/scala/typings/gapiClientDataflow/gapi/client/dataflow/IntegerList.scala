package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegerList extends js.Object {
  /** Elements of the list. */
  var elements: js.UndefOr[js.Array[SplitInt64]] = js.native
}

object IntegerList {
  @scala.inline
  def apply(): IntegerList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerList]
  }
  @scala.inline
  implicit class IntegerListOps[Self <: IntegerList] (val x: Self) extends AnyVal {
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
    def setElementsVarargs(value: SplitInt64*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[SplitInt64]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
  }
  
}

