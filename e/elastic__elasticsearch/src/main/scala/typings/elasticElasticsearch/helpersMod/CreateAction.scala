package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAction extends _Action {
  var create: Dictkey
}

object CreateAction {
  @scala.inline
  def apply(create: Dictkey): CreateAction = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAction]
  }
}

