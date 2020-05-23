package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the loading panel functionality.
  */
@JSGlobal("LoadingPanel")
@js.native
class LoadingPanel ()
  extends typings.devexpressWeb.LoadingPanel {
  /**
    * Specifies whether the loading panel is enabled in the control.
    */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /**
    * Hides the loading panel.
    */
  /* CompleteClass */
  override def hide(): Unit = js.native
  /**
    * Shows the loading panel.
    */
  /* CompleteClass */
  override def show(): Unit = js.native
}

