package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains scroll extender methods that can be used to support scrolling under touch UI devices.
  */
@JSGlobal("ASPxClientTouchUI")
@js.native
class ASPxClientTouchUI () extends js.Object

/* static members */
@JSGlobal("ASPxClientTouchUI")
@js.native
object ASPxClientTouchUI extends js.Object {
  /**
    * Extends the specified element's functionality with scrolling via touch behavior (one finger) and customized scrollbar-related options. A ScrollExtender object allowing you to apply the current scroll extender to another element.
    * @param options An ASPxClientTouchUIOptions object that provides options affecting the touch scrolling functionality.
    */
  def MakeScrollable(id: String): ScrollExtender = js.native
  def MakeScrollable(id: String, options: ASPxClientTouchUIOptions): ScrollExtender = js.native
  def MakeScrollable(id: js.Any): ScrollExtender = js.native
  def MakeScrollable(id: js.Any, options: ASPxClientTouchUIOptions): ScrollExtender = js.native
}

