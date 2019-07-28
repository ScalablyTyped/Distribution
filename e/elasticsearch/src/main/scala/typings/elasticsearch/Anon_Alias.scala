package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alias extends js.Object {
  var alias: String
  var filter: js.UndefOr[js.Object] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var indices: js.UndefOr[js.Array[String]] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
}

object Anon_Alias {
  @scala.inline
  def apply(
    alias: String,
    filter: js.Object = null,
    index: String = null,
    indices: js.Array[String] = null,
    routing: String = null
  ): Anon_Alias = {
    val __obj = js.Dynamic.literal(alias = alias)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (index != null) __obj.updateDynamic("index")(index)
    if (indices != null) __obj.updateDynamic("indices")(indices)
    if (routing != null) __obj.updateDynamic("routing")(routing)
    __obj.asInstanceOf[Anon_Alias]
  }
}

