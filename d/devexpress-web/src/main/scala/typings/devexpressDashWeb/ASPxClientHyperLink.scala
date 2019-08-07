package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHyperLink control.
  */
@JSGlobal("ASPxClientHyperLink")
@js.native
class ASPxClientHyperLink () extends ASPxClientStaticEdit {
  /**
    * Gets an URL which defines the navigation location for the editor's hyperlink.
    */
  def GetNavigateUrl(): String = js.native
  /**
    * Gets the text caption displayed for the hyperlink in the hyperlink editor.
    */
  def GetText(): String = js.native
  /**
    * Specifies an URL which defines the navigation location for the editor's hyperlink.
    * @param url A string value which specifies an URL to where the client web browser will navigate when a hyperlink in the editor is clicked.
    */
  def SetNavigateUrl(url: String): Unit = js.native
  /**
    * Specifies the text caption displayed for the hyperlink in the hyperlink editor.
    * @param text A string value specifying the text caption for the hyperlink in the editor.
    */
  def SetText(text: String): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientHyperLink")
@js.native
object ASPxClientHyperLink extends js.Object {
  /**
    * Converts the specified object to the ASPxClientHyperLink type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientHyperLink = js.native
}

