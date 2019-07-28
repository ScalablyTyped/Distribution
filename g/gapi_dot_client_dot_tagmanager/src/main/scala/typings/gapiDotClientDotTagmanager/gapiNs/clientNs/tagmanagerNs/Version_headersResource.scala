package typings.gapiDotClientDotTagmanager.gapiNs.clientNs.tagmanagerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotTagmanager.Anon_Alt
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsIncludeDeleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version_headersResource extends js.Object {
  /** Gets the latest container version header */
  def latest(request: Anon_Alt): Request[ContainerVersionHeader]
  /** Lists all Container Versions of a GTM Container. */
  def list(request: Anon_AltFieldsIncludeDeleted): Request[ListContainerVersionsResponse]
}

object Version_headersResource {
  @scala.inline
  def apply(
    latest: Anon_Alt => Request[ContainerVersionHeader],
    list: Anon_AltFieldsIncludeDeleted => Request[ListContainerVersionsResponse]
  ): Version_headersResource = {
    val __obj = js.Dynamic.literal(latest = js.Any.fromFunction1(latest), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[Version_headersResource]
  }
}

