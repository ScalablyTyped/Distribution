package typings.elasticsearch.mod

import typings.elasticsearch.anon.Alias
import typings.elasticsearch.anon.IndexString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesUpdateAliasesParamsAction extends js.Object {
  var add: js.UndefOr[Alias] = js.undefined
  var remove: js.UndefOr[typings.elasticsearch.anon.Indices] = js.undefined
  var remove_index: js.UndefOr[IndexString] = js.undefined
}

object IndicesUpdateAliasesParamsAction {
  @scala.inline
  def apply(
    add: Alias = null,
    remove: typings.elasticsearch.anon.Indices = null,
    remove_index: IndexString = null
  ): IndicesUpdateAliasesParamsAction = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (remove_index != null) __obj.updateDynamic("remove_index")(remove_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesUpdateAliasesParamsAction]
  }
}

