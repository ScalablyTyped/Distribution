package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains scroll extender methods that can be used to support scrolling under touch UI devices.
  */
@JSGlobal("ASPxClientTouchUI")
@js.native
class ASPxClientTouchUI ()
  extends typings.devexpressWeb.ASPxClientTouchUI

/* static members */
@JSGlobal("ASPxClientTouchUI")
@js.native
object ASPxClientTouchUI extends js.Object {
  /**
    * Extends the specified element's functionality with scrolling via touch behavior (one finger) and customized scrollbar-related options. A ScrollExtender object allowing you to apply the current scroll extender to another element.
    * @param options An ASPxClientTouchUIOptions object that provides options affecting the touch scrolling functionality.
    */
  def MakeScrollable(id: String): typings.devexpressWeb.ScrollExtender = js.native
  def MakeScrollable(id: String, options: typings.devexpressWeb.ASPxClientTouchUIOptions): typings.devexpressWeb.ScrollExtender = js.native
  def MakeScrollable(id: js.Any): typings.devexpressWeb.ScrollExtender = js.native
  def MakeScrollable(id: js.Any, options: typings.devexpressWeb.ASPxClientTouchUIOptions): typings.devexpressWeb.ScrollExtender = js.native
}

