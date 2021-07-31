package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateToHistoryEntryRequest extends StObject {
  
  /**
    * Unique id of the entry to navigate to.
    */
  var entryId: integer
}
object NavigateToHistoryEntryRequest {
  
  @scala.inline
  def apply(entryId: integer): NavigateToHistoryEntryRequest = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToHistoryEntryRequest]
  }
  
  @scala.inline
  implicit class NavigateToHistoryEntryRequestMutableBuilder[Self <: NavigateToHistoryEntryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryId(value: integer): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
  }
}
