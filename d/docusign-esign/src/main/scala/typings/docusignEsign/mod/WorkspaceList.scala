package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceList extends js.Object {
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.native
  
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
    * A list of workspaces.
    */
  var workspaces: js.UndefOr[
    js.Array[
      /* A DocuSign workspace is a collaboration area for sharing files and data. */ Workspace
    ]
  ] = js.native
}
object WorkspaceList {
  
  @scala.inline
  def apply(): WorkspaceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceList]
  }
  
  @scala.inline
  implicit class WorkspaceListOps[Self <: WorkspaceList] (val x: Self) extends AnyVal {
    
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
    def setWorkspacesVarargs(value: (/* A DocuSign workspace is a collaboration area for sharing files and data. */ Workspace)*): Self = this.set("workspaces", js.Array(value :_*))
    
    @scala.inline
    def setWorkspaces(
      value: js.Array[
          /* A DocuSign workspace is a collaboration area for sharing files and data. */ Workspace
        ]
    ): Self = this.set("workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaces: Self = this.set("workspaces", js.undefined)
  }
}
