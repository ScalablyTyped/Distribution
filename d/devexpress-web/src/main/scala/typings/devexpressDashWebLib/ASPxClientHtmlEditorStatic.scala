package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientHtmlEditorStatic extends ASPxClientControlStatic {
  /**
       * Programmatically closes a custom dialog, supplying it with specific parameters.
       * @param status An object representing a custom dialog's closing status.
       * @param data An object representing custom data associated with a custom dialog.
       */
  def CustomDialogComplete(status: js.Object, data: js.Object): scala.Unit = js.native
  /**
       * Highlights the text.
       * @param text A string value specifying the text to be highlighted.
       * @param searchContainer An object specifying the container where the specified text should be searched.
       */
  def HighlightText(text: java.lang.String, searchContainer: js.Object): scala.Unit = js.native
  /**
       * Highlights the text with the specified settings.
       * @param text A string value specifying the text to be highlighted.
       * @param searchContainer An object specifying the container where the specified text should be searched.
       * @param className A string value specifying the text color.
       */
  def HighlightText(text: java.lang.String, searchContainer: js.Object, className: java.lang.String): scala.Unit = js.native
  /**
       * Highlights the text with the specified text color and background color.
       * @param text A string value specifying the text to be highlighted.
       * @param searchContainer An object specifying the container where the specified text should be searched.
       * @param color A string value specifying the text color.
       * @param backgroundColor A string value specifying the background color.
       */
  def HighlightText(
    text: java.lang.String,
    searchContainer: js.Object,
    color: java.lang.String,
    backgroundColor: java.lang.String
  ): scala.Unit = js.native
}

