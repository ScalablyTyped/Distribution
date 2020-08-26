package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RibbonSettingsApplicationTabMenuSettings extends js.Object {
  /** Specifies the data source to append in application tab.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to enable or disable isAppend property in ribbon settings.
    * @Default {false}
    */
  var isAppend: js.UndefOr[Boolean] = js.native
}

object RibbonSettingsApplicationTabMenuSettings {
  @scala.inline
  def apply(): RibbonSettingsApplicationTabMenuSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RibbonSettingsApplicationTabMenuSettings]
  }
  @scala.inline
  implicit class RibbonSettingsApplicationTabMenuSettingsOps[Self <: RibbonSettingsApplicationTabMenuSettings] (val x: Self) extends AnyVal {
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
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setIsAppend(value: Boolean): Self = this.set("isAppend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAppend: Self = this.set("isAppend", js.undefined)
  }
  
}

