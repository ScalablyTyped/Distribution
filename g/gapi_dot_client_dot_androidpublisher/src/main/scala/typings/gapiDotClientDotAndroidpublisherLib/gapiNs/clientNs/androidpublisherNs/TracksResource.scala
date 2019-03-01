package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracksResource extends js.Object {
  /** Fetches the track configuration for the specified track type. Includes the APK version codes that are in this track. */
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Track]
  /** Lists all the track configurations for this edit. */
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditId): gapiDotClientLib.gapiNs.clientNs.Request[TracksListResponse]
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume. This method supports patch semantics.
    */
  def patch(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Track]
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume.
    */
  def update(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Track]
}

object TracksResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Track]
    ],
    list: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditId, 
      gapiDotClientLib.gapiNs.clientNs.Request[TracksListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Track]
    ],
    update: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Track]
    ]
  ): TracksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[TracksResource]
  }
}

