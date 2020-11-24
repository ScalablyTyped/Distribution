package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitterResizedEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the value based on current splitter position.
    */
  var currentSplitterPosition: js.UndefOr[String] = js.native
  
  /** To set custom position for splitter after resize action.
    */
  var customSplitterPosition: js.UndefOr[String] = js.native
  
  /** Returns the value to differentiate whether splitter resizing is performed either by manual resizing or by method
    */
  var isOnResize: js.UndefOr[Boolean] = js.native
  
  /** To differentiate `customSplitterPosition` value was index or position.
    */
  var isSplitterIndex: js.UndefOr[Boolean] = js.native
  
  /** Returns the previous splitter position
    */
  var prevSplitterPosition: js.UndefOr[String] = js.native
}
object SplitterResizedEventArgs {
  
  @scala.inline
  def apply(): SplitterResizedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterResizedEventArgs]
  }
  
  @scala.inline
  implicit class SplitterResizedEventArgsOps[Self <: SplitterResizedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCurrentSplitterPosition(value: String): Self = this.set("currentSplitterPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentSplitterPosition: Self = this.set("currentSplitterPosition", js.undefined)
    
    @scala.inline
    def setCustomSplitterPosition(value: String): Self = this.set("customSplitterPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSplitterPosition: Self = this.set("customSplitterPosition", js.undefined)
    
    @scala.inline
    def setIsOnResize(value: Boolean): Self = this.set("isOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOnResize: Self = this.set("isOnResize", js.undefined)
    
    @scala.inline
    def setIsSplitterIndex(value: Boolean): Self = this.set("isSplitterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSplitterIndex: Self = this.set("isSplitterIndex", js.undefined)
    
    @scala.inline
    def setPrevSplitterPosition(value: String): Self = this.set("prevSplitterPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevSplitterPosition: Self = this.set("prevSplitterPosition", js.undefined)
  }
}
