package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNavigationHistoryResponse extends StObject {
  
  /**
    * Index of the current navigation history entry.
    */
  var currentIndex: integer
  
  /**
    * Array of navigation history entries.
    */
  var entries: js.Array[NavigationEntry]
}
object GetNavigationHistoryResponse {
  
  inline def apply(currentIndex: integer, entries: js.Array[NavigationEntry]): GetNavigationHistoryResponse = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNavigationHistoryResponse]
  }
  
  extension [Self <: GetNavigationHistoryResponse](x: Self) {
    
    inline def setCurrentIndex(value: integer): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: js.Array[NavigationEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: NavigationEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
