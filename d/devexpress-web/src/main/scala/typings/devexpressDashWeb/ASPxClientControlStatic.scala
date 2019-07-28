package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientControlStatic extends ASPxClientControlBaseStatic {
  /**
    * Modifies the controls size on the page.
    */
  def AdjustControls(): Unit = js.native
  /**
    * Modifies the controls size within the specified container.
    * @param container An HTML element that is the container of the controls.
    */
  def AdjustControls(container: js.Object): Unit = js.native
  /**
    * Returns a collection of client web control objects.
    */
  def GetControlCollection(): ASPxClientControlCollection = js.native
}

