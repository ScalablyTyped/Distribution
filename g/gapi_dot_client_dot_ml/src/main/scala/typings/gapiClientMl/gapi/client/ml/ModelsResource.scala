package typings.gapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMl.AnonAccesstoken
import typings.gapiClientMl.AnonAlt
import typings.gapiClientMl.AnonBearertoken
import typings.gapiClientMl.AnonFields
import typings.gapiClientMl.AnonKey
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
  def create(request: AnonAlt): Request_[GoogleCloudMlV1Model]
  /**
    * Deletes a model.
    *
    * You can only delete a model if there are no versions in it. You can delete
    * versions by calling
    * [projects.models.versions.delete](/ml-engine/reference/rest/v1/projects.models.versions/delete).
    */
  def delete(request: AnonAccesstoken): Request_[GoogleLongrunningOperation]
  /**
    * Gets information about a model, including its name, the description (if
    * set), and the default version (if at least one version of the model has
    * been deployed).
    */
  def get(request: AnonAccesstoken): Request_[GoogleCloudMlV1Model]
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonBearertoken): Request_[GoogleIamV1Policy]
  /**
    * Lists the models in a project.
    *
    * Each project can contain multiple models, and each model can have multiple
    * versions.
    */
  def list(request: AnonFields): Request_[GoogleCloudMlV1ListModelsResponse]
  /**
    * Updates a specific model resource.
    *
    * Currently the only supported fields to update are `description` and
    * `default_version.name`.
    */
  def patch(request: AnonKey): Request_[GoogleLongrunningOperation]
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonBearertoken): Request_[GoogleIamV1Policy]
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonBearertoken): Request_[GoogleIamV1TestIamPermissionsResponse]
}

object ModelsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[GoogleCloudMlV1Model],
    delete: AnonAccesstoken => Request_[GoogleLongrunningOperation],
    get: AnonAccesstoken => Request_[GoogleCloudMlV1Model],
    getIamPolicy: AnonBearertoken => Request_[GoogleIamV1Policy],
    list: AnonFields => Request_[GoogleCloudMlV1ListModelsResponse],
    patch: AnonKey => Request_[GoogleLongrunningOperation],
    setIamPolicy: AnonBearertoken => Request_[GoogleIamV1Policy],
    testIamPermissions: AnonBearertoken => Request_[GoogleIamV1TestIamPermissionsResponse],
    versions: VersionsResource
  ): ModelsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelsResource]
  }
}

