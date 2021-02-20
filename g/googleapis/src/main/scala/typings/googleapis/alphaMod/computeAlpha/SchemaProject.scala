package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Project resource. For an overview of projects, see  Cloud Platform
  * Resource Hierarchy. (== resource_for v1.projects ==) (== resource_for
  * beta.projects ==)
  */
@js.native
trait SchemaProject extends StObject {
  
  /**
    * Metadata key/value pairs available to all instances contained in this
    * project. See Custom metadata for more information.
    */
  var commonInstanceMetadata: js.UndefOr[SchemaMetadata] = js.native
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /**
    * This signifies the default network tier used for configuring resources of
    * the project and can only take the following values: PREMIUM, STANDARD.
    * Initially the default network tier is PREMIUM.
    */
  var defaultNetworkTier: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Default service account used by VMs running in this
    * project.
    */
  var defaultServiceAccount: js.UndefOr[String] = js.native
  
  /**
    * An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Restricted features enabled for use on this project.
    */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server. This is not the project ID, and is just a unique
    * ID used by Compute Engine to identify resources.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Type of the resource. Always compute#project for projects.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The project ID. For example: my-example-project. Use the project ID to
    * make requests to Compute Engine.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Quotas assigned to this project.
    */
  var quotas: js.UndefOr[js.Array[SchemaQuota]] = js.native
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * The naming prefix for daily usage reports and the Google Cloud Storage
    * bucket where they are stored.
    */
  var usageExportLocation: js.UndefOr[SchemaUsageExportLocation] = js.native
  
  /**
    * [Output Only] The role this project has in a shared VPC configuration.
    * Currently only HOST projects are differentiated.
    */
  var xpnProjectStatus: js.UndefOr[String] = js.native
}
object SchemaProject {
  
  @scala.inline
  def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  
  @scala.inline
  implicit class SchemaProjectMutableBuilder[Self <: SchemaProject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonInstanceMetadata(value: SchemaMetadata): Self = StObject.set(x, "commonInstanceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonInstanceMetadataUndefined: Self = StObject.set(x, "commonInstanceMetadata", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDefaultNetworkTier(value: String): Self = StObject.set(x, "defaultNetworkTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNetworkTierUndefined: Self = StObject.set(x, "defaultNetworkTier", js.undefined)
    
    @scala.inline
    def setDefaultServiceAccount(value: String): Self = StObject.set(x, "defaultServiceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultServiceAccountUndefined: Self = StObject.set(x, "defaultServiceAccount", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnabledFeatures(value: js.Array[String]): Self = StObject.set(x, "enabledFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledFeaturesUndefined: Self = StObject.set(x, "enabledFeatures", js.undefined)
    
    @scala.inline
    def setEnabledFeaturesVarargs(value: String*): Self = StObject.set(x, "enabledFeatures", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setQuotas(value: js.Array[SchemaQuota]): Self = StObject.set(x, "quotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotasUndefined: Self = StObject.set(x, "quotas", js.undefined)
    
    @scala.inline
    def setQuotasVarargs(value: SchemaQuota*): Self = StObject.set(x, "quotas", js.Array(value :_*))
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setUsageExportLocation(value: SchemaUsageExportLocation): Self = StObject.set(x, "usageExportLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageExportLocationUndefined: Self = StObject.set(x, "usageExportLocation", js.undefined)
    
    @scala.inline
    def setXpnProjectStatus(value: String): Self = StObject.set(x, "xpnProjectStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpnProjectStatusUndefined: Self = StObject.set(x, "xpnProjectStatus", js.undefined)
  }
}
