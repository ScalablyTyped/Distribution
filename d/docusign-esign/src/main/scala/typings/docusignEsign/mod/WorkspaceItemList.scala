package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceItemList extends js.Object {
  
  /**
    * A list of workspace items.
    */
  var items: js.UndefOr[
    js.Array[
      /* This object represents an item in a workspace, which can be either a file or folder. */ WorkspaceItem
    ]
  ] = js.native
}
object WorkspaceItemList {
  
  @scala.inline
  def apply(): WorkspaceItemList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceItemList]
  }
  
  @scala.inline
  implicit class WorkspaceItemListOps[Self <: WorkspaceItemList] (val x: Self) extends AnyVal {
    
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
  }
}
