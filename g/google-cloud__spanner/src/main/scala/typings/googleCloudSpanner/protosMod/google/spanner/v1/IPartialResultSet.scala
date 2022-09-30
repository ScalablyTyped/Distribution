package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.IValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a PartialResultSet. */
trait IPartialResultSet extends StObject {
  
  /** PartialResultSet chunkedValue */
  var chunkedValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /** PartialResultSet metadata */
  var metadata: js.UndefOr[IResultSetMetadata | Null] = js.undefined
  
  /** PartialResultSet resumeToken */
  var resumeToken: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** PartialResultSet stats */
  var stats: js.UndefOr[IResultSetStats | Null] = js.undefined
  
  /** PartialResultSet values */
  var values: js.UndefOr[js.Array[IValue] | Null] = js.undefined
}
object IPartialResultSet {
  
  inline def apply(): IPartialResultSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPartialResultSet]
  }
  
  extension [Self <: IPartialResultSet](x: Self) {
    
    inline def setChunkedValue(value: Boolean): Self = StObject.set(x, "chunkedValue", value.asInstanceOf[js.Any])
    
    inline def setChunkedValueNull: Self = StObject.set(x, "chunkedValue", null)
    
    inline def setChunkedValueUndefined: Self = StObject.set(x, "chunkedValue", js.undefined)
    
    inline def setMetadata(value: IResultSetMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setResumeToken(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenNull: Self = StObject.set(x, "resumeToken", null)
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setStats(value: IResultSetStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsNull: Self = StObject.set(x, "stats", null)
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setValues(value: js.Array[IValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: IValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
