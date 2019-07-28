package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientPopupControlCloseReasonStatic extends js.Object {
  /**
    * The window has been closed by an API.
    */
  var API: String
  /**
    * An end-user clicks the close header button.
    */
  var CloseButton: String
  /**
    * An end-user presses the ESC key.
    */
  var Escape: String
  /**
    * An end-user moves the mouse pointer out of the window region.
    */
  var MouseOut: String
  /**
    * An end-user clicks outside the window's region
    */
  var OuterMouseClick: String
}

object ASPxClientPopupControlCloseReasonStatic {
  @scala.inline
  def apply(API: String, CloseButton: String, Escape: String, MouseOut: String, OuterMouseClick: String): ASPxClientPopupControlCloseReasonStatic = {
    val __obj = js.Dynamic.literal(API = API, CloseButton = CloseButton, Escape = Escape, MouseOut = MouseOut, OuterMouseClick = OuterMouseClick)
  
    __obj.asInstanceOf[ASPxClientPopupControlCloseReasonStatic]
  }
}

