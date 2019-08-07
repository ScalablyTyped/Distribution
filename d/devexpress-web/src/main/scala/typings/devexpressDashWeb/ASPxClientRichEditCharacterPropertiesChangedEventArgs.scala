package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.CharacterPropertiesChanged event.
  */
@JSGlobal("ASPxClientRichEditCharacterPropertiesChangedEventArgs")
@js.native
class ASPxClientRichEditCharacterPropertiesChangedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditCharacterPropertiesChangedEventArgs object. For internal use only.
    * @param subDocumentId An identifier of a sub-document containing the changed characters.
    * @param interval An interval object that relates to the changed characters.
    */
  def this(subDocumentId: Double, interval: Interval) = this()
  /**
    * Gets the text buffer interval related to the changed characters.
    */
  var interval: Interval = js.native
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double = js.native
}

