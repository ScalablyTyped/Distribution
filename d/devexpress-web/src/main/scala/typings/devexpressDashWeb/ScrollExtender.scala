package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a method allowing you to apply the current scroll extender to a specific element.
  */
@js.native
trait ScrollExtender extends js.Object {
  /**
    * Applies the current scroll extender to the specified DOM element.
    * @param element An object specifying the required DOM element.
    */
  def ChangeElement(element: js.Object): Unit = js.native
  /**
    * Applies the current scroll extender to the element specified by the ID.
    * @param id A string value specifying the element's ID.
    */
  def ChangeElement(id: String): Unit = js.native
}

