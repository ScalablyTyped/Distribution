package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ParagraphPropertiesChanged event.
  */
trait ASPxClientRichEditParagraphPropertiesChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the changed paragraph's index.
    * Value: An integer value specifying the changed paragraph's identifier.
    */
  var paragraphIndex: scala.Double
  /**
    * Gets the active sub-document's identifier.
    * Value: An integer value specifying the sub-document's identifier
    */
  var subDocumentId: scala.Double
}

object ASPxClientRichEditParagraphPropertiesChangedEventArgs {
  @scala.inline
  def apply(paragraphIndex: scala.Double, subDocumentId: scala.Double): ASPxClientRichEditParagraphPropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("paragraphIndex")(paragraphIndex)
    __obj.updateDynamic("subDocumentId")(subDocumentId)
    __obj.asInstanceOf[ASPxClientRichEditParagraphPropertiesChangedEventArgs]
  }
}

