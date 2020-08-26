package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVariablesResponse extends js.Object {
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** All GTM Variables of a GTM Container. */
  var variable: js.UndefOr[js.Array[Variable]] = js.native
}

object ListVariablesResponse {
  @scala.inline
  def apply(): ListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVariablesResponse]
  }
  @scala.inline
  implicit class ListVariablesResponseOps[Self <: ListVariablesResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setVariableVarargs(value: Variable*): Self = this.set("variable", js.Array(value :_*))
    @scala.inline
    def setVariable(value: js.Array[Variable]): Self = this.set("variable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
  
}

