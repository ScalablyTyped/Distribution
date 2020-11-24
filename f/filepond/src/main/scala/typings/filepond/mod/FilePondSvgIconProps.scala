package typings.filepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondSvgIconProps extends js.Object {
  
  /**
    * The icon used for done.
    * @default '<svg></svg>'
    */
  var iconDone: js.UndefOr[String] = js.native
  
  /**
    * The icon used for process actions.
    * @default '<svg></svg>'
    */
  var iconProcess: js.UndefOr[String] = js.native
  
  /**
    * The icon used for remove actions.
    * @default '<svg></svg>'
    */
  var iconRemove: js.UndefOr[String] = js.native
  
  /**
    * The icon used for retry actions.
    * @default '<svg></svg>'
    */
  var iconRetry: js.UndefOr[String] = js.native
  
  /**
    * The icon used for undo actions.
    * @default '<svg></svg>'
    */
  var iconUndo: js.UndefOr[String] = js.native
}
object FilePondSvgIconProps {
  
  @scala.inline
  def apply(): FilePondSvgIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondSvgIconProps]
  }
  
  @scala.inline
  implicit class FilePondSvgIconPropsOps[Self <: FilePondSvgIconProps] (val x: Self) extends AnyVal {
    
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
    def setIconDone(value: String): Self = this.set("iconDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconDone: Self = this.set("iconDone", js.undefined)
    
    @scala.inline
    def setIconProcess(value: String): Self = this.set("iconProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconProcess: Self = this.set("iconProcess", js.undefined)
    
    @scala.inline
    def setIconRemove(value: String): Self = this.set("iconRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconRemove: Self = this.set("iconRemove", js.undefined)
    
    @scala.inline
    def setIconRetry(value: String): Self = this.set("iconRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconRetry: Self = this.set("iconRetry", js.undefined)
    
    @scala.inline
    def setIconUndo(value: String): Self = this.set("iconUndo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUndo: Self = this.set("iconUndo", js.undefined)
  }
}
