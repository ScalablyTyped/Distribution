package typings.fhirKitClient.anon

import typings.fhir.fhir.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodySubscription extends StObject {
  
  var body: Subscription
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Subscription
}
object BodySubscription {
  
  @scala.inline
  def apply(body: Subscription): BodySubscription = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "Subscription")
    __obj.asInstanceOf[BodySubscription]
  }
  
  @scala.inline
  implicit class BodySubscriptionMutableBuilder[Self <: BodySubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Subscription): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Subscription): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
