package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAction extends _Action {
  var delete: Dictkey
}

object DeleteAction {
  @scala.inline
  def apply(delete: Dictkey): DeleteAction = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAction]
  }
}

