package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

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
  def create(request: gapiDotClientDotMlLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
  /**
    * Deletes a model version.
    *
    * Each model can have multiple versions deployed and in use at any given
    * time. Use this method to remove a single version.
    *
    * Note: You cannot delete the version that is set as the default version
    * of the model unless it is the only remaining version.
    */
  def delete(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
  /**
    * Gets information about a model version.
    *
    * Models can have multiple versions. You can call
    * [projects.models.versions.list](/ml-engine/reference/rest/v1/projects.models.versions/list)
    * to get the same information that this method returns for all of the
    * versions of a model.
    */
  def get(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Version]
  /**
    * Gets basic information about all the versions of a model.
    *
    * If you expect that a model has a lot of versions, or if you need to handle
    * only a limited number of results at a time, you can request that the list
    * be retrieved in batches (called pages):
    */
  def list(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__ListVersionsResponse]
  /**
    * Updates the specified Version resource.
    *
    * Currently the only supported field to update is `description`.
    */
  def patch(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
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
  def setDefault(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Version]
}

object VersionsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotMlLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
    ],
    delete: js.Function1[
      gapiDotClientDotMlLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
    ],
    get: js.Function1[
      gapiDotClientDotMlLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Version]
    ],
    list: js.Function1[
      gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__ListVersionsResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
    ],
    setDefault: js.Function1[
      gapiDotClientDotMlLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleCloudMlV1__Version]
    ]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("setDefault")(setDefault)
    __obj.asInstanceOf[VersionsResource]
  }
}

