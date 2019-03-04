package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alias extends js.Object {
  var alias: java.lang.String
  var filter: js.UndefOr[js.Object] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var indices: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Alias {
  @scala.inline
  def apply(
    alias: java.lang.String,
    filter: js.Object = null,
    index: java.lang.String = null,
    indices: js.Array[java.lang.String] = null,
    routing: java.lang.String = null
  ): Anon_Alias = {
    val __obj = js.Dynamic.literal(alias = alias)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (index != null) __obj.updateDynamic("index")(index)
    if (indices != null) __obj.updateDynamic("indices")(indices)
    if (routing != null) __obj.updateDynamic("routing")(routing)
    __obj.asInstanceOf[Anon_Alias]
  }
}

