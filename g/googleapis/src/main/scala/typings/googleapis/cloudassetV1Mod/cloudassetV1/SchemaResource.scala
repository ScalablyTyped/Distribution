package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of a cloud resource.
  */
@js.native
trait SchemaResource extends js.Object {
  
  /**
    * The content of the resource, in which some sensitive fields are scrubbed
    * away and may not be present.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The URL of the discovery document containing the resource&#39;s JSON
    * schema. For example:
    * `&quot;https://www.googleapis.com/discovery/v1/apis/compute/v1/rest&quot;`.
    * It will be left unspecified for resources without a discovery-based API,
    * such as Cloud Bigtable.
    */
  var discoveryDocumentUri: js.UndefOr[String] = js.native
  
  /**
    * The JSON schema name listed in the discovery document. Example:
    * &quot;Project&quot;. It will be left unspecified for resources (such as
    * Cloud Bigtable) without a discovery-based API.
    */
  var discoveryName: js.UndefOr[String] = js.native
  
  /**
    * The full name of the immediate parent of this resource. See [Resource
    * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
    * for more information.  For GCP assets, it is the parent resource defined
    * in the [Cloud IAM policy
    * hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy).
    * For example:
    * `&quot;//cloudresourcemanager.googleapis.com/projects/my_project_123&quot;`.
    * For third-party assets, it is up to the users to define.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The REST URL for accessing the resource. An HTTP GET operation using this
    * URL returns the resource itself. Example:
    * `https://cloudresourcemanager.googleapis.com/v1/projects/my-project-123`.
    * It will be left unspecified for resources without a REST API.
    */
  var resourceUrl: js.UndefOr[String] = js.native
  
  /**
    * The API version. Example: &quot;v1&quot;.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaResource {
  
  @scala.inline
  def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  
  @scala.inline
  implicit class SchemaResourceOps[Self <: SchemaResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDiscoveryDocumentUri(value: String): Self = this.set("discoveryDocumentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscoveryDocumentUri: Self = this.set("discoveryDocumentUri", js.undefined)
    
    @scala.inline
    def setDiscoveryName(value: String): Self = this.set("discoveryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscoveryName: Self = this.set("discoveryName", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = this.set("resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUrl: Self = this.set("resourceUrl", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
