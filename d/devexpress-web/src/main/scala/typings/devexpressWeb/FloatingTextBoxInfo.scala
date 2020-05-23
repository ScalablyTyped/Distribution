package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains floating text boxes settings.
  */
trait FloatingTextBoxInfo extends FloatingObjectInfo {
  /**
    * Gets the sub-document representing the floating text box's content.
    */
  val contentSubDocument: SubDocument
}

object FloatingTextBoxInfo {
  @scala.inline
  def apply(contentSubDocument: SubDocument, parentSubDocument: SubDocument, position: Double): FloatingTextBoxInfo = {
    val __obj = js.Dynamic.literal(contentSubDocument = contentSubDocument.asInstanceOf[js.Any], parentSubDocument = parentSubDocument.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingTextBoxInfo]
  }
}

