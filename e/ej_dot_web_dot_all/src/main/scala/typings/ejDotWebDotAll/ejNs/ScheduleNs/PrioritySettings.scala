package typings.ejDotWebDotAll.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrioritySettings extends js.Object {
  /** The dataSource option can accept the JSON object collection that contains the priority related data.
    * @Default {{% highlight js%}[{ text: None, value: none },{ text: High, value: high },{ text: Medium, value: medium },{ text: Low, value: low }]{% endhighlight %}}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /** When set to true, enables the priority options available for the Schedule appointments.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /** Allows priority field customization in the appointment window to add custom icons denoting the priority level for the appointments.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
  /** Binds text field name in the dataSource to prioritySettings text. These text gets listed out in priority field of the appointment window.
    * @Default {text}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Binds value field name in the dataSource to prioritySettings value. These field names usually accepts four priority values by default, high, low, medium and none.
    * @Default {value}
    */
  var value: js.UndefOr[String] = js.undefined
}

object PrioritySettings {
  @scala.inline
  def apply(
    dataSource: js.Any | js.Array[_] = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    text: String = null,
    value: String = null
  ): PrioritySettings = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (template != null) __obj.updateDynamic("template")(template)
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PrioritySettings]
  }
}

