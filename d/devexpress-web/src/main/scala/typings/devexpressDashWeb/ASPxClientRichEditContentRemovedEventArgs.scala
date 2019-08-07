package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.ContentRemoved event.
  */
@JSGlobal("ASPxClientRichEditContentRemovedEventArgs")
@js.native
class ASPxClientRichEditContentRemovedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditContentRemovedEventArgs object. For internal use only.
    * @param subDocumentId An identifier of a sub-document that contained the removed content.
    * @param interval An interval object that relates to the removed content.
    */
  def this(subDocumentId: Double, interval: Interval) = this()
  /**
    * Gets the text buffer interval related to the removed content.
    */
  var interval: Interval = js.native
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double = js.native
}

