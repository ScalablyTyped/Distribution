package typings.expoConfigureSplashScreen.constantsMod

import typings.colorString.mod.ColorDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arguments extends js.Object {
  var backgroundColor: ColorDescriptor = js.native
  var darkModeBackgroundColor: js.UndefOr[ColorDescriptor] = js.native
  /**
    * Absolute path
    */
  var darkModeImagePath: js.UndefOr[String] = js.native
  /**
    * Absolute path
    */
  var imagePath: js.UndefOr[String] = js.native
}

object Arguments {
  @scala.inline
  def apply(backgroundColor: ColorDescriptor): Arguments = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  @scala.inline
  implicit class ArgumentsOps[Self <: Arguments] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: ColorDescriptor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDarkModeBackgroundColor(value: ColorDescriptor): Self = this.set("darkModeBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkModeBackgroundColor: Self = this.set("darkModeBackgroundColor", js.undefined)
    @scala.inline
    def setDarkModeImagePath(value: String): Self = this.set("darkModeImagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkModeImagePath: Self = this.set("darkModeImagePath", js.undefined)
    @scala.inline
    def setImagePath(value: String): Self = this.set("imagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePath: Self = this.set("imagePath", js.undefined)
  }
  
}

