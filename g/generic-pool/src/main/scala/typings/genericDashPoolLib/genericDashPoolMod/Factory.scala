package typings
package genericDashPoolLib.genericDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Factory[T] extends js.Object {
  var validate: js.UndefOr[js.Function1[/* client */ T, js.Thenable[scala.Boolean]]] = js.undefined
  def create(): js.Thenable[T]
  def destroy(client: T): js.Thenable[scala.Unit]
}

