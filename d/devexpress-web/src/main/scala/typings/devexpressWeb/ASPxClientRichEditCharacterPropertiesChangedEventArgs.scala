package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.CharacterPropertiesChanged event.
  */
trait ASPxClientRichEditCharacterPropertiesChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the text buffer interval related to the changed characters.
    */
  var interval: Interval
  /**
    * Gets the active sub-document's identifier.
    */
  var subDocumentId: Double
}

object ASPxClientRichEditCharacterPropertiesChangedEventArgs {
  @scala.inline
  def apply(interval: Interval, subDocumentId: Double): ASPxClientRichEditCharacterPropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], subDocumentId = subDocumentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditCharacterPropertiesChangedEventArgs]
  }
}

