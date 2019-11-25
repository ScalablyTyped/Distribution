package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines custom loading panel members.
  */
trait ICustomLoadingPanel extends js.Object {
  /**
    * Specifies whether the panel is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Hides the loading panel.
    */
  def hide(): Unit
  /**
    * Shows the loading panel.
    */
  def show(): Unit
}

object ICustomLoadingPanel {
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit, visible: js.UndefOr[Boolean] = js.undefined): ICustomLoadingPanel = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomLoadingPanel]
  }
}

