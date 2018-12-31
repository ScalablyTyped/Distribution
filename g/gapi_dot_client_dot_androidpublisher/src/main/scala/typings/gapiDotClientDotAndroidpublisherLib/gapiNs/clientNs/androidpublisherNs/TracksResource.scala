package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracksResource extends js.Object {
  /** Fetches the track configuration for the specified track type. Includes the APK version codes that are in this track. */
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_PrettyPrintTrack): gapiDotClientLib.gapiNs.clientNs.Request[Track]
  /** Lists all the track configurations for this edit. */
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_PrettyPrintPackageNameQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[TracksListResponse]
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume. This method supports patch semantics.
    */
  def patch(request: gapiDotClientDotAndroidpublisherLib.Anon_PrettyPrintTrack): gapiDotClientLib.gapiNs.clientNs.Request[Track]
  /**
    * Updates the track configuration for the specified track type. When halted, the rollout track cannot be updated without adding new APKs, and adding new
    * APKs will cause it to resume.
    */
  def update(request: gapiDotClientDotAndroidpublisherLib.Anon_PrettyPrintTrack): gapiDotClientLib.gapiNs.clientNs.Request[Track]
}

