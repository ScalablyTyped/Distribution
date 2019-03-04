package typings
package es6DashCollectionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForEachable[T] extends js.Object {
  def forEach(callbackfn: js.Function1[/* value */ T, scala.Unit]): scala.Unit
}

object ForEachable {
  @scala.inline
  def apply[T](forEach: js.Function1[js.Function1[/* value */ T, scala.Unit], scala.Unit]): ForEachable[T] = {
    val __obj = js.Dynamic.literal(forEach = forEach)
  
    __obj.asInstanceOf[ForEachable[T]]
  }
}

