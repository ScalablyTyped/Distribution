package typings.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  /** Specifies the Character settings for the DigitalGauge.
    * @Default {null}
    */
  var characterSettings: js.UndefOr[ItemsCharacterSettings] = js.native
  /** Enable/Disable the custom font to be applied to the text in the gauge.
    * @Default {false}
    */
  var enableCustomFont: js.UndefOr[Boolean] = js.native
  /** Set the specific font for the text, when the enableCustomFont is set to true
    * @Default {null}
    */
  var font: js.UndefOr[ItemsFont] = js.native
  /** Set the location for the text, where it needs to be placed within the gauge.
    * @Default {null}
    */
  var position: js.UndefOr[ItemsPosition] = js.native
  /** Set the segment settings for the digital gauge.
    * @Default {null}
    */
  var segmentSettings: js.UndefOr[ItemsSegmentSettings] = js.native
  /** Set the value for enabling/disabling the blurring effect for the shadows of the text
    * @Default {0}
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /** Specifies the color of the text shadow.
    * @Default {null}
    */
  var shadowColor: js.UndefOr[String] = js.native
  /** Set the x offset value for the shadow of the text, indicating the location where it needs to be displayed.
    * @Default {1}
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /** Set the y offset value for the shadow of the text, indicating the location where it needs to be displayed.
    * @Default {1}
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /** Set the alignment of the text that is displayed within the gauge.See TextAlign
    * @Default {left}
    */
  var textAlign: js.UndefOr[String] = js.native
  /** Specifies the color of the text.
    * @Default {null}
    */
  var textColor: js.UndefOr[String] = js.native
  /** Specifies the text value.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
}

object Item {
  @scala.inline
  def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
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
    def setCharacterSettings(value: ItemsCharacterSettings): Self = this.set("characterSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterSettings: Self = this.set("characterSettings", js.undefined)
    @scala.inline
    def setEnableCustomFont(value: Boolean): Self = this.set("enableCustomFont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCustomFont: Self = this.set("enableCustomFont", js.undefined)
    @scala.inline
    def setFont(value: ItemsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setPosition(value: ItemsPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSegmentSettings(value: ItemsSegmentSettings): Self = this.set("segmentSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentSettings: Self = this.set("segmentSettings", js.undefined)
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

