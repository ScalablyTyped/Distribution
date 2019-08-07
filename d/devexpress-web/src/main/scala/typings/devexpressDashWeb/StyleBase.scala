package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for objects implementing different element styles.
  */
@JSGlobal("StyleBase")
@js.native
class StyleBase () extends js.Object {
  /**
    * Gets whether the specified style is marked as deleted.
    */
  val isDeleted: Boolean = js.native
  /**
    * Gets or sets the name of the style.
    */
  val name: String = js.native
}

