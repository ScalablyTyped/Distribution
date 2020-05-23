package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.IncludeDeleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionHeadersResource extends js.Object {
  /** Gets the latest container version header */
  def latest(request: Alt): Request[ContainerVersionHeader]
  /** Lists all Container Versions of a GTM Container. */
  def list(request: IncludeDeleted): Request[ListContainerVersionsResponse]
}

object VersionHeadersResource {
  @scala.inline
  def apply(
    latest: Alt => Request[ContainerVersionHeader],
    list: IncludeDeleted => Request[ListContainerVersionsResponse]
  ): VersionHeadersResource = {
    val __obj = js.Dynamic.literal(latest = js.Any.fromFunction1(latest), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VersionHeadersResource]
  }
}

