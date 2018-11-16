package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A selection in the ASPxHtmlEditor.
 */

trait ASPxClientHtmlEditorSelection extends js.Object {
  /**
       * Returns an array of the currently selected elements.
       */
  def GetElements(): js.Array[js.Object]
  /**
       * Returns the HTML markup specifying the currently selected ASPxHtmlEditor content.
       */
  def GetHtml(): java.lang.String
  /**
       * Returns a DOM element that relates to the current selection.
       */
  def GetSelectedElement(): js.Object
  /**
       * Returns the text within the currently selected ASPxHtmlEditor content.
       */
  def GetText(): java.lang.String
  /**
       * Sets the new HTML markup in place of the currently selected within ASPxHtmlEditor content.
       * @param html A string value specifying the new HTML markup.
       * @param addToHistory true to add this operation to the history; otherwise, false.
       */
  def SetHtml(html: java.lang.String, addToHistory: scala.Boolean): scala.Unit
}

