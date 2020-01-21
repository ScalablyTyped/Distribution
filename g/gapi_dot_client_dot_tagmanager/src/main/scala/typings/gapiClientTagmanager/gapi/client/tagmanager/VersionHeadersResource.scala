package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonAltFieldsIncludeDeleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionHeadersResource extends js.Object {
  /** Gets the latest container version header */
  def latest(request: AnonAlt): Request_[ContainerVersionHeader]
  /** Lists all Container Versions of a GTM Container. */
  def list(request: AnonAltFieldsIncludeDeleted): Request_[ListContainerVersionsResponse]
}

object VersionHeadersResource {
  @scala.inline
  def apply(
    latest: AnonAlt => Request_[ContainerVersionHeader],
    list: AnonAltFieldsIncludeDeleted => Request_[ListContainerVersionsResponse]
  ): VersionHeadersResource = {
    val __obj = js.Dynamic.literal(latest = js.Any.fromFunction1(latest), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VersionHeadersResource]
  }
}

