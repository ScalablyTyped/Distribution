package typings.gapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMl.anon.Accesstoken
import typings.gapiClientMl.anon.Alt
import typings.gapiClientMl.anon.Bearertoken
import typings.gapiClientMl.anon.Fields
import typings.gapiClientMl.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelsResource extends js.Object {
  var versions: VersionsResource = js.native
  /**
    * Creates a model which will later contain one or more versions.
    *
    * You must add at least one version before you can request predictions from
    * the model. Add versions by calling
    * [projects.models.versions.create](/ml-engine/reference/rest/v1/projects.models.versions/create).
    */
  def create(request: Alt): Request[GoogleCloudMlV1Model] = js.native
  /**
    * Deletes a model.
    *
    * You can only delete a model if there are no versions in it. You can delete
    * versions by calling
    * [projects.models.versions.delete](/ml-engine/reference/rest/v1/projects.models.versions/delete).
    */
  def delete(request: Accesstoken): Request[GoogleLongrunningOperation] = js.native
  /**
    * Gets information about a model, including its name, the description (if
    * set), and the default version (if at least one version of the model has
    * been deployed).
    */
  def get(request: Accesstoken): Request[GoogleCloudMlV1Model] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: Bearertoken): Request[GoogleIamV1Policy] = js.native
  /**
    * Lists the models in a project.
    *
    * Each project can contain multiple models, and each model can have multiple
    * versions.
    */
  def list(request: Fields): Request[GoogleCloudMlV1ListModelsResponse] = js.native
  /**
    * Updates a specific model resource.
    *
    * Currently the only supported fields to update are `description` and
    * `default_version.name`.
    */
  def patch(request: Key): Request[GoogleLongrunningOperation] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: Bearertoken): Request[GoogleIamV1Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: Bearertoken): Request[GoogleIamV1TestIamPermissionsResponse] = js.native
}

object ModelsResource {
  @scala.inline
  def apply(
    create: Alt => Request[GoogleCloudMlV1Model],
    delete: Accesstoken => Request[GoogleLongrunningOperation],
    get: Accesstoken => Request[GoogleCloudMlV1Model],
    getIamPolicy: Bearertoken => Request[GoogleIamV1Policy],
    list: Fields => Request[GoogleCloudMlV1ListModelsResponse],
    patch: Key => Request[GoogleLongrunningOperation],
    setIamPolicy: Bearertoken => Request[GoogleIamV1Policy],
    testIamPermissions: Bearertoken => Request[GoogleIamV1TestIamPermissionsResponse],
    versions: VersionsResource
  ): ModelsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelsResource]
  }
  @scala.inline
  implicit class ModelsResourceOps[Self <: ModelsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[GoogleCloudMlV1Model]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Accesstoken => Request[GoogleLongrunningOperation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[GoogleCloudMlV1Model]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIamPolicy(value: Bearertoken => Request[GoogleIamV1Policy]): Self = this.set("getIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[GoogleCloudMlV1ListModelsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Key => Request[GoogleLongrunningOperation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIamPolicy(value: Bearertoken => Request[GoogleIamV1Policy]): Self = this.set("setIamPolicy", js.Any.fromFunction1(value))
    @scala.inline
    def setTestIamPermissions(value: Bearertoken => Request[GoogleIamV1TestIamPermissionsResponse]): Self = this.set("testIamPermissions", js.Any.fromFunction1(value))
    @scala.inline
    def setVersions(value: VersionsResource): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
  
}

