package typings.figma.mod.global

import typings.figma.figmaStrings.JPG
import typings.figma.figmaStrings.PNG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSettingsImage extends ExportSettings {
  
  val constraint: js.UndefOr[ExportSettingsConstraints] = js.native
  
  val contentsOnly: js.UndefOr[Boolean] = js.native
  
  val format: JPG | PNG = js.native
  
   // defaults to true
  val suffix: js.UndefOr[String] = js.native
}
object ExportSettingsImage {
  
  @scala.inline
  def apply(format: JPG | PNG): ExportSettingsImage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsImage]
  }
  
  @scala.inline
  implicit class ExportSettingsImageOps[Self <: ExportSettingsImage] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: JPG | PNG): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraint(value: ExportSettingsConstraints): Self = this.set("constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraint: Self = this.set("constraint", js.undefined)
    
    @scala.inline
    def setContentsOnly(value: Boolean): Self = this.set("contentsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentsOnly: Self = this.set("contentsOnly", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
}
