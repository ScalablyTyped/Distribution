package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the table style settings.
  */
@JSGlobal("TableStyle")
@js.native
class TableStyle ()
  extends typings.devexpressWeb.TableStyle {
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
  /**
    * Gets or sets the style from which the current style inherits.
    */
  /* CompleteClass */
  override val parent: typings.devexpressWeb.TableStyle = js.native
}

