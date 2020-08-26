package typings.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Badge extends js.Object {
  /** Specifies whether to enable badge or not.
    * @Default {false}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies maximum value for tile badge.
    * @Default {100}
    */
  var maxValue: js.UndefOr[Double] = js.native
  /** Specifies minimum value for tile badge.
    * @Default {1}
    */
  var minValue: js.UndefOr[Double] = js.native
  /** Sets position for tile badge.
    * @Default {â€œbottomrightâ€}
    */
  var position: js.UndefOr[BadgePosition | String] = js.native
  /** Specifies text instead of number for tile badge.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Sets value for tile badge.
    * @Default {1}
    */
  var value: js.UndefOr[Double] = js.native
}

object Badge {
  @scala.inline
  def apply(): Badge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Badge]
  }
  @scala.inline
  implicit class BadgeOps[Self <: Badge] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setPosition(value: BadgePosition | String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

