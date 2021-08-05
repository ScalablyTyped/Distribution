package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListSnapshotsResponse. */
trait IListSnapshotsResponse extends StObject {
  
  /** ListSnapshotsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListSnapshotsResponse snapshots */
  var snapshots: js.UndefOr[js.Array[ISnapshot] | Null] = js.undefined
}
object IListSnapshotsResponse {
  
  inline def apply(): IListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListSnapshotsResponse]
  }
  
  extension [Self <: IListSnapshotsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSnapshots(value: js.Array[ISnapshot]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsNull: Self = StObject.set(x, "snapshots", null)
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: ISnapshot*): Self = StObject.set(x, "snapshots", js.Array(value :_*))
  }
}
