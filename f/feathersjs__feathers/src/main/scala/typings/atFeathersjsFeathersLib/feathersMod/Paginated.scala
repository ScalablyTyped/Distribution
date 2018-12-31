package typings
package atFeathersjsFeathersLib.feathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paginated[T] extends js.Object {
  var data: js.Array[T]
  var limit: scala.Double
  var skip: scala.Double
  var total: scala.Double
}

