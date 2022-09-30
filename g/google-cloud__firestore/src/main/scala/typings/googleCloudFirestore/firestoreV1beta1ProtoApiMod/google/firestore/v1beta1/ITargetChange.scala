package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.TargetChange.TargetChangeType
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.ITimestamp
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.rpc.IStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TargetChange. */
trait ITargetChange extends StObject {
  
  /** TargetChange cause */
  var cause: js.UndefOr[IStatus | Null] = js.undefined
  
  /** TargetChange readTime */
  var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** TargetChange resumeToken */
  var resumeToken: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** TargetChange targetChangeType */
  var targetChangeType: js.UndefOr[TargetChangeType | Null] = js.undefined
  
  /** TargetChange targetIds */
  var targetIds: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object ITargetChange {
  
  inline def apply(): ITargetChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITargetChange]
  }
  
  extension [Self <: ITargetChange](x: Self) {
    
    inline def setCause(value: IStatus): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseNull: Self = StObject.set(x, "cause", null)
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResumeToken(value: js.typedarray.Uint8Array): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenNull: Self = StObject.set(x, "resumeToken", null)
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setTargetChangeType(value: TargetChangeType): Self = StObject.set(x, "targetChangeType", value.asInstanceOf[js.Any])
    
    inline def setTargetChangeTypeNull: Self = StObject.set(x, "targetChangeType", null)
    
    inline def setTargetChangeTypeUndefined: Self = StObject.set(x, "targetChangeType", js.undefined)
    
    inline def setTargetIds(value: js.Array[Double]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    inline def setTargetIdsNull: Self = StObject.set(x, "targetIds", null)
    
    inline def setTargetIdsUndefined: Self = StObject.set(x, "targetIds", js.undefined)
    
    inline def setTargetIdsVarargs(value: Double*): Self = StObject.set(x, "targetIds", js.Array(value*))
  }
}
