package typings.fluxible.fluxibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxibleConfiguration extends js.Object {
  /**
    * Stores your top level React component for access using `getComponent()`
    */
  var component: js.Any
  /**
    * App level component action handler
    */
  var componentActionHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object FluxibleConfiguration {
  @scala.inline
  def apply(component: js.Any, componentActionHandler: () => Unit = null): FluxibleConfiguration = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (componentActionHandler != null) __obj.updateDynamic("componentActionHandler")(js.Any.fromFunction0(componentActionHandler))
    __obj.asInstanceOf[FluxibleConfiguration]
  }
}

