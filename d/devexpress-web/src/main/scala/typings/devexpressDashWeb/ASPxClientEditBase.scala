package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base object for all the editors included in the client-side object model.
  */
@JSGlobal("ASPxClientEditBase")
@js.native
class ASPxClientEditBase () extends ASPxClientControl {
  /**
    * Returns the text displayed in the editor caption.
    */
  def GetCaption(): String = js.native
  /**
    * Returns a value indicating whether an editor is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the editor's value.
    */
  def GetValue(): js.Any = js.native
  /**
    * Specifies the text displayed in the editor caption.
    * @param caption A string value specifying the editor caption.
    */
  def SetCaption(caption: String): Unit = js.native
  /**
    * Specifies whether an editor is enabled.
    * @param value true to enable the editor; otherwise, false.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Changes the editor's value.
    * @param value An object representing the data to be assigned to the editor's edit value.
    */
  def SetValue(value: js.Any): Unit = js.native
}

