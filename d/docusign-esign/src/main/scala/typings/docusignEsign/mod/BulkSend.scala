package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSend extends StObject {
  
  /**
    * An array of `bulkCopy` objects. Each object represents an instance or copy of an envelope and contains details such as the recipient, custom fields, tabs, and other information.
    */
  var bulkCopies: js.UndefOr[js.Array[BulkSendingCopy]] = js.native
  
  /**
    * The GUID of the bulk send list. This property is created after you post a new bulk send list.
    */
  var listId: js.UndefOr[String] = js.native
  
  /**
    * The name of the bulk send list.
    */
  var name: js.UndefOr[String] = js.native
}
object BulkSend {
  
  @scala.inline
  def apply(): BulkSend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSend]
  }
  
  @scala.inline
  implicit class BulkSendMutableBuilder[Self <: BulkSend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkCopies(value: js.Array[BulkSendingCopy]): Self = StObject.set(x, "bulkCopies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkCopiesUndefined: Self = StObject.set(x, "bulkCopies", js.undefined)
    
    @scala.inline
    def setBulkCopiesVarargs(value: BulkSendingCopy*): Self = StObject.set(x, "bulkCopies", js.Array(value :_*))
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
