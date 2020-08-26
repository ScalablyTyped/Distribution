package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnabledBuiltInVariablesResponse extends js.Object {
  /** All GTM BuiltInVariables of a GTM container. */
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.native
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListEnabledBuiltInVariablesResponse {
  @scala.inline
  def apply(): ListEnabledBuiltInVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnabledBuiltInVariablesResponse]
  }
  @scala.inline
  implicit class ListEnabledBuiltInVariablesResponseOps[Self <: ListEnabledBuiltInVariablesResponse] (val x: Self) extends AnyVal {
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
    def setBuiltInVariableVarargs(value: BuiltInVariable*): Self = this.set("builtInVariable", js.Array(value :_*))
    @scala.inline
    def setBuiltInVariable(value: js.Array[BuiltInVariable]): Self = this.set("builtInVariable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuiltInVariable: Self = this.set("builtInVariable", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

