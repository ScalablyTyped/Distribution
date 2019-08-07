package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.ContentInserted event.
  */
@JSGlobal("ASPxClientRichEditContentInsertedEventArgs")
@js.native
class ASPxClientRichEditContentInsertedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditContentInsertedEventArgs object. For internal use only.
    * @param subDocumentId An identifier of a sub-document that contains the inserted content.
    * @param interval An interval object that relates to the inserted content.
    */
  def this(subDocumentId: Double, interval: Interval) = this()
  /**
    * Gets the text buffer interval related to the inserted content.
    */
  var interval: Interval = js.native
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double = js.native
}

