package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltEditId
import typings.gapiDotClientDotAndroidpublisher.Anon_AltEditIdFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracksResource extends js.Object {
  /** Fetches the track configuration for the specified track type. Includes the APK version codes that are in this track. */
  def get(request: Anon_AltEditIdFieldsKeyOauthtoken): Request[Track]
  /** Lists all the track configurations for this edit. */
  def list(request: Anon_AltEditId): Request[TracksListResponse]
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume. This method supports patch semantics.
    */
  def patch(request: Anon_AltEditIdFieldsKeyOauthtoken): Request[Track]
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume.
    */
  def update(request: Anon_AltEditIdFieldsKeyOauthtoken): Request[Track]
}

object TracksResource {
  @scala.inline
  def apply(
    get: Anon_AltEditIdFieldsKeyOauthtoken => Request[Track],
    list: Anon_AltEditId => Request[TracksListResponse],
    patch: Anon_AltEditIdFieldsKeyOauthtoken => Request[Track],
    update: Anon_AltEditIdFieldsKeyOauthtoken => Request[Track]
  ): TracksResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TracksResource]
  }
}

