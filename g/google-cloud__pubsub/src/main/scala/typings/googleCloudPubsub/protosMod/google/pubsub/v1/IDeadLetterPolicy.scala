package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeadLetterPolicy. */
trait IDeadLetterPolicy extends StObject {
  
  /** DeadLetterPolicy deadLetterTopic */
  var deadLetterTopic: js.UndefOr[String | Null] = js.undefined
  
  /** DeadLetterPolicy maxDeliveryAttempts */
  var maxDeliveryAttempts: js.UndefOr[Double | Null] = js.undefined
}
object IDeadLetterPolicy {
  
  @scala.inline
  def apply(): IDeadLetterPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeadLetterPolicy]
  }
  
  @scala.inline
  implicit class IDeadLetterPolicyMutableBuilder[Self <: IDeadLetterPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadLetterTopic(value: String): Self = StObject.set(x, "deadLetterTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetterTopicNull: Self = StObject.set(x, "deadLetterTopic", null)
    
    @scala.inline
    def setDeadLetterTopicUndefined: Self = StObject.set(x, "deadLetterTopic", js.undefined)
    
    @scala.inline
    def setMaxDeliveryAttempts(value: Double): Self = StObject.set(x, "maxDeliveryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeliveryAttemptsNull: Self = StObject.set(x, "maxDeliveryAttempts", null)
    
    @scala.inline
    def setMaxDeliveryAttemptsUndefined: Self = StObject.set(x, "maxDeliveryAttempts", js.undefined)
  }
}
