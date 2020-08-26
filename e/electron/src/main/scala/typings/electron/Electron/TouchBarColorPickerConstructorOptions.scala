package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBarColorPickerConstructorOptions extends js.Object {
  /**
    * Array of hex color strings to appear as possible colors to select.
    */
  var availableColors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Function to call when a color is selected.
    */
  var change: js.UndefOr[js.Function1[/* color */ String, Unit]] = js.native
  /**
    * The selected hex color in the picker, i.e `#ABCDEF`.
    */
  var selectedColor: js.UndefOr[String] = js.native
}

object TouchBarColorPickerConstructorOptions {
  @scala.inline
  def apply(): TouchBarColorPickerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarColorPickerConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarColorPickerConstructorOptionsOps[Self <: TouchBarColorPickerConstructorOptions] (val x: Self) extends AnyVal {
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
    def setAvailableColorsVarargs(value: String*): Self = this.set("availableColors", js.Array(value :_*))
    @scala.inline
    def setAvailableColors(value: js.Array[String]): Self = this.set("availableColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableColors: Self = this.set("availableColors", js.undefined)
    @scala.inline
    def setChange(value: /* color */ String => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setSelectedColor(value: String): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedColor: Self = this.set("selectedColor", js.undefined)
  }
  
}

