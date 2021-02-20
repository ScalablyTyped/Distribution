package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.IDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RetryPolicy. */
@js.native
trait IRetryPolicy extends StObject {
  
  /** RetryPolicy maximumBackoff */
  var maximumBackoff: js.UndefOr[IDuration | Null] = js.native
  
  /** RetryPolicy minimumBackoff */
  var minimumBackoff: js.UndefOr[IDuration | Null] = js.native
}
object IRetryPolicy {
  
  @scala.inline
  def apply(): IRetryPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRetryPolicy]
  }
  
  @scala.inline
  implicit class IRetryPolicyMutableBuilder[Self <: IRetryPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumBackoff(value: IDuration): Self = StObject.set(x, "maximumBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumBackoffNull: Self = StObject.set(x, "maximumBackoff", null)
    
    @scala.inline
    def setMaximumBackoffUndefined: Self = StObject.set(x, "maximumBackoff", js.undefined)
    
    @scala.inline
    def setMinimumBackoff(value: IDuration): Self = StObject.set(x, "minimumBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumBackoffNull: Self = StObject.set(x, "minimumBackoff", null)
    
    @scala.inline
    def setMinimumBackoffUndefined: Self = StObject.set(x, "minimumBackoff", js.undefined)
  }
}
