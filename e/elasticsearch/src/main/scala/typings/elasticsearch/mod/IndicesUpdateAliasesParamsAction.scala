package typings.elasticsearch.mod

import typings.elasticsearch.AnonAlias
import typings.elasticsearch.AnonAliasIndex
import typings.elasticsearch.AnonIndexString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesUpdateAliasesParamsAction extends js.Object {
  var add: js.UndefOr[AnonAlias] = js.undefined
  var remove: js.UndefOr[AnonAliasIndex] = js.undefined
  var remove_index: js.UndefOr[AnonIndexString] = js.undefined
}

object IndicesUpdateAliasesParamsAction {
  @scala.inline
  def apply(add: AnonAlias = null, remove: AnonAliasIndex = null, remove_index: AnonIndexString = null): IndicesUpdateAliasesParamsAction = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (remove_index != null) __obj.updateDynamic("remove_index")(remove_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesUpdateAliasesParamsAction]
  }
}

