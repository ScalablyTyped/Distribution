package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectAttachmentsScopedList extends StObject {
  
  /**
    * A list of interconnect attachments contained in this scope.
    */
  var interconnectAttachments: js.UndefOr[js.Array[SchemaInterconnectAttachment]] = js.undefined
  
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaInterconnectAttachmentsScopedList {
  
  @scala.inline
  def apply(): SchemaInterconnectAttachmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectAttachmentsScopedList]
  }
  
  @scala.inline
  implicit class SchemaInterconnectAttachmentsScopedListMutableBuilder[Self <: SchemaInterconnectAttachmentsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterconnectAttachments(value: js.Array[SchemaInterconnectAttachment]): Self = StObject.set(x, "interconnectAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterconnectAttachmentsUndefined: Self = StObject.set(x, "interconnectAttachments", js.undefined)
    
    @scala.inline
    def setInterconnectAttachmentsVarargs(value: SchemaInterconnectAttachment*): Self = StObject.set(x, "interconnectAttachments", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
