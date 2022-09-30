package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import typings.googleCloudSpanner.protosMod.google.spanner.v1.CommitResponse.ICommitStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommitResponse. */
trait ICommitResponse extends StObject {
  
  /** CommitResponse commitStats */
  var commitStats: js.UndefOr[ICommitStats | Null] = js.undefined
  
  /** CommitResponse commitTimestamp */
  var commitTimestamp: js.UndefOr[ITimestamp | Null] = js.undefined
}
object ICommitResponse {
  
  inline def apply(): ICommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommitResponse]
  }
  
  extension [Self <: ICommitResponse](x: Self) {
    
    inline def setCommitStats(value: ICommitStats): Self = StObject.set(x, "commitStats", value.asInstanceOf[js.Any])
    
    inline def setCommitStatsNull: Self = StObject.set(x, "commitStats", null)
    
    inline def setCommitStatsUndefined: Self = StObject.set(x, "commitStats", js.undefined)
    
    inline def setCommitTimestamp(value: ITimestamp): Self = StObject.set(x, "commitTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCommitTimestampNull: Self = StObject.set(x, "commitTimestamp", null)
    
    inline def setCommitTimestampUndefined: Self = StObject.set(x, "commitTimestamp", js.undefined)
  }
}
