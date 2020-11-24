package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.ContentInserted event.
  */
@JSGlobal("ASPxClientRichEditContentInsertedEventArgs")
@js.native
class ASPxClientRichEditContentInsertedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientRichEditContentInsertedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditContentInsertedEventArgs object. For internal use only.
    * @param subDocumentId An identifier of a sub-document that contains the inserted content.
    * @param interval An interval object that relates to the inserted content.
    */
  def this(subDocumentId: Double, interval: typings.devexpressWeb.Interval) = this()
}
