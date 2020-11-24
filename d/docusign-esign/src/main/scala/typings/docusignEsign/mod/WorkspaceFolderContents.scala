package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceFolderContents extends js.Object {
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.native
  
  /**
    * The folder from which to return items. You can enter either the folder name or folder ID.
    */
  var folder: js.UndefOr[
    /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
  ] = js.native
  
  /**
    * A list of workspace items.
    */
  var items: js.UndefOr[
    js.Array[
      /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
    ]
  ] = js.native
  
  var parentFolders: js.UndefOr[
    js.Array[
      /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
    ]
  ] = js.native
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[String] = js.native
  
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[String] = js.native
  
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[String] = js.native
  
  /**
    * The id of the workspace.
    */
  var workspaceId: js.UndefOr[String] = js.native
}
object WorkspaceFolderContents {
  
  @scala.inline
  def apply(): WorkspaceFolderContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFolderContents]
  }
  
  @scala.inline
  implicit class WorkspaceFolderContentsOps[Self <: WorkspaceFolderContents] (val x: Self) extends AnyVal {
    
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
    def setEndPosition(value: String): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPosition: Self = this.set("endPosition", js.undefined)
    
    @scala.inline
    def setFolder(
      value: /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
    ): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    
    @scala.inline
    def setItemsVarargs(
      value: (/* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem)*
    ): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(
      value: js.Array[
          /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
        ]
    ): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setParentFoldersVarargs(
      value: (/* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem)*
    ): Self = this.set("parentFolders", js.Array(value :_*))
    
    @scala.inline
    def setParentFolders(
      value: js.Array[
          /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
        ]
    ): Self = this.set("parentFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolders: Self = this.set("parentFolders", js.undefined)
    
    @scala.inline
    def setResultSetSize(value: String): Self = this.set("resultSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultSetSize: Self = this.set("resultSetSize", js.undefined)
    
    @scala.inline
    def setStartPosition(value: String): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    
    @scala.inline
    def setTotalSetSize(value: String): Self = this.set("totalSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSetSize: Self = this.set("totalSetSize", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceId: Self = this.set("workspaceId", js.undefined)
  }
}
