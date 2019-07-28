package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains floating text boxes settings.
  */
trait FloatingTextBoxInfo extends FloatingObjectInfo {
  /**
    * Gets the sub-document representing the floating text box's content.
    * Value: A <see cref="SubDocument" /> object representing the text box's content
    */
  var contentSubDocument: SubDocument
}

object FloatingTextBoxInfo {
  @scala.inline
  def apply(contentSubDocument: SubDocument, parentSubDocument: SubDocument, position: Double): FloatingTextBoxInfo = {
    val __obj = js.Dynamic.literal(contentSubDocument = contentSubDocument, parentSubDocument = parentSubDocument, position = position)
  
    __obj.asInstanceOf[FloatingTextBoxInfo]
  }
}

