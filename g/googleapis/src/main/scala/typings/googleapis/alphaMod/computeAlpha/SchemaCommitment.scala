package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommitment extends StObject {
  
  /**
    * Specifies whether to enable automatic renewal for the commitment. The default value is false if not specified. The field can be updated until the day of the commitment expiration at 12:00am PST. If the field is set to true, the commitment will be automatically renewed for either one or three years according to the terms of the existing commitment.
    */
  var autoRenew: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Commitment end time in RFC3339 text format.
    */
  var endTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#commitment for commitments.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The license specification required as part of a license commitment.
    */
  var licenseResource: js.UndefOr[SchemaLicenseResourceCommitment] = js.undefined
  
  /**
    * List of source commitments to be merged into a new commitment.
    */
  var mergeSourceCommitments: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
    */
  var plan: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] URL of the region where this commitment may be used.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of reservations in this commitment.
    */
  var reservations: js.UndefOr[js.Array[SchemaReservation]] = js.undefined
  
  /**
    * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
    */
  var resources: js.UndefOr[js.Array[SchemaResourceCommitment]] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Source commitment to be splitted into a new commitment.
    */
  var splitSourceCommitment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Commitment start time in RFC3339 text format.
    */
  var startTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Status of the commitment with regards to eventual expiration (each commitment has an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] An optional, human-readable explanation of the status.
    */
  var statusMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of commitment, which affects the discount rate and the eligible resources. Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized machines.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaCommitment {
  
  inline def apply(): SchemaCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitment]
  }
  
  extension [Self <: SchemaCommitment](x: Self) {
    
    inline def setAutoRenew(value: Boolean): Self = StObject.set(x, "autoRenew", value.asInstanceOf[js.Any])
    
    inline def setAutoRenewNull: Self = StObject.set(x, "autoRenew", null)
    
    inline def setAutoRenewUndefined: Self = StObject.set(x, "autoRenew", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTimestamp(value: String): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEndTimestampNull: Self = StObject.set(x, "endTimestamp", null)
    
    inline def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLicenseResource(value: SchemaLicenseResourceCommitment): Self = StObject.set(x, "licenseResource", value.asInstanceOf[js.Any])
    
    inline def setLicenseResourceUndefined: Self = StObject.set(x, "licenseResource", js.undefined)
    
    inline def setMergeSourceCommitments(value: js.Array[String]): Self = StObject.set(x, "mergeSourceCommitments", value.asInstanceOf[js.Any])
    
    inline def setMergeSourceCommitmentsNull: Self = StObject.set(x, "mergeSourceCommitments", null)
    
    inline def setMergeSourceCommitmentsUndefined: Self = StObject.set(x, "mergeSourceCommitments", js.undefined)
    
    inline def setMergeSourceCommitmentsVarargs(value: String*): Self = StObject.set(x, "mergeSourceCommitments", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanNull: Self = StObject.set(x, "plan", null)
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setReservations(value: js.Array[SchemaReservation]): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    inline def setReservationsUndefined: Self = StObject.set(x, "reservations", js.undefined)
    
    inline def setReservationsVarargs(value: SchemaReservation*): Self = StObject.set(x, "reservations", js.Array(value*))
    
    inline def setResources(value: js.Array[SchemaResourceCommitment]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaResourceCommitment*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkWithIdNull: Self = StObject.set(x, "selfLinkWithId", null)
    
    inline def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    inline def setSplitSourceCommitment(value: String): Self = StObject.set(x, "splitSourceCommitment", value.asInstanceOf[js.Any])
    
    inline def setSplitSourceCommitmentNull: Self = StObject.set(x, "splitSourceCommitment", null)
    
    inline def setSplitSourceCommitmentUndefined: Self = StObject.set(x, "splitSourceCommitment", js.undefined)
    
    inline def setStartTimestamp(value: String): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampNull: Self = StObject.set(x, "startTimestamp", null)
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
