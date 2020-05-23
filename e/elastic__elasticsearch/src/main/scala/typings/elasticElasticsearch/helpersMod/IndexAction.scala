package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexAction extends _Action {
  var index: Dictkey
}

object IndexAction {
  @scala.inline
  def apply(index: Dictkey): IndexAction = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexAction]
  }
}

