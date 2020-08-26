package typings.ejWebAll.ej.DropDownList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSuccessEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns number of times trying to fetch the data
    */
  var count: js.UndefOr[Double] = js.native
  /** returns the DropDownList model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the query for data retrieval
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Returns the query for data retrieval from the Database
    */
  var request: js.UndefOr[js.Any] = js.native
  /** Returns the number of items fetched from remote data
    */
  var result: js.UndefOr[js.Array[_]] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
  /** Returns the requested data
    */
  var xhr: js.UndefOr[js.Any] = js.native
}

object ActionSuccessEventArgs {
  @scala.inline
  def apply(): ActionSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSuccessEventArgs]
  }
  @scala.inline
  implicit class ActionSuccessEventArgsOps[Self <: ActionSuccessEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRequest(value: js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResultVarargs(value: js.Any*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[_]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setXhr(value: js.Any): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

