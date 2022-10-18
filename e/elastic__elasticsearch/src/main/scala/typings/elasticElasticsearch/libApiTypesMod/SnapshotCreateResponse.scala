package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCreateResponse extends StObject {
  
  var accepted: js.UndefOr[Boolean] = js.undefined
  
  var snapshot: js.UndefOr[SnapshotSnapshotInfo] = js.undefined
}
object SnapshotCreateResponse {
  
  inline def apply(): SnapshotCreateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotCreateResponse]
  }
  
  extension [Self <: SnapshotCreateResponse](x: Self) {
    
    inline def setAccepted(value: Boolean): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    
    inline def setAcceptedUndefined: Self = StObject.set(x, "accepted", js.undefined)
    
    inline def setSnapshot(value: SnapshotSnapshotInfo): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}
