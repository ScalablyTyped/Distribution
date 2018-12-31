package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CharacterPropertiesChanged event.
  */
trait ASPxClientRichEditCharacterPropertiesChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the text buffer interval related to the changed characters.
    * Value: An object that stores the changed character length and position.
    */
  var interval: Interval
  /**
    * Gets the active sub-document's identifier.
    * Value: An integer value specifying the sub-document's identifier.
    */
  var subDocumentId: scala.Double
}

