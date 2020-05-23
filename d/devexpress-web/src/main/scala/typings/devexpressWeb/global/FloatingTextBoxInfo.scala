package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains floating text boxes settings.
  */
@JSGlobal("FloatingTextBoxInfo")
@js.native
class FloatingTextBoxInfo ()
  extends typings.devexpressWeb.FloatingTextBoxInfo {
  /**
    * Gets the sub-document representing the floating text box's content.
    */
  /* CompleteClass */
  override val contentSubDocument: typings.devexpressWeb.SubDocument = js.native
  /**
    * Gets the parent sub-document what stores the current floating object.
    */
  /* CompleteClass */
  override val parentSubDocument: typings.devexpressWeb.SubDocument = js.native
  /**
    * Gets the position of the floating object's anchor in the parent sub-document.
    */
  /* CompleteClass */
  override val position: Double = js.native
}

