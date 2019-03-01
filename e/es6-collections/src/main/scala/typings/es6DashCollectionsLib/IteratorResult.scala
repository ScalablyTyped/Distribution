package typings
package es6DashCollectionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorResult[T] extends js.Object {
  var done: scala.Boolean
  var value: js.UndefOr[T] = js.undefined
}

object IteratorResult {
  @scala.inline
  def apply[T](done: scala.Boolean, value: T = null): IteratorResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorResult[T]]
  }
}

