package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexAction extends _Action {
  var index: Dictkey = js.native
}

object IndexAction {
  @scala.inline
  def apply(index: Dictkey): IndexAction = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexAction]
  }
  @scala.inline
  implicit class IndexActionOps[Self <: IndexAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndex(value: Dictkey): Self = this.set("index", value.asInstanceOf[js.Any])
  }
  
}

