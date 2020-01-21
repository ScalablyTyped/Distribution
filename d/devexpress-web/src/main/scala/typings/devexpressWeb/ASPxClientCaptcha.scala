package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxCaptcha control.
  */
@JSGlobal("ASPxClientCaptcha")
@js.native
class ASPxClientCaptcha () extends ASPxClientControl {
  /**
    * Sets input focus to the control's text box.
    */
  def Focus(): Unit = js.native
  /**
    * Refreshes the code displayed within the editor's challenge image.
    */
  def Refresh(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientCaptcha")
@js.native
object ASPxClientCaptcha extends js.Object {
  /**
    * Converts the specified object to the ASPxClientCaptcha type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientCaptcha = js.native
}

