package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientPopupControlCloseReasonStatic extends js.Object {
  /**
    * The window has been closed by an API.
    */
  var API: java.lang.String
  /**
    * An end-user clicks the close header button.
    */
  var CloseButton: java.lang.String
  /**
    * An end-user presses the ESC key.
    */
  var Escape: java.lang.String
  /**
    * An end-user moves the mouse pointer out of the window region.
    */
  var MouseOut: java.lang.String
  /**
    * An end-user clicks outside the window's region
    */
  var OuterMouseClick: java.lang.String
}

object ASPxClientPopupControlCloseReasonStatic {
  @scala.inline
  def apply(
    API: java.lang.String,
    CloseButton: java.lang.String,
    Escape: java.lang.String,
    MouseOut: java.lang.String,
    OuterMouseClick: java.lang.String
  ): ASPxClientPopupControlCloseReasonStatic = {
    val __obj = js.Dynamic.literal(API = API, CloseButton = CloseButton, Escape = Escape, MouseOut = MouseOut, OuterMouseClick = OuterMouseClick)
  
    __obj.asInstanceOf[ASPxClientPopupControlCloseReasonStatic]
  }
}

