package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base for client editor objects realizing the dropdown editor functionality.
  */
@JSGlobal("ASPxClientDropDownEdit")
@js.native
class ASPxClientDropDownEdit () extends ASPxClientDropDownEditBase {
  /**
    * Allows you to handle a click on 'Ok' and 'Cancel' buttons in the drop-down window.
    */
  var DropDownCommandButtonClick: ASPxClientEvent[ASPxClientDropDownCommandEventHandler[ASPxClientDropDownEdit]] = js.native
  /**
    * Obtains the key value associated with the text displayed within the editor's edit box.
    */
  def GetKeyValue(): String = js.native
  /**
    * Specifies the key value associated with the text displayed within the editor's edit box.
    * @param keyValue A string specifying the key value associated with the editor's value (displayed text).
    */
  def SetKeyValue(keyValue: String): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientDropDownEdit")
@js.native
object ASPxClientDropDownEdit extends js.Object {
  /**
    * Converts the specified object to the ASPxClientDropDownEdit type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientDropDownEdit = js.native
}

