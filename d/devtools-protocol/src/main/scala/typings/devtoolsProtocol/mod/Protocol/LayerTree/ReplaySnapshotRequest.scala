package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaySnapshotRequest extends js.Object {
  
  /**
    * The first step to replay from (replay from the very start if not specified).
    */
  var fromStep: js.UndefOr[integer] = js.native
  
  /**
    * The scale to apply while replaying (defaults to 1).
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * The id of the layer snapshot.
    */
  var snapshotId: SnapshotId = js.native
  
  /**
    * The last step to replay to (replay till the end if not specified).
    */
  var toStep: js.UndefOr[integer] = js.native
}
object ReplaySnapshotRequest {
  
  @scala.inline
  def apply(snapshotId: SnapshotId): ReplaySnapshotRequest = {
    val __obj = js.Dynamic.literal(snapshotId = snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaySnapshotRequest]
  }
  
  @scala.inline
  implicit class ReplaySnapshotRequestOps[Self <: ReplaySnapshotRequest] (val x: Self) extends AnyVal {
    
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
    def setSnapshotId(value: SnapshotId): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromStep(value: integer): Self = this.set("fromStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromStep: Self = this.set("fromStep", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setToStep(value: integer): Self = this.set("toStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToStep: Self = this.set("toStep", js.undefined)
  }
}
