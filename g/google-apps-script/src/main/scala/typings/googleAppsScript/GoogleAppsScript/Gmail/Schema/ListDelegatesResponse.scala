package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDelegatesResponse extends js.Object {
  var delegates: js.UndefOr[js.Array[Delegate]] = js.native
}

object ListDelegatesResponse {
  @scala.inline
  def apply(): ListDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDelegatesResponse]
  }
  @scala.inline
  implicit class ListDelegatesResponseOps[Self <: ListDelegatesResponse] (val x: Self) extends AnyVal {
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
    def setDelegatesVarargs(value: Delegate*): Self = this.set("delegates", js.Array(value :_*))
    @scala.inline
    def setDelegates(value: js.Array[Delegate]): Self = this.set("delegates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegates: Self = this.set("delegates", js.undefined)
  }
  
}

