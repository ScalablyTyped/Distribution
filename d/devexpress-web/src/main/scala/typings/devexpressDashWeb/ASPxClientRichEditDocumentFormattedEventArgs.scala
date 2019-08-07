package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.DocumentFormatted event.
  */
@JSGlobal("ASPxClientRichEditDocumentFormattedEventArgs")
@js.native
class ASPxClientRichEditDocumentFormattedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditDocumentFormattedEventArgs object. For internal use only.
    * @param pageCount The number of pages in the document.
    */
  def this(pageCount: Double) = this()
  /**
    * Gets the number of pages in the document.
    */
  var pageCount: Double = js.native
}

