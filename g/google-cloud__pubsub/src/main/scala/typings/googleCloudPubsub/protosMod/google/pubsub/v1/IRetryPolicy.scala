package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.IDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RetryPolicy. */
trait IRetryPolicy extends StObject {
  
  /** RetryPolicy maximumBackoff */
  var maximumBackoff: js.UndefOr[IDuration | Null] = js.undefined
  
  /** RetryPolicy minimumBackoff */
  var minimumBackoff: js.UndefOr[IDuration | Null] = js.undefined
}
object IRetryPolicy {
  
  inline def apply(): IRetryPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRetryPolicy]
  }
  
  extension [Self <: IRetryPolicy](x: Self) {
    
    inline def setMaximumBackoff(value: IDuration): Self = StObject.set(x, "maximumBackoff", value.asInstanceOf[js.Any])
    
    inline def setMaximumBackoffNull: Self = StObject.set(x, "maximumBackoff", null)
    
    inline def setMaximumBackoffUndefined: Self = StObject.set(x, "maximumBackoff", js.undefined)
    
    inline def setMinimumBackoff(value: IDuration): Self = StObject.set(x, "minimumBackoff", value.asInstanceOf[js.Any])
    
    inline def setMinimumBackoffNull: Self = StObject.set(x, "minimumBackoff", null)
    
    inline def setMinimumBackoffUndefined: Self = StObject.set(x, "minimumBackoff", js.undefined)
  }
}
