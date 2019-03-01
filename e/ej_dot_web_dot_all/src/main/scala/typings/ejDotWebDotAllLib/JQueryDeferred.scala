package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryDeferred[T] extends js.Object {
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
}

object JQueryDeferred {
  @scala.inline
  def apply[T](cancel: js.UndefOr[scala.Boolean] = js.undefined): JQueryDeferred[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    __obj.asInstanceOf[JQueryDeferred[T]]
  }
}

