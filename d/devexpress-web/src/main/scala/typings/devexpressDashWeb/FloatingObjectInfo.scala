package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains floating objects base settings.
  */
@JSGlobal("FloatingObjectInfo")
@js.native
class FloatingObjectInfo () extends js.Object {
  /**
    * Gets the parent sub-document what stores the current floating object.
    */
  val parentSubDocument: SubDocument = js.native
  /**
    * Gets the position of the floating object's anchor in the parent sub-document.
    */
  val position: Double = js.native
}

