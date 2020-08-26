package typings.dwt.anon

import typings.dwt.addonOCRProMod.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofOCRPro extends js.Object {
  def NewSettings(): Settings = js.native
}

object TypeofOCRPro {
  @scala.inline
  def apply(NewSettings: () => Settings): TypeofOCRPro = {
    val __obj = js.Dynamic.literal(NewSettings = js.Any.fromFunction0(NewSettings))
    __obj.asInstanceOf[TypeofOCRPro]
  }
  @scala.inline
  implicit class TypeofOCRProOps[Self <: TypeofOCRPro] (val x: Self) extends AnyVal {
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
    def setNewSettings(value: () => Settings): Self = this.set("NewSettings", js.Any.fromFunction0(value))
  }
  
}

