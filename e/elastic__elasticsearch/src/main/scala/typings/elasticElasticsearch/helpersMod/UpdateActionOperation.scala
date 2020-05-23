package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateActionOperation extends js.Object {
  var update: Dictkey
}

object UpdateActionOperation {
  @scala.inline
  def apply(update: Dictkey): UpdateActionOperation = {
    val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateActionOperation]
  }
}

