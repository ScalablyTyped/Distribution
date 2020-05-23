package typings.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryPromise[T] extends js.Object {
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
}

object JQueryPromise {
  @scala.inline
  def apply[T](cancel: js.UndefOr[Boolean] = js.undefined): JQueryPromise[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryPromise[T]]
  }
}

