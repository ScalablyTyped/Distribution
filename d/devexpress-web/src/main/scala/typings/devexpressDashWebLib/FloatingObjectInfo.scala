package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains floating objects base settings.
  */
trait FloatingObjectInfo extends js.Object {
  /**
    * Gets the parent sub-document what stores the current floating object.
    * Value: A <see cref="SubDocument" /> object representing the parent sub-document.
    */
  var parentSubDocument: SubDocument
  /**
    * Gets the position of the floating object's anchor in the parent sub-document.
    * Value: An integer value specifying the anchor's position.
    */
  var position: scala.Double
}

object FloatingObjectInfo {
  @scala.inline
  def apply(parentSubDocument: SubDocument, position: scala.Double): FloatingObjectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parentSubDocument")(parentSubDocument)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[FloatingObjectInfo]
  }
}

