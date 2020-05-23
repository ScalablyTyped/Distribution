package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudbuild.anon.Bearertoken
import typings.gapiClientCloudbuild.anon.Callback
import typings.gapiClientCloudbuild.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildsResource extends js.Object {
  /** Cancels a requested build in progress. */
  def cancel(request: Bearertoken): Request[Build]
  /**
    * Starts a build with the specified configuration.
    *
    * The long-running Operation returned by this method will include the ID of
    * the build, which can be passed to GetBuild to determine its status (e.g.,
    * success or failure).
    */
  def create(request: Callback): Request[Operation]
  /**
    * Returns information about a previously requested build.
    *
    * The Build that is returned includes its status (e.g., success or failure,
    * or in-progress), and timing information.
    */
  def get(request: Bearertoken): Request[Build]
  /**
    * Lists previously requested builds.
    *
    * Previously requested builds may still be in-progress, or may have finished
    * successfully or unsuccessfully.
    */
  def list(request: Fields): Request[ListBuildsResponse]
}

object BuildsResource {
  @scala.inline
  def apply(
    cancel: Bearertoken => Request[Build],
    create: Callback => Request[Operation],
    get: Bearertoken => Request[Build],
    list: Fields => Request[ListBuildsResponse]
  ): BuildsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BuildsResource]
  }
}

