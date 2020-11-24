package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureSnapshotResponse extends js.Object {
  
  /**
    * The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document.
    */
  var documents: js.Array[DocumentSnapshot] = js.native
  
  /**
    * Shared string table that all string properties refer to with indexes.
    */
  var strings: js.Array[String] = js.native
}
object CaptureSnapshotResponse {
  
  @scala.inline
  def apply(documents: js.Array[DocumentSnapshot], strings: js.Array[String]): CaptureSnapshotResponse = {
    val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureSnapshotResponse]
  }
  
  @scala.inline
  implicit class CaptureSnapshotResponseOps[Self <: CaptureSnapshotResponse] (val x: Self) extends AnyVal {
    
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
    def setDocumentsVarargs(value: DocumentSnapshot*): Self = this.set("documents", js.Array(value :_*))
    
    @scala.inline
    def setDocuments(value: js.Array[DocumentSnapshot]): Self = this.set("documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsVarargs(value: String*): Self = this.set("strings", js.Array(value :_*))
    
    @scala.inline
    def setStrings(value: js.Array[String]): Self = this.set("strings", value.asInstanceOf[js.Any])
  }
}
