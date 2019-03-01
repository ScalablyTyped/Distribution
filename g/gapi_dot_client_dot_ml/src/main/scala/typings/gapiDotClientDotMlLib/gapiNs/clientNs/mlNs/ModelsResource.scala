package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelsResource extends js.Object {
  var versions: VersionsResource
  /**
    * Creates a model which will later contain one or more versions.
    *
    * You must add at least one version before you can request predictions from
    * the model. Add versions by calling
    * [projects.models.versions.create](/ml-engine/reference/rest/v1/projects.models.versions/create).
    */
  def create(request: gapiDotClientDotMlLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Model]
  /**
    * Deletes a model.
    *
    * You can only delete a model if there are no versions in it. You can delete
    * versions by calling
    * [projects.models.versions.delete](/ml-engine/reference/rest/v1/projects.models.versions/delete).
    */
  def delete(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
  /**
    * Gets information about a model, including its name, the description (if
    * set), and the default version (if at least one version of the model has
    * been deployed).
    */
  def get(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Model]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__Policy]
  /**
    * Lists the models in a project.
    *
    * Each project can contain multiple models, and each model can have multiple
    * versions.
    */
  def list(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__ListModelsResponse]
  /**
    * Updates a specific model resource.
    *
    * Currently the only supported fields to update are `description` and
    * `default_version.name`.
    */
  def patch(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__TestIamPermissionsResponse]
}

object ModelsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotMlLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Model]
    ],
    delete: js.Function1[
      gapiDotClientDotMlLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
    ],
    get: js.Function1[
      gapiDotClientDotMlLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Model]
    ],
    getIamPolicy: js.Function1[
      gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__Policy]
    ],
    list: js.Function1[
      gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__ListModelsResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
    ],
    setIamPolicy: js.Function1[
      gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__Policy]
    ],
    testIamPermissions: js.Function1[
      gapiDotClientDotMlLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleIamV1__TestIamPermissionsResponse]
    ],
    versions: VersionsResource
  ): ModelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getIamPolicy")(getIamPolicy)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("setIamPolicy")(setIamPolicy)
    __obj.updateDynamic("testIamPermissions")(testIamPermissions)
    __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[ModelsResource]
  }
}

