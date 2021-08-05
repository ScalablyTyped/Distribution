package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Commitment resource. Creating a Commitment resource means that
  * you are purchasing a committed use contract with an explicit start and end
  * time. You can create commitments based on vCPUs and memory usage and
  * receive discounted rates. For full details, read Signing Up for Committed
  * Use Discounts.  Committed use discounts are subject to Google Cloud
  * Platform&#39;s Service Specific Terms. By purchasing a committed use
  * discount, you agree to these terms. Committed use discounts will not renew,
  * so you must purchase a new commitment to continue receiving discounts. (==
  * resource_for beta.commitments ==) (== resource_for v1.commitments ==)
  */
trait SchemaCommitment extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Commitment end time in RFC3339 text format.
    */
  var endTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#commitment for
    * commitments.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The plan for this commitment, which determines duration and discount
    * rate. The currently supported plans are TWELVE_MONTH (1 year), and
    * THIRTY_SIX_MONTH (3 years).
    */
  var plan: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] URL of the region where this commitment may be used.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * List of reservations for this commitment.
    */
  var reservations: js.UndefOr[js.Array[SchemaReservation]] = js.undefined
  
  /**
    * A list of commitment amounts for particular resources. Note that VCPU and
    * MEMORY resource commitments must occur together.
    */
  var resources: js.UndefOr[js.Array[SchemaResourceCommitment]] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Commitment start time in RFC3339 text format.
    */
  var startTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Status of the commitment with regards to eventual
    * expiration (each commitment has an end date defined). One of the
    * following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] An optional, human-readable explanation of the status.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The type of commitment, which affects the discount rate and the eligible
    * resources. Type MEMORY_OPTIMIZED specifies a commitment that will only
    * apply to memory optimized machines.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaCommitment {
  
  inline def apply(): SchemaCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitment]
  }
  
  extension [Self <: SchemaCommitment](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTimestamp(value: String): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setReservations(value: js.Array[SchemaReservation]): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    inline def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    
    inline def setReservationsVarargs(value: SchemaReservation*): Self = StObject.set(x, "reservations", js.Array(value :_*))
    
    inline def setResources(value: js.Array[SchemaResourceCommitment]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaResourceCommitment*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    inline def setStartTimestamp(value: String): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
