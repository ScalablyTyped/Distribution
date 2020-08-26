package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides access to the parameter value and display text.
  */
@js.native
trait ASPxClientDashboardParameterValue extends js.Object {
  /**
    * Returns the parameter display text.
    */
  def GetDisplayText(): String = js.native
  /**
    * Returns a parameter value.
    */
  def GetValue(): js.Any = js.native
}

object ASPxClientDashboardParameterValue {
  @scala.inline
  def apply(GetDisplayText: () => String, GetValue: () => js.Any): ASPxClientDashboardParameterValue = {
    val __obj = js.Dynamic.literal(GetDisplayText = js.Any.fromFunction0(GetDisplayText), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[ASPxClientDashboardParameterValue]
  }
  @scala.inline
  implicit class ASPxClientDashboardParameterValueOps[Self <: ASPxClientDashboardParameterValue] (val x: Self) extends AnyVal {
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
    def setGetDisplayText(value: () => String): Self = this.set("GetDisplayText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("GetValue", js.Any.fromFunction0(value))
  }
  
}

