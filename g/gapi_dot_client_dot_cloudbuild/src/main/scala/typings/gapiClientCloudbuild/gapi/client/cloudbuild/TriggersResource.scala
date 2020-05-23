package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudbuild.anon.Callback
import typings.gapiClientCloudbuild.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggersResource extends js.Object {
  /**
    * Creates a new BuildTrigger.
    *
    * This API is experimental.
    */
  def create(request: Callback): Request[BuildTrigger]
  /**
    * Deletes an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def delete(request: Key): Request[js.Object]
  /**
    * Gets information about a BuildTrigger.
    *
    * This API is experimental.
    */
  def get(request: Key): Request[BuildTrigger]
  /**
    * Lists existing BuildTrigger.
    *
    * This API is experimental.
    */
  def list(request: Callback): Request[ListBuildTriggersResponse]
  /**
    * Updates an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def patch(request: Key): Request[BuildTrigger]
}

object TriggersResource {
  @scala.inline
  def apply(
    create: Callback => Request[BuildTrigger],
    delete: Key => Request[js.Object],
    get: Key => Request[BuildTrigger],
    list: Callback => Request[ListBuildTriggersResponse],
    patch: Key => Request[BuildTrigger]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[TriggersResource]
  }
}

