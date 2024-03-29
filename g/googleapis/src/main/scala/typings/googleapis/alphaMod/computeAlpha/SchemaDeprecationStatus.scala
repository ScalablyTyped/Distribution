package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeprecationStatus extends StObject {
  
  /**
    * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
    */
  var deleted: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
    */
  var deprecated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
    */
  var obsolete: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
    */
  var replacement: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rollout policy for this deprecation. This policy is only enforced by image family views. The rollout policy restricts the zones where the associated resource is considered in a deprecated state. When the rollout policy does not include the user specified zone, or if the zone is rolled out, the associated resource is considered in a deprecated state. The rollout policy for this deprecation is read-only, except for allowlisted users. This field might not be configured. To view the latest non-deprecated image in a specific zone, use the imageFamilyViews.get method.
    */
  var stateOverride: js.UndefOr[SchemaRolloutPolicy] = js.undefined
}
object SchemaDeprecationStatus {
  
  inline def apply(): SchemaDeprecationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeprecationStatus]
  }
  
  extension [Self <: SchemaDeprecationStatus](x: Self) {
    
    inline def setDeleted(value: String): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedNull: Self = StObject.set(x, "deprecated", null)
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setObsolete(value: String): Self = StObject.set(x, "obsolete", value.asInstanceOf[js.Any])
    
    inline def setObsoleteNull: Self = StObject.set(x, "obsolete", null)
    
    inline def setObsoleteUndefined: Self = StObject.set(x, "obsolete", js.undefined)
    
    inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setReplacementNull: Self = StObject.set(x, "replacement", null)
    
    inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateOverride(value: SchemaRolloutPolicy): Self = StObject.set(x, "stateOverride", value.asInstanceOf[js.Any])
    
    inline def setStateOverrideUndefined: Self = StObject.set(x, "stateOverride", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
