package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesUpdateAliasesParamsAction extends js.Object {
  var add: js.UndefOr[elasticsearchLib.Anon_Alias] = js.undefined
  var remove: js.UndefOr[elasticsearchLib.Anon_AliasIndex] = js.undefined
  var remove_index: js.UndefOr[elasticsearchLib.Anon_IndexString] = js.undefined
}

object IndicesUpdateAliasesParamsAction {
  @scala.inline
  def apply(
    add: elasticsearchLib.Anon_Alias = null,
    remove: elasticsearchLib.Anon_AliasIndex = null,
    remove_index: elasticsearchLib.Anon_IndexString = null
  ): IndicesUpdateAliasesParamsAction = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (remove_index != null) __obj.updateDynamic("remove_index")(remove_index)
    __obj.asInstanceOf[IndicesUpdateAliasesParamsAction]
  }
}

