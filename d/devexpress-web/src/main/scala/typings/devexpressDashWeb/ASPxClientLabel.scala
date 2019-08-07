package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxLabel control.
  */
@JSGlobal("ASPxClientLabel")
@js.native
class ASPxClientLabel () extends ASPxClientStaticEdit {
  /**
    * Returns the text displayed within the editor.
    */
  def GetText(): String = js.native
  /**
    * Sets the text to be displayed within the editor.
    * @param text A string value specifying the text to be displayed within the editor.
    */
  def SetText(text: String): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientLabel")
@js.native
object ASPxClientLabel extends js.Object {
  /**
    * Converts the specified object to the ASPxClientLabel type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientLabel = js.native
}

