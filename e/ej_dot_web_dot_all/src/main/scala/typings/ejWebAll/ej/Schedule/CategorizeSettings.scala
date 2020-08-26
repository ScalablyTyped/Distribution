package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategorizeSettings extends js.Object {
  /** When set to true, enables the multiple selection of categories to be applied for the appointments.
    * @Default {false}
    */
  var allowMultiple: js.UndefOr[Boolean] = js.native
  /** Binds color field name in the dataSource to category color.
    * @Default {color}
    */
  var color: js.UndefOr[String] = js.native
  /** The dataSource option accepts either the JSON object collection or DataManager [ej.DataManager] instance that contains the categorize data.
    */
  var dataSource: js.UndefOr[js.Array[_] | js.Any] = js.native
  /** When set to true, enables the categories option to be applied for the appointments.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Binds fontColor field name in the dataSource to category font.
    * @Default {fontColor}
    */
  var fontColor: js.UndefOr[String] = js.native
  /** Binds id field name in the dataSource to id of category data.
    * @Default {id}
    */
  var id: js.UndefOr[String] = js.native
  /** Binds text field name in the dataSource to category text.
    * @Default {text}
    */
  var text: js.UndefOr[String] = js.native
}

object CategorizeSettings {
  @scala.inline
  def apply(): CategorizeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategorizeSettings]
  }
  @scala.inline
  implicit class CategorizeSettingsOps[Self <: CategorizeSettings] (val x: Self) extends AnyVal {
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
    def setAllowMultiple(value: Boolean): Self = this.set("allowMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiple: Self = this.set("allowMultiple", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_] | js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

