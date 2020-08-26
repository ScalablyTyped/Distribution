package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterDeleteVotingConfigExclusions extends Generic {
  var wait_for_removal: js.UndefOr[Boolean] = js.native
}

object ClusterDeleteVotingConfigExclusions {
  @scala.inline
  def apply(): ClusterDeleteVotingConfigExclusions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterDeleteVotingConfigExclusions]
  }
  @scala.inline
  implicit class ClusterDeleteVotingConfigExclusionsOps[Self <: ClusterDeleteVotingConfigExclusions] (val x: Self) extends AnyVal {
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
    def setWait_for_removal(value: Boolean): Self = this.set("wait_for_removal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_removal: Self = this.set("wait_for_removal", js.undefined)
  }
  
}

