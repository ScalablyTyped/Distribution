package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileSnapshotRequest extends StObject {
  
  /**
    * The clip rectangle to apply when replaying the snapshot.
    */
  var clipRect: js.UndefOr[Rect] = js.undefined
  
  /**
    * The minimum duration (in seconds) to replay the snapshot.
    */
  var minDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of times to replay the snapshot (1, if not specified).
    */
  var minRepeatCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The id of the layer snapshot.
    */
  var snapshotId: SnapshotId
}
object ProfileSnapshotRequest {
  
  @scala.inline
  def apply(snapshotId: SnapshotId): ProfileSnapshotRequest = {
    val __obj = js.Dynamic.literal(snapshotId = snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileSnapshotRequest]
  }
  
  @scala.inline
  implicit class ProfileSnapshotRequestMutableBuilder[Self <: ProfileSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipRect(value: Rect): Self = StObject.set(x, "clipRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipRectUndefined: Self = StObject.set(x, "clipRect", js.undefined)
    
    @scala.inline
    def setMinDuration(value: Double): Self = StObject.set(x, "minDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDurationUndefined: Self = StObject.set(x, "minDuration", js.undefined)
    
    @scala.inline
    def setMinRepeatCount(value: integer): Self = StObject.set(x, "minRepeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRepeatCountUndefined: Self = StObject.set(x, "minRepeatCount", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
  }
}
