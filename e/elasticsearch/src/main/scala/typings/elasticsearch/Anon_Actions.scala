package typings.elasticsearch

import typings.elasticsearch.elasticsearchMod.IndicesUpdateAliasesParamsAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var actions: js.Array[IndicesUpdateAliasesParamsAction]
}

object Anon_Actions {
  @scala.inline
  def apply(actions: js.Array[IndicesUpdateAliasesParamsAction]): Anon_Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Actions]
  }
}

