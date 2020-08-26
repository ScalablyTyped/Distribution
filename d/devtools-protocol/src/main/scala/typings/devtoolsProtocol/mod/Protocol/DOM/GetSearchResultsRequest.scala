package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSearchResultsRequest extends js.Object {
  /**
    * Start index of the search result to be returned.
    */
  var fromIndex: integer = js.native
  /**
    * Unique search session identifier.
    */
  var searchId: String = js.native
  /**
    * End index of the search result to be returned.
    */
  var toIndex: integer = js.native
}

object GetSearchResultsRequest {
  @scala.inline
  def apply(fromIndex: integer, searchId: String, toIndex: integer): GetSearchResultsRequest = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], searchId = searchId.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSearchResultsRequest]
  }
  @scala.inline
  implicit class GetSearchResultsRequestOps[Self <: GetSearchResultsRequest] (val x: Self) extends AnyVal {
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
    def setFromIndex(value: integer): Self = this.set("fromIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchId(value: String): Self = this.set("searchId", value.asInstanceOf[js.Any])
    @scala.inline
    def setToIndex(value: integer): Self = this.set("toIndex", value.asInstanceOf[js.Any])
  }
  
}

