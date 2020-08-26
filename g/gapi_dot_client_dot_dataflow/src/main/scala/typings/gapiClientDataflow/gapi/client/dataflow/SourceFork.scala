package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceFork extends js.Object {
  /** DEPRECATED */
  var primary: js.UndefOr[SourceSplitShard] = js.native
  /** DEPRECATED */
  var primarySource: js.UndefOr[DerivedSource] = js.native
  /** DEPRECATED */
  var residual: js.UndefOr[SourceSplitShard] = js.native
  /** DEPRECATED */
  var residualSource: js.UndefOr[DerivedSource] = js.native
}

object SourceFork {
  @scala.inline
  def apply(): SourceFork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceFork]
  }
  @scala.inline
  implicit class SourceForkOps[Self <: SourceFork] (val x: Self) extends AnyVal {
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
    def setPrimary(value: SourceSplitShard): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setPrimarySource(value: DerivedSource): Self = this.set("primarySource", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimarySource: Self = this.set("primarySource", js.undefined)
    @scala.inline
    def setResidual(value: SourceSplitShard): Self = this.set("residual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResidual: Self = this.set("residual", js.undefined)
    @scala.inline
    def setResidualSource(value: DerivedSource): Self = this.set("residualSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResidualSource: Self = this.set("residualSource", js.undefined)
  }
  
}

