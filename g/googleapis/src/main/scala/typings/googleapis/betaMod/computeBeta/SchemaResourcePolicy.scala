package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourcePolicy extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource policy for instances for placement configuration.
    */
  var groupPlacementPolicy: js.UndefOr[SchemaResourcePolicyGroupPlacementPolicy] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource policy for scheduling instance operations.
    */
  var instanceSchedulePolicy: js.UndefOr[SchemaResourcePolicyInstanceSchedulePolicy] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#resource_policies for resource policies.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The system status of the resource policy.
    */
  var resourceStatus: js.UndefOr[SchemaResourcePolicyResourceStatus] = js.undefined
  
  /**
    * [Output Only] Server-defined fully-qualified URL for this resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource policy for persistent disks for creating snapshots.
    */
  var snapshotSchedulePolicy: js.UndefOr[SchemaResourcePolicySnapshotSchedulePolicy] = js.undefined
  
  /**
    * [Output Only] The status of resource policy creation.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourcePolicy {
  
  inline def apply(): SchemaResourcePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicy]
  }
  
  extension [Self <: SchemaResourcePolicy](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGroupPlacementPolicy(value: SchemaResourcePolicyGroupPlacementPolicy): Self = StObject.set(x, "groupPlacementPolicy", value.asInstanceOf[js.Any])
    
    inline def setGroupPlacementPolicyUndefined: Self = StObject.set(x, "groupPlacementPolicy", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstanceSchedulePolicy(value: SchemaResourcePolicyInstanceSchedulePolicy): Self = StObject.set(x, "instanceSchedulePolicy", value.asInstanceOf[js.Any])
    
    inline def setInstanceSchedulePolicyUndefined: Self = StObject.set(x, "instanceSchedulePolicy", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setResourceStatus(value: SchemaResourcePolicyResourceStatus): Self = StObject.set(x, "resourceStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceStatusUndefined: Self = StObject.set(x, "resourceStatus", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSnapshotSchedulePolicy(value: SchemaResourcePolicySnapshotSchedulePolicy): Self = StObject.set(x, "snapshotSchedulePolicy", value.asInstanceOf[js.Any])
    
    inline def setSnapshotSchedulePolicyUndefined: Self = StObject.set(x, "snapshotSchedulePolicy", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
