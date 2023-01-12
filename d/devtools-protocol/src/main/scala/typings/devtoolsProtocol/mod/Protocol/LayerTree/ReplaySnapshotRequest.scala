package typings.devtoolsProtocol.mod.Protocol.LayerTree

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaySnapshotRequest extends StObject {
  
  /**
    * The first step to replay from (replay from the very start if not specified).
    */
  var fromStep: js.UndefOr[integer] = js.undefined
  
  /**
    * The scale to apply while replaying (defaults to 1).
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * The id of the layer snapshot.
    */
  var snapshotId: SnapshotId
  
  /**
    * The last step to replay to (replay till the end if not specified).
    */
  var toStep: js.UndefOr[integer] = js.undefined
}
object ReplaySnapshotRequest {
  
  inline def apply(snapshotId: SnapshotId): ReplaySnapshotRequest = {
    val __obj = js.Dynamic.literal(snapshotId = snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaySnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaySnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setFromStep(value: integer): Self = StObject.set(x, "fromStep", value.asInstanceOf[js.Any])
    
    inline def setFromStepUndefined: Self = StObject.set(x, "fromStep", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setToStep(value: integer): Self = StObject.set(x, "toStep", value.asInstanceOf[js.Any])
    
    inline def setToStepUndefined: Self = StObject.set(x, "toStep", js.undefined)
  }
}
