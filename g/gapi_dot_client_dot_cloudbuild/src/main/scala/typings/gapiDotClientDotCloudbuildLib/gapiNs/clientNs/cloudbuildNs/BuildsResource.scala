package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BuildsResource extends js.Object {
  /** Cancels a requested build in progress. */
  def cancel(request: gapiDotClientDotCloudbuildLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Build]
  /**
               * Starts a build with the specified configuration.
               *
               * The long-running Operation returned by this method will include the ID of
               * the build, which can be passed to GetBuild to determine its status (e.g.,
               * success or failure).
               */
  def create(request: gapiDotClientDotCloudbuildLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
               * Returns information about a previously requested build.
               *
               * The Build that is returned includes its status (e.g., success or failure,
               * or in-progress), and timing information.
               */
  def get(request: gapiDotClientDotCloudbuildLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Build]
  /**
               * Lists previously requested builds.
               *
               * Previously requested builds may still be in-progress, or may have finished
               * successfully or unsuccessfully.
               */
  def list(request: gapiDotClientDotCloudbuildLib.Anon_AccesstokenPageSize): gapiDotClientLib.gapiNs.clientNs.Request[ListBuildsResponse]
}

