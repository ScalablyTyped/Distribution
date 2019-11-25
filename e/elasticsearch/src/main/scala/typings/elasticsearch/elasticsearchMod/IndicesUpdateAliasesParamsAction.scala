package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.Anon_Alias
import typings.elasticsearch.Anon_AliasIndex
import typings.elasticsearch.Anon_IndexString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesUpdateAliasesParamsAction extends js.Object {
  var add: js.UndefOr[Anon_Alias] = js.undefined
  var remove: js.UndefOr[Anon_AliasIndex] = js.undefined
  var remove_index: js.UndefOr[Anon_IndexString] = js.undefined
}

object IndicesUpdateAliasesParamsAction {
  @scala.inline
  def apply(add: Anon_Alias = null, remove: Anon_AliasIndex = null, remove_index: Anon_IndexString = null): IndicesUpdateAliasesParamsAction = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (remove_index != null) __obj.updateDynamic("remove_index")(remove_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesUpdateAliasesParamsAction]
  }
}

