package typings.googleapis.buildSrcApisCloudassetV1beta1Mod.cloudasset_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a cloud resource.
  */
@js.native
trait Schema$Resource extends js.Object {
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

object Schema$Resource {
  @scala.inline
  def apply(
    data: StringDictionary[js.Any] = null,
    discoveryDocumentUri: String = null,
    discoveryName: String = null,
    parent: String = null,
    resourceUrl: String = null,
    version: String = null
  ): Schema$Resource = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (discoveryDocumentUri != null) __obj.updateDynamic("discoveryDocumentUri")(discoveryDocumentUri.asInstanceOf[js.Any])
    if (discoveryName != null) __obj.updateDynamic("discoveryName")(discoveryName.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (resourceUrl != null) __obj.updateDynamic("resourceUrl")(resourceUrl.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Resource]
  }
}

