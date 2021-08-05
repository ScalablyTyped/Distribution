package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkSend extends StObject {
  
  /**
    * An array of `bulkCopy` objects. Each object represents an instance or copy of an envelope and contains details such as the recipient, custom fields, tabs, and other information.
    */
  var bulkCopies: js.UndefOr[js.Array[BulkSendingCopy]] = js.undefined
  
  /**
    * The GUID of the bulk send list. This property is created after you post a new bulk send list.
    */
  var listId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the bulk send list.
    */
  var name: js.UndefOr[String] = js.undefined
}
object BulkSend {
  
  inline def apply(): BulkSend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSend]
  }
  
  extension [Self <: BulkSend](x: Self) {
    
    inline def setBulkCopies(value: js.Array[BulkSendingCopy]): Self = StObject.set(x, "bulkCopies", value.asInstanceOf[js.Any])
    
    inline def setBulkCopiesUndefined: Self = StObject.set(x, "bulkCopies", js.undefined)
    
    inline def setBulkCopiesVarargs(value: BulkSendingCopy*): Self = StObject.set(x, "bulkCopies", js.Array(value :_*))
    
    inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    inline def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
