package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base for objects implementing different element styles.
  */
trait StyleBase extends js.Object {
  /**
    * Gets whether the specified style is marked as deleted.
    */
  val isDeleted: Boolean
  /**
    * Gets or sets the name of the style.
    */
  val name: String
}

object StyleBase {
  @scala.inline
  def apply(isDeleted: Boolean, name: String): StyleBase = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleBase]
  }
}

