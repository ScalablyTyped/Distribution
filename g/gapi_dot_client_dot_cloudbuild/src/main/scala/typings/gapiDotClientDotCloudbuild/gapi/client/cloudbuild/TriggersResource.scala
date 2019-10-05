package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCloudbuild.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotCloudbuild.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggersResource extends js.Object {
  /**
    * Creates a new BuildTrigger.
    *
    * This API is experimental.
    */
  def create(request: Anon_AccesstokenAltBearertokenCallback): Request[BuildTrigger]
  /**
    * Deletes an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def delete(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[js.Object]
  /**
    * Gets information about a BuildTrigger.
    *
    * This API is experimental.
    */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[BuildTrigger]
  /**
    * Lists existing BuildTrigger.
    *
    * This API is experimental.
    */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[ListBuildTriggersResponse]
  /**
    * Updates an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[BuildTrigger]
}

object TriggersResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertokenCallback => Request[BuildTrigger],
    delete: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[BuildTrigger],
    list: Anon_AccesstokenAltBearertokenCallback => Request[ListBuildTriggersResponse],
    patch: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[BuildTrigger]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[TriggersResource]
  }
}

