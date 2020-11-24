package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeExportEventArgs extends js.Object {
  
  /** holds the name of the file to be exported.
    */
  var fileName: js.UndefOr[String] = js.native
  
  /** holds the url of the service method responsible for exporting the PivotClient control.
    */
  var url: js.UndefOr[String] = js.native
}
object BeforeExportEventArgs {
  
  @scala.inline
  def apply(): BeforeExportEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeExportEventArgs]
  }
  
  @scala.inline
  implicit class BeforeExportEventArgsOps[Self <: BeforeExportEventArgs] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
