package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for objects implementing different element styles.
  */
@JSGlobal("StyleBase")
@js.native
class StyleBase ()
  extends typings.devexpressWeb.StyleBase {
  /**
    * Gets whether the specified style is marked as deleted.
    */
  /* CompleteClass */
  override val isDeleted: Boolean = js.native
  /**
    * Gets or sets the name of the style.
    */
  /* CompleteClass */
  override val name: String = js.native
}

