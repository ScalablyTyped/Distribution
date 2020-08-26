package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializationSettings extends js.Object {
  /** defines whether the default diagram properties can be serialized or not.
    * @Default {false}
    */
  var preventDefaultValues: js.UndefOr[Boolean] = js.native
}

object SerializationSettings {
  @scala.inline
  def apply(): SerializationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializationSettings]
  }
  @scala.inline
  implicit class SerializationSettingsOps[Self <: SerializationSettings] (val x: Self) extends AnyVal {
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
    def setPreventDefaultValues(value: Boolean): Self = this.set("preventDefaultValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDefaultValues: Self = this.set("preventDefaultValues", js.undefined)
  }
  
}

