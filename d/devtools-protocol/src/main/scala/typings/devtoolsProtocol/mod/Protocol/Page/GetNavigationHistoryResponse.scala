package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNavigationHistoryResponse extends StObject {
  
  /**
    * Index of the current navigation history entry.
    */
  var currentIndex: integer = js.native
  
  /**
    * Array of navigation history entries.
    */
  var entries: js.Array[NavigationEntry] = js.native
}
object GetNavigationHistoryResponse {
  
  @scala.inline
  def apply(currentIndex: integer, entries: js.Array[NavigationEntry]): GetNavigationHistoryResponse = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNavigationHistoryResponse]
  }
  
  @scala.inline
  implicit class GetNavigationHistoryResponseMutableBuilder[Self <: GetNavigationHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentIndex(value: integer): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntries(value: js.Array[NavigationEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: NavigationEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
