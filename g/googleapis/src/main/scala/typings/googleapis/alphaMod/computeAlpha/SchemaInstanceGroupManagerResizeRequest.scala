package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagerResizeRequest extends StObject {
  
  /**
    * The count of instances to create as part of this resize request.
    */
  var count: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * [Output Only] The creation timestamp for this resize request in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] A unique identifier for this resource type. The server generates this identifier.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The resource type, which is always compute#instanceGroupManagerResizeRequest for resize requests.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of this resize request. The name must be 1-63 characters long, and comply with RFC1035.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When set, defines queing parameters for the requested deferred capacity. When unset, the request starts provisioning immediately, or fails if immediate provisioning is not possible.
    */
  var queuingPolicy: js.UndefOr[SchemaQueuingPolicy] = js.undefined
  
  /**
    * [Output Only] The URL for this resize request. The server defines this URL.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] Current state of the request.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] Status of the request. The Status message is aligned with QueuedResource.status. ResizeRequest.queuing_policy contains the queuing policy as provided by the user; it could have either valid_until_time or valid_until_duration. ResizeRequest.status.queuing_policy always contains absolute time as calculated by the server when the request is queued.
    */
  var status: js.UndefOr[SchemaInstanceGroupManagerResizeRequestStatus] = js.undefined
  
  /**
    * [Output Only] The URL of a zone where the resize request is located.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceGroupManagerResizeRequest {
  
  inline def apply(): SchemaInstanceGroupManagerResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerResizeRequest]
  }
  
  extension [Self <: SchemaInstanceGroupManagerResizeRequest](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQueuingPolicy(value: SchemaQueuingPolicy): Self = StObject.set(x, "queuingPolicy", value.asInstanceOf[js.Any])
    
    inline def setQueuingPolicyUndefined: Self = StObject.set(x, "queuingPolicy", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkWithIdNull: Self = StObject.set(x, "selfLinkWithId", null)
    
    inline def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatus(value: SchemaInstanceGroupManagerResizeRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
