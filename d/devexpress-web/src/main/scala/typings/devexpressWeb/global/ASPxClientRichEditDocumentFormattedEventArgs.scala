package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.DocumentFormatted event.
  */
@JSGlobal("ASPxClientRichEditDocumentFormattedEventArgs")
@js.native
class ASPxClientRichEditDocumentFormattedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRichEditDocumentFormattedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditDocumentFormattedEventArgs object. For internal use only.
    * @param pageCount The number of pages in the document.
    */
  def this(pageCount: Double) = this()
  
  /**
    * Gets the number of pages in the document.
    */
  /* CompleteClass */
  var pageCount: Double = js.native
}
