package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnrichExecutePolicy extends Generic {
  var name: String = js.native
  var wait_for_completion: js.UndefOr[Boolean] = js.native
}

object EnrichExecutePolicy {
  @scala.inline
  def apply(name: String): EnrichExecutePolicy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichExecutePolicy]
  }
  @scala.inline
  implicit class EnrichExecutePolicyOps[Self <: EnrichExecutePolicy] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setWait_for_completion(value: Boolean): Self = this.set("wait_for_completion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_completion: Self = this.set("wait_for_completion", js.undefined)
  }
  
}

