package typings.fluxible.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluxibleConfiguration extends js.Object {
  /**
    * Stores your top level React component for access using `getComponent()`
    */
  var component: js.Any = js.native
  /**
    * App level component action handler
    */
  var componentActionHandler: js.UndefOr[js.Function0[Unit]] = js.native
}

object FluxibleConfiguration {
  @scala.inline
  def apply(component: js.Any): FluxibleConfiguration = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxibleConfiguration]
  }
  @scala.inline
  implicit class FluxibleConfigurationOps[Self <: FluxibleConfiguration] (val x: Self) extends AnyVal {
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
    def setComponent(value: js.Any): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentActionHandler(value: () => Unit): Self = this.set("componentActionHandler", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComponentActionHandler: Self = this.set("componentActionHandler", js.undefined)
  }
  
}

