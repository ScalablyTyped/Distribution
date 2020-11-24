package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditFlags extends js.Object {
  
  /**
    * Whether the renderer believes it can copy
    */
  var canCopy: Boolean = js.native
  
  /**
    * Whether the renderer believes it can cut.
    */
  var canCut: Boolean = js.native
  
  /**
    * Whether the renderer believes it can delete.
    */
  var canDelete: Boolean = js.native
  
  /**
    * Whether the renderer believes it can paste.
    */
  var canPaste: Boolean = js.native
  
  /**
    * Whether the renderer believes it can redo.
    */
  var canRedo: Boolean = js.native
  
  /**
    * Whether the renderer believes it can select all.
    */
  var canSelectAll: Boolean = js.native
  
  /**
    * Whether the renderer believes it can undo.
    */
  var canUndo: Boolean = js.native
}
object EditFlags {
  
  @scala.inline
  def apply(
    canCopy: Boolean,
    canCut: Boolean,
    canDelete: Boolean,
    canPaste: Boolean,
    canRedo: Boolean,
    canSelectAll: Boolean,
    canUndo: Boolean
  ): EditFlags = {
    val __obj = js.Dynamic.literal(canCopy = canCopy.asInstanceOf[js.Any], canCut = canCut.asInstanceOf[js.Any], canDelete = canDelete.asInstanceOf[js.Any], canPaste = canPaste.asInstanceOf[js.Any], canRedo = canRedo.asInstanceOf[js.Any], canSelectAll = canSelectAll.asInstanceOf[js.Any], canUndo = canUndo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditFlags]
  }
  
  @scala.inline
  implicit class EditFlagsOps[Self <: EditFlags] (val x: Self) extends AnyVal {
    
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
    def setCanCopy(value: Boolean): Self = this.set("canCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCut(value: Boolean): Self = this.set("canCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDelete(value: Boolean): Self = this.set("canDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanPaste(value: Boolean): Self = this.set("canPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRedo(value: Boolean): Self = this.set("canRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSelectAll(value: Boolean): Self = this.set("canSelectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUndo(value: Boolean): Self = this.set("canUndo", value.asInstanceOf[js.Any])
  }
}
