package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrioritySettings extends js.Object {
  /** The dataSource option can accept the JSON object collection that contains the priority related data.
    * @Default {{% highlight js%}[{ text: None, value: none },{ text: High, value: high },{ text: Medium, value: medium },{ text: Low, value: low }]{% endhighlight %}}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  /** When set to true, enables the priority options available for the Schedule appointments.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Allows priority field customization in the appointment window to add custom icons denoting the priority level for the appointments.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Binds text field name in the dataSource to prioritySettings text. These text gets listed out in priority field of the appointment window.
    * @Default {text}
    */
  var text: js.UndefOr[String] = js.native
  /** Binds value field name in the dataSource to prioritySettings value. These field names usually accepts four priority values by default, high, low, medium and none.
    * @Default {value}
    */
  var value: js.UndefOr[String] = js.native
}

object PrioritySettings {
  @scala.inline
  def apply(): PrioritySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrioritySettings]
  }
  @scala.inline
  implicit class PrioritySettingsOps[Self <: PrioritySettings] (val x: Self) extends AnyVal {
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
    def setDataSource(value: js.Any | js.Array[_]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

