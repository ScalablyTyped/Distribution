package typings.figma.mod.global

import typings.figma.figmaStrings.HEIGHT
import typings.figma.figmaStrings.SCALE
import typings.figma.figmaStrings.WIDTH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSettingsConstraints extends js.Object {
  
  val `type`: SCALE | WIDTH | HEIGHT = js.native
  
  val value: Double = js.native
}
object ExportSettingsConstraints {
  
  @scala.inline
  def apply(`type`: SCALE | WIDTH | HEIGHT, value: Double): ExportSettingsConstraints = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsConstraints]
  }
  
  @scala.inline
  implicit class ExportSettingsConstraintsOps[Self <: ExportSettingsConstraints] (val x: Self) extends AnyVal {
    
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
    def setType(value: SCALE | WIDTH | HEIGHT): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
