package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAction extends _Action {
  var create: Dictkey = js.native
}

object CreateAction {
  @scala.inline
  def apply(create: Dictkey): CreateAction = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAction]
  }
  @scala.inline
  implicit class CreateActionOps[Self <: CreateAction] (val x: Self) extends AnyVal {
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
    def setCreate(value: Dictkey): Self = this.set("create", value.asInstanceOf[js.Any])
  }
  
}

