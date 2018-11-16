package typings
package genericDashPoolLib.genericDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Factory[T] extends js.Object {
  var validate: js.UndefOr[js.Function1[/* client */ T, stdLib.PromiseLike[scala.Boolean]]] = js.undefined
  def create(): stdLib.PromiseLike[T]
  def destroy(client: T): stdLib.PromiseLike[scala.Unit]
}

