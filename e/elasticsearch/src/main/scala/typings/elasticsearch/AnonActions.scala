package typings.elasticsearch

import typings.elasticsearch.mod.IndicesUpdateAliasesParamsAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActions extends js.Object {
  var actions: js.Array[IndicesUpdateAliasesParamsAction]
}

object AnonActions {
  @scala.inline
  def apply(actions: js.Array[IndicesUpdateAliasesParamsAction]): AnonActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActions]
  }
}

