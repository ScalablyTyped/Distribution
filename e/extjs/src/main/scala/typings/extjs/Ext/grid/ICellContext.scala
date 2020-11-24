package typings.extjs.Ext.grid

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellContext extends IBase {
  
  /** [Property] (Boolean) */
  var isCellContext: js.UndefOr[Boolean] = js.native
}
object ICellContext {
  
  @scala.inline
  def apply(): ICellContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellContext]
  }
  
  @scala.inline
  implicit class ICellContextOps[Self <: ICellContext] (val x: Self) extends AnyVal {
    
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
    def setIsCellContext(value: Boolean): Self = this.set("isCellContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCellContext: Self = this.set("isCellContext", js.undefined)
  }
}
