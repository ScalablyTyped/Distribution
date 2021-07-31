package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureSnapshotResponse extends StObject {
  
  /**
    * The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document.
    */
  var documents: js.Array[DocumentSnapshot]
  
  /**
    * Shared string table that all string properties refer to with indexes.
    */
  var strings: js.Array[String]
}
object CaptureSnapshotResponse {
  
  @scala.inline
  def apply(documents: js.Array[DocumentSnapshot], strings: js.Array[String]): CaptureSnapshotResponse = {
    val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureSnapshotResponse]
  }
  
  @scala.inline
  implicit class CaptureSnapshotResponseMutableBuilder[Self <: CaptureSnapshotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocuments(value: js.Array[DocumentSnapshot]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsVarargs(value: DocumentSnapshot*): Self = StObject.set(x, "documents", js.Array(value :_*))
    
    @scala.inline
    def setStrings(value: js.Array[String]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsVarargs(value: String*): Self = StObject.set(x, "strings", js.Array(value :_*))
  }
}
