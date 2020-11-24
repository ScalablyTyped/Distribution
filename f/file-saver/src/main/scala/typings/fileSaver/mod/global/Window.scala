package typings.fileSaver.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  var saveAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any = js.native
}
object Window {
  
  @scala.inline
  def apply(
    saveAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any
  ): Window = {
    val __obj = js.Dynamic.literal(saveAs = saveAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
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
    def setSaveAs(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any
    ): Self = this.set("saveAs", value.asInstanceOf[js.Any])
  }
}
