package typings.ejWebAll.ej.ColorPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipText extends js.Object {
  /** Sets the tooltip text for the add button.
    */
  var addButton: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the basic preset.
    */
  var basic: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the candy crush preset.
    */
  var candyCrush: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the citrus preset.
    */
  var citrus: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the current color area.
    */
  var currentColor: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the flat colors preset.
    */
  var flatColors: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the misty preset.
    */
  var misty: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the mono chrome preset.
    */
  var monoChrome: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the moon light preset.
    */
  var moonLight: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the pink shades preset.
    */
  var pinkShades: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the sandy preset.
    */
  var sandy: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the sea wolf preset.
    */
  var seaWolf: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the selected color area.
    */
  var selectedColor: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the switcher button.
    */
  var switcher: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the vintage preset.
    */
  var vintage: js.UndefOr[String] = js.native
  /** Sets the tooltip text for the web colors preset.
    */
  var webColors: js.UndefOr[String] = js.native
}

object TooltipText {
  @scala.inline
  def apply(): TooltipText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipText]
  }
  @scala.inline
  implicit class TooltipTextOps[Self <: TooltipText] (val x: Self) extends AnyVal {
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
    def setAddButton(value: String): Self = this.set("addButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddButton: Self = this.set("addButton", js.undefined)
    @scala.inline
    def setBasic(value: String): Self = this.set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    @scala.inline
    def setCandyCrush(value: String): Self = this.set("candyCrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandyCrush: Self = this.set("candyCrush", js.undefined)
    @scala.inline
    def setCitrus(value: String): Self = this.set("citrus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCitrus: Self = this.set("citrus", js.undefined)
    @scala.inline
    def setCurrentColor(value: String): Self = this.set("currentColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentColor: Self = this.set("currentColor", js.undefined)
    @scala.inline
    def setFlatColors(value: String): Self = this.set("flatColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatColors: Self = this.set("flatColors", js.undefined)
    @scala.inline
    def setMisty(value: String): Self = this.set("misty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMisty: Self = this.set("misty", js.undefined)
    @scala.inline
    def setMonoChrome(value: String): Self = this.set("monoChrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonoChrome: Self = this.set("monoChrome", js.undefined)
    @scala.inline
    def setMoonLight(value: String): Self = this.set("moonLight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoonLight: Self = this.set("moonLight", js.undefined)
    @scala.inline
    def setPinkShades(value: String): Self = this.set("pinkShades", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinkShades: Self = this.set("pinkShades", js.undefined)
    @scala.inline
    def setSandy(value: String): Self = this.set("sandy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandy: Self = this.set("sandy", js.undefined)
    @scala.inline
    def setSeaWolf(value: String): Self = this.set("seaWolf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeaWolf: Self = this.set("seaWolf", js.undefined)
    @scala.inline
    def setSelectedColor(value: String): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedColor: Self = this.set("selectedColor", js.undefined)
    @scala.inline
    def setSwitcher(value: String): Self = this.set("switcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitcher: Self = this.set("switcher", js.undefined)
    @scala.inline
    def setVintage(value: String): Self = this.set("vintage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVintage: Self = this.set("vintage", js.undefined)
    @scala.inline
    def setWebColors(value: String): Self = this.set("webColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebColors: Self = this.set("webColors", js.undefined)
  }
  
}

