package typings
package elasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AliasIndex extends js.Object {
  var alias: java.lang.String
  var index: js.UndefOr[java.lang.String] = js.undefined
  var indices: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_AliasIndex {
  @scala.inline
  def apply(
    alias: java.lang.String,
    index: java.lang.String = null,
    indices: js.Array[java.lang.String] = null
  ): Anon_AliasIndex = {
    val __obj = js.Dynamic.literal(alias = alias)
    if (index != null) __obj.updateDynamic("index")(index)
    if (indices != null) __obj.updateDynamic("indices")(indices)
    __obj.asInstanceOf[Anon_AliasIndex]
  }
}

