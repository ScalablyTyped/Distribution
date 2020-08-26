package typings.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSettings extends js.Object {
  /** Specifies height of the range navigator.
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.native
  /** Specifies width of the range navigator.
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.native
}

object SizeSettings {
  @scala.inline
  def apply(): SizeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeSettings]
  }
  @scala.inline
  implicit class SizeSettingsOps[Self <: SizeSettings] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

