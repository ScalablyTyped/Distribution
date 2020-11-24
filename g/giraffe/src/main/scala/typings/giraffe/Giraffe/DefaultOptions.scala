package typings.giraffe.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultOptions extends js.Object {
  
  var alwaysRender: js.UndefOr[Boolean] = js.native
  
  var disposeOnDetach: js.UndefOr[Boolean] = js.native
  
  var documentTitle: js.UndefOr[String] = js.native
  
  var saveScrollPosition: js.UndefOr[Boolean] = js.native
}
object DefaultOptions {
  
  @scala.inline
  def apply(): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOptions]
  }
  
  @scala.inline
  implicit class DefaultOptionsOps[Self <: DefaultOptions] (val x: Self) extends AnyVal {
    
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
    def setAlwaysRender(value: Boolean): Self = this.set("alwaysRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysRender: Self = this.set("alwaysRender", js.undefined)
    
    @scala.inline
    def setDisposeOnDetach(value: Boolean): Self = this.set("disposeOnDetach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisposeOnDetach: Self = this.set("disposeOnDetach", js.undefined)
    
    @scala.inline
    def setDocumentTitle(value: String): Self = this.set("documentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentTitle: Self = this.set("documentTitle", js.undefined)
    
    @scala.inline
    def setSaveScrollPosition(value: Boolean): Self = this.set("saveScrollPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveScrollPosition: Self = this.set("saveScrollPosition", js.undefined)
  }
}
