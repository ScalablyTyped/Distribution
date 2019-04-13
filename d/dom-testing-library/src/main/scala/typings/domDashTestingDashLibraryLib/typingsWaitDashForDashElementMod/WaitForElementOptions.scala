package typings
package domDashTestingDashLibraryLib.typingsWaitDashForDashElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForElementOptions extends js.Object {
  var container: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var mutationObserverOptions: js.UndefOr[stdLib.MutationObserverInit] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object WaitForElementOptions {
  @scala.inline
  def apply(
    container: stdLib.HTMLElement = null,
    mutationObserverOptions: stdLib.MutationObserverInit = null,
    timeout: scala.Int | scala.Double = null
  ): WaitForElementOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (mutationObserverOptions != null) __obj.updateDynamic("mutationObserverOptions")(mutationObserverOptions)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitForElementOptions]
  }
}

