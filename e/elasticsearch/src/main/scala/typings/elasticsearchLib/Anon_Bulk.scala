package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bulk extends js.Object {
  var bulk: scala.Double
  var search: scala.Double
}

object Anon_Bulk {
  @scala.inline
  def apply(bulk: scala.Double, search: scala.Double): Anon_Bulk = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bulk")(bulk)
    __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[Anon_Bulk]
  }
}

