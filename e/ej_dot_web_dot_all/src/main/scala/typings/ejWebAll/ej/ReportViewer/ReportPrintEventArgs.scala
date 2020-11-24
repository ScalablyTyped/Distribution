package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportPrintEventArgs extends js.Object {
  
  /** true if you have to load the external style file; otherwise, false.
    */
  var isStyleLoad: js.UndefOr[Boolean] = js.native
}
object ReportPrintEventArgs {
  
  @scala.inline
  def apply(): ReportPrintEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportPrintEventArgs]
  }
  
  @scala.inline
  implicit class ReportPrintEventArgsOps[Self <: ReportPrintEventArgs] (val x: Self) extends AnyVal {
    
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
    def setIsStyleLoad(value: Boolean): Self = this.set("isStyleLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStyleLoad: Self = this.set("isStyleLoad", js.undefined)
  }
}
