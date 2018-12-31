package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHyperLink control.
  */
trait ASPxClientHyperLink extends ASPxClientStaticEdit {
  /**
    * Gets an URL which defines the navigation location for the editor's hyperlink.
    */
  def GetNavigateUrl(): java.lang.String
  /**
    * Gets the text caption displayed for the hyperlink in the hyperlink editor.
    */
  def GetText(): java.lang.String
  /**
    * Specifies an URL which defines the navigation location for the editor's hyperlink.
    * @param url A string value which specifies an URL to where the client web browser will navigate when a hyperlink in the editor is clicked.
    */
  def SetNavigateUrl(url: java.lang.String): scala.Unit
  /**
    * Specifies the text caption displayed for the hyperlink in the hyperlink editor.
    * @param text A string value specifying the text caption for the hyperlink in the editor.
    */
  def SetText(text: java.lang.String): scala.Unit
}

