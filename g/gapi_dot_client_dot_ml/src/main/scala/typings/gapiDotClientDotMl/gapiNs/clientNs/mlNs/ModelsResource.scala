package typings.gapiDotClientDotMl.gapiNs.clientNs.mlNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotMl.Anon_Accesstoken
import typings.gapiDotClientDotMl.Anon_AccesstokenAlt
import typings.gapiDotClientDotMl.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotMl.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotMl.Anon_AccesstokenAltBearertokenCallbackFieldsKey
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
  def create(request: Anon_AccesstokenAlt): Request[GoogleCloudMlV1__Model]
  /**
    * Deletes a model.
    *
    * You can only delete a model if there are no versions in it. You can delete
    * versions by calling
    * [projects.models.versions.delete](/ml-engine/reference/rest/v1/projects.models.versions/delete).
    */
  def delete(request: Anon_Accesstoken): Request[GoogleLongrunning__Operation]
  /**
    * Gets information about a model, including its name, the description (if
    * set), and the default version (if at least one version of the model has
    * been deployed).
    */
  def get(request: Anon_Accesstoken): Request[GoogleCloudMlV1__Model]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Anon_AccesstokenAltBearertoken): Request[GoogleIamV1__Policy]
  /**
    * Lists the models in a project.
    *
    * Each project can contain multiple models, and each model can have multiple
    * versions.
    */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[GoogleCloudMlV1__ListModelsResponse]
  /**
    * Updates a specific model resource.
    *
    * Currently the only supported fields to update are `description` and
    * `default_version.name`.
    */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[GoogleLongrunning__Operation]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Anon_AccesstokenAltBearertoken): Request[GoogleIamV1__Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Anon_AccesstokenAltBearertoken): Request[GoogleIamV1__TestIamPermissionsResponse]
}

object ModelsResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAlt => Request[GoogleCloudMlV1__Model],
    delete: Anon_Accesstoken => Request[GoogleLongrunning__Operation],
    get: Anon_Accesstoken => Request[GoogleCloudMlV1__Model],
    getIamPolicy: Anon_AccesstokenAltBearertoken => Request[GoogleIamV1__Policy],
    list: Anon_AccesstokenAltBearertokenCallbackFields => Request[GoogleCloudMlV1__ListModelsResponse],
    patch: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[GoogleLongrunning__Operation],
    setIamPolicy: Anon_AccesstokenAltBearertoken => Request[GoogleIamV1__Policy],
    testIamPermissions: Anon_AccesstokenAltBearertoken => Request[GoogleIamV1__TestIamPermissionsResponse],
    versions: VersionsResource
  ): ModelsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), versions = versions)
  
    __obj.asInstanceOf[ModelsResource]
  }
}

