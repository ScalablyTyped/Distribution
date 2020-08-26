package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSettingsLocation extends js.Object {
  /** Specifies the position in horizontal direction
    * @Default {17}
    */
  var x: js.UndefOr[Double] = js.native
  /** Specifies the position in horizontal direction
    * @Default {30}
    */
  var y: js.UndefOr[Double] = js.native
}

object CaptionSettingsLocation {
  @scala.inline
  def apply(): CaptionSettingsLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettingsLocation]
  }
  @scala.inline
  implicit class CaptionSettingsLocationOps[Self <: CaptionSettingsLocation] (val x: Self) extends AnyVal {
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

