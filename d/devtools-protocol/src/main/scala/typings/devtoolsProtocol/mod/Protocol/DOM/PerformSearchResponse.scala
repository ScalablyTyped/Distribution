package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformSearchResponse extends js.Object {
  
  /**
    * Number of search results.
    */
  var resultCount: integer = js.native
  
  /**
    * Unique search session identifier.
    */
  var searchId: String = js.native
}
object PerformSearchResponse {
  
  @scala.inline
  def apply(resultCount: integer, searchId: String): PerformSearchResponse = {
    val __obj = js.Dynamic.literal(resultCount = resultCount.asInstanceOf[js.Any], searchId = searchId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformSearchResponse]
  }
  
  @scala.inline
  implicit class PerformSearchResponseOps[Self <: PerformSearchResponse] (val x: Self) extends AnyVal {
    
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
    def setResultCount(value: integer): Self = this.set("resultCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchId(value: String): Self = this.set("searchId", value.asInstanceOf[js.Any])
  }
}
