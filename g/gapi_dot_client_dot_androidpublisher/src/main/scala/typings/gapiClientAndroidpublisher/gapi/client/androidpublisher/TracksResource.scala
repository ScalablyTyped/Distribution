package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAltEditId
import typings.gapiClientAndroidpublisher.AnonAltEditIdFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracksResource extends js.Object {
  /** Fetches the track configuration for the specified track type. Includes the APK version codes that are in this track. */
  def get(request: AnonAltEditIdFieldsKeyOauthtoken): Request_[Track]
  /** Lists all the track configurations for this edit. */
  def list(request: AnonAltEditId): Request_[TracksListResponse]
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume. This method supports patch semantics.
    */
  def patch(request: AnonAltEditIdFieldsKeyOauthtoken): Request_[Track]
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume.
    */
  def update(request: AnonAltEditIdFieldsKeyOauthtoken): Request_[Track]
}

object TracksResource {
  @scala.inline
  def apply(
    get: AnonAltEditIdFieldsKeyOauthtoken => Request_[Track],
    list: AnonAltEditId => Request_[TracksListResponse],
    patch: AnonAltEditIdFieldsKeyOauthtoken => Request_[Track],
    update: AnonAltEditIdFieldsKeyOauthtoken => Request_[Track]
  ): TracksResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TracksResource]
  }
}

