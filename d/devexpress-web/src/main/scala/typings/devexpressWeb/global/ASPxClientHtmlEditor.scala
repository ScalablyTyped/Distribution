package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxHtmlEditor control.
  */
@JSGlobal("ASPxClientHtmlEditor")
@js.native
class ASPxClientHtmlEditor ()
  extends typings.devexpressWeb.ASPxClientHtmlEditor
/* static members */
@JSGlobal("ASPxClientHtmlEditor")
@js.native
object ASPxClientHtmlEditor extends js.Object {
  
  /**
    * Converts the specified object to the ASPxClientHtmlEditor type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): typings.devexpressWeb.ASPxClientHtmlEditor = js.native
  
  /**
    * Programmatically closes a custom dialog, supplying it with specific parameters.
    * @param status An object representing a custom dialog's closing status.
    * @param data An object representing custom data associated with a custom dialog.
    */
  def CustomDialogComplete(status: js.Any, data: js.Any): Unit = js.native
  
  /**
    * Highlights the text with the specified text color and background color.
    * @param text A string value specifying the text to be highlighted.
    * @param searchContainer An object specifying the container where the specified text should be searched.
    * @param color A string value specifying the text color.
    * @param backgroundColor A string value specifying the background color.
    */
  def HighlightText(text: String, searchContainer: js.Any): Unit = js.native
  def HighlightText(text: String, searchContainer: js.Any, color: js.UndefOr[scala.Nothing], backgroundColor: String): Unit = js.native
  def HighlightText(text: String, searchContainer: js.Any, color: String): Unit = js.native
  def HighlightText(text: String, searchContainer: js.Any, color: String, backgroundColor: String): Unit = js.native
}
