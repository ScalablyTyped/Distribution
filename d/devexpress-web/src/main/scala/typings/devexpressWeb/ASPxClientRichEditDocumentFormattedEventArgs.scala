package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.DocumentFormatted event.
  */
trait ASPxClientRichEditDocumentFormattedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the number of pages in the document.
    */
  var pageCount: Double
}

object ASPxClientRichEditDocumentFormattedEventArgs {
  @scala.inline
  def apply(pageCount: Double): ASPxClientRichEditDocumentFormattedEventArgs = {
    val __obj = js.Dynamic.literal(pageCount = pageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditDocumentFormattedEventArgs]
  }
}

