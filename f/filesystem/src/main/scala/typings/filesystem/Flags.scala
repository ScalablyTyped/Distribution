package typings.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  /**
    * Used to indicate that the user wants to create a file or directory if it was not previously there.
    */
  var create: js.UndefOr[Boolean] = js.undefined
  /**
    * By itself, exclusive must have no effect. Used with create, it must cause getFile and getDirectory to fail if the target path already exists.
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
}

object Flags {
  @scala.inline
  def apply(create: js.UndefOr[Boolean] = js.undefined, exclusive: js.UndefOr[Boolean] = js.undefined): Flags = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
}

