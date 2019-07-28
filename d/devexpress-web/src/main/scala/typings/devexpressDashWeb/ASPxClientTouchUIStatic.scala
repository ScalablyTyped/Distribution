package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientTouchUIStatic extends js.Object {
  /**
    * Extends the specified element's functionality with scrolling via touch behavior (one finger) and the ability to display vertical and horizontal scroll bars.
    * @param element An object that specifies the required DOM element.
    */
  def MakeScrollable(element: js.Object): ScrollExtender = js.native
  /**
    * Extends the specified element's functionality with scrolling via touch behavior (one finger) and customized scrollbar-related options.
    * @param element An object specifying the DOM element to extend with the touch scrolling functionality.
    * @param options An ASPxClientTouchUIOptions object that provides options affecting the touch scrolling functionality.
    */
  def MakeScrollable(element: js.Object, options: ASPxClientTouchUIOptions): ScrollExtender = js.native
  /**
    * Extends the specified element's functionality with scrolling via touch behavior (one finger) and the ability to display vertical and horizontal scroll bars.
    * @param id A string value specifying the element's ID.
    */
  def MakeScrollable(id: String): ScrollExtender = js.native
  /**
    * Extends the specified element's functionality with  scrolling via touch behavior (one finger) and customized scrollbar-related options.
    * @param id A string value specifying the name of a DOM element that should be extended with the touch scrolling functionality.
    * @param options An ASPxClientTouchUIOptions object that provides options affecting the touch scrolling functionality.
    */
  def MakeScrollable(id: String, options: ASPxClientTouchUIOptions): ScrollExtender = js.native
}

