package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldersRequest extends js.Object {
  
  /**
    * A comma-separated list of envelope IDs.
    */
  var envelopeIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of folder objects.
    */
  var folders: js.UndefOr[js.Array[/* This object contains details about a folder. */ Folder]] = js.native
  
  /**
    *  The id of the folder that the envelope is being moved from.
    */
  var fromFolderId: js.UndefOr[String] = js.native
}
object FoldersRequest {
  
  @scala.inline
  def apply(): FoldersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldersRequest]
  }
  
  @scala.inline
  implicit class FoldersRequestOps[Self <: FoldersRequest] (val x: Self) extends AnyVal {
    
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
    def setEnvelopeIdsVarargs(value: String*): Self = this.set("envelopeIds", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeIds(value: js.Array[String]): Self = this.set("envelopeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeIds: Self = this.set("envelopeIds", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: (/* This object contains details about a folder. */ Folder)*): Self = this.set("folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[/* This object contains details about a folder. */ Folder]): Self = this.set("folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolders: Self = this.set("folders", js.undefined)
    
    @scala.inline
    def setFromFolderId(value: String): Self = this.set("fromFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromFolderId: Self = this.set("fromFolderId", js.undefined)
  }
}
