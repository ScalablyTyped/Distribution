package typings.gapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMl.AnonAccesstoken
import typings.gapiClientMl.AnonAlt
import typings.gapiClientMl.AnonFields
import typings.gapiClientMl.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionsResource extends js.Object {
  /**
    * Creates a new version of a model from a trained TensorFlow model.
    *
    * If the version created in the cloud by this call is the first deployed
    * version of the specified model, it will be made the default version of the
    * model. When you add a version to a model that already has one or more
    * versions, the default version does not automatically change. If you want a
    * new version to be the default, you must call
    * [projects.models.versions.setDefault](/ml-engine/reference/rest/v1/projects.models.versions/setDefault).
    */
  def create(request: AnonAlt): Request_[GoogleLongrunningOperation]
  /**
    * Deletes a model version.
    *
    * Each model can have multiple versions deployed and in use at any given
    * time. Use this method to remove a single version.
    *
    * Note: You cannot delete the version that is set as the default version
    * of the model unless it is the only remaining version.
    */
  def delete(request: AnonAccesstoken): Request_[GoogleLongrunningOperation]
  /**
    * Gets information about a model version.
    *
    * Models can have multiple versions. You can call
    * [projects.models.versions.list](/ml-engine/reference/rest/v1/projects.models.versions/list)
    * to get the same information that this method returns for all of the
    * versions of a model.
    */
  def get(request: AnonAccesstoken): Request_[GoogleCloudMlV1Version]
  /**
    * Gets basic information about all the versions of a model.
    *
    * If you expect that a model has a lot of versions, or if you need to handle
    * only a limited number of results at a time, you can request that the list
    * be retrieved in batches (called pages):
    */
  def list(request: AnonFields): Request_[GoogleCloudMlV1ListVersionsResponse]
  /**
    * Updates the specified Version resource.
    *
    * Currently the only supported field to update is `description`.
    */
  def patch(request: AnonKey): Request_[GoogleLongrunningOperation]
  /**
    * Designates a version to be the default for the model.
    *
    * The default version is used for prediction requests made against the model
    * that don't specify a version.
    *
    * The first version to be created for a model is automatically set as the
    * default. You must make any subsequent changes to the default version
    * setting manually using this method.
    */
  def setDefault(request: AnonAccesstoken): Request_[GoogleCloudMlV1Version]
}

object VersionsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[GoogleLongrunningOperation],
    delete: AnonAccesstoken => Request_[GoogleLongrunningOperation],
    get: AnonAccesstoken => Request_[GoogleCloudMlV1Version],
    list: AnonFields => Request_[GoogleCloudMlV1ListVersionsResponse],
    patch: AnonKey => Request_[GoogleLongrunningOperation],
    setDefault: AnonAccesstoken => Request_[GoogleCloudMlV1Version]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), setDefault = js.Any.fromFunction1(setDefault))
  
    __obj.asInstanceOf[VersionsResource]
  }
}

