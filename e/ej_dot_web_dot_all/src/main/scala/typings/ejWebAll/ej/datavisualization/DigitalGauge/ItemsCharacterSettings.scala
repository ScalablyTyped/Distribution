package typings.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsCharacterSettings extends js.Object {
  /** Specifies the CharacterCount value for the DigitalGauge.
    * @Default {4}
    */
  var count: js.UndefOr[Double] = js.native
  /** Specifies the opacity value for the DigitalGauge.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the value for spacing between the characters
    * @Default {2}
    */
  var spacing: js.UndefOr[Double] = js.native
  /** Specifies the character type for the text to be displayed.
    * @Default {ej.datavisualization.DigitalGauge.CharacterType.EightCrossEightDotMatrix}
    */
  var `type`: js.UndefOr[CharacterType | String] = js.native
}

object ItemsCharacterSettings {
  @scala.inline
  def apply(): ItemsCharacterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsCharacterSettings]
  }
  @scala.inline
  implicit class ItemsCharacterSettingsOps[Self <: ItemsCharacterSettings] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setType(value: CharacterType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

