package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the loading panel functionality.
  */
@JSGlobal("LoadingPanel")
@js.native
class LoadingPanel () extends js.Object {
  /**
    * Allows you to provide a custom loading panel.
    */
  var customPanel: js.UndefOr[ICustomLoadingPanel] = js.native
  /**
    * Specifies whether the loading panel is enabled in the control.
    */
  var enabled: Boolean = js.native
  /**
    * Hides the loading panel.
    */
  def hide(): Unit = js.native
  /**
    * Shows the loading panel.
    */
  def show(): Unit = js.native
}

