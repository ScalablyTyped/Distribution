package typings.elasticsearch.anon

import typings.elasticsearch.mod.IndicesUpdateAliasesParamsAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions extends js.Object {
  var actions: js.Array[IndicesUpdateAliasesParamsAction]
}

object Actions {
  @scala.inline
  def apply(actions: js.Array[IndicesUpdateAliasesParamsAction]): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
}

