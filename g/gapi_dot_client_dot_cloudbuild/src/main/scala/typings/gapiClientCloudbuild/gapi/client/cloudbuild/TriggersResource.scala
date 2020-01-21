package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudbuild.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientCloudbuild.AnonAccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggersResource extends js.Object {
  /**
    * Creates a new BuildTrigger.
    *
    * This API is experimental.
    */
  def create(request: AnonAccesstokenAltBearertokenCallback): Request_[BuildTrigger]
  /**
    * Deletes an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def delete(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[js.Object]
  /**
    * Gets information about a BuildTrigger.
    *
    * This API is experimental.
    */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[BuildTrigger]
  /**
    * Lists existing BuildTrigger.
    *
    * This API is experimental.
    */
  def list(request: AnonAccesstokenAltBearertokenCallback): Request_[ListBuildTriggersResponse]
  /**
    * Updates an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def patch(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[BuildTrigger]
}

object TriggersResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertokenCallback => Request_[BuildTrigger],
    delete: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[BuildTrigger],
    list: AnonAccesstokenAltBearertokenCallback => Request_[ListBuildTriggersResponse],
    patch: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[BuildTrigger]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[TriggersResource]
  }
}

