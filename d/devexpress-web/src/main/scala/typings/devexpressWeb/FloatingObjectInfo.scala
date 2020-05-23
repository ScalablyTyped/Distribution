package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains floating objects base settings.
  */
trait FloatingObjectInfo extends js.Object {
  /**
    * Gets the parent sub-document what stores the current floating object.
    */
  val parentSubDocument: SubDocument
  /**
    * Gets the position of the floating object's anchor in the parent sub-document.
    */
  val position: Double
}

object FloatingObjectInfo {
  @scala.inline
  def apply(parentSubDocument: SubDocument, position: Double): FloatingObjectInfo = {
    val __obj = js.Dynamic.literal(parentSubDocument = parentSubDocument.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectInfo]
  }
}

