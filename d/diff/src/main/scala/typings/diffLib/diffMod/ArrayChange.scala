package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayChange[T] extends js.Object {
  var added: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var removed: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.Array[T]
}

