package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceFolderContents extends StObject {
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The folder from which to return items. You can enter either the folder name or folder ID.
    */
  var folder: js.UndefOr[
    /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
  ] = js.undefined
  
  /**
    * A list of workspace items.
    */
  var items: js.UndefOr[
    js.Array[
      /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
    ]
  ] = js.undefined
  
  var parentFolders: js.UndefOr[
    js.Array[
      /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
    ]
  ] = js.undefined
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[String] = js.undefined
  
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the workspace.
    */
  var workspaceId: js.UndefOr[String] = js.undefined
}
object WorkspaceFolderContents {
  
  inline def apply(): WorkspaceFolderContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFolderContents]
  }
  
  extension [Self <: WorkspaceFolderContents](x: Self) {
    
    inline def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    inline def setFolder(
      value: /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
    ): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setItems(
      value: js.Array[
          /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(
      value: (/* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem)*
    ): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setParentFolders(
      value: js.Array[
          /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
        ]
    ): Self = StObject.set(x, "parentFolders", value.asInstanceOf[js.Any])
    
    inline def setParentFoldersUndefined: Self = StObject.set(x, "parentFolders", js.undefined)
    
    inline def setParentFoldersVarargs(
      value: (/* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem)*
    ): Self = StObject.set(x, "parentFolders", js.Array(value*))
    
    inline def setResultSetSize(value: String): Self = StObject.set(x, "resultSetSize", value.asInstanceOf[js.Any])
    
    inline def setResultSetSizeUndefined: Self = StObject.set(x, "resultSetSize", js.undefined)
    
    inline def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    inline def setTotalSetSize(value: String): Self = StObject.set(x, "totalSetSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSetSizeUndefined: Self = StObject.set(x, "totalSetSize", js.undefined)
    
    inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
