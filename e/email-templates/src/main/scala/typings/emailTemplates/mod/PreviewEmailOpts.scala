package typings.emailTemplates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// No typedef for https://github.com/forwardemail/preview-email
@js.native
trait PreviewEmailOpts extends js.Object {
  
  /**
    * a path to a directory for saving the generated email previews (defaults to os.tmpdir()
    */
  var dir: js.UndefOr[String] = js.native
  
  /**
    * a unique ID for the file name created for the preview in dir (defaults to uuid.v4() from uuid)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * https://github.com/sindresorhus/open
    */
  var open: js.UndefOr[js.Any] = js.native
  
  /**
    * a file path to a pug template file (defaults to preview-email's template.pug by default)
    */
  var template: js.UndefOr[String] = js.native
}
object PreviewEmailOpts {
  
  @scala.inline
  def apply(): PreviewEmailOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewEmailOpts]
  }
  
  @scala.inline
  implicit class PreviewEmailOptsOps[Self <: PreviewEmailOpts] (val x: Self) extends AnyVal {
    
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setOpen(value: js.Any): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
