package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version_headersResource extends js.Object {
  /** Gets the latest container version header */
  def latest(request: gapiDotClientDotTagmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersionHeader]
  /** Lists all Container Versions of a GTM Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsIncludeDeleted): gapiDotClientLib.gapiNs.clientNs.Request[ListContainerVersionsResponse]
}

object Version_headersResource {
  @scala.inline
  def apply(
    latest: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersionHeader]
    ],
    list: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsIncludeDeleted, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListContainerVersionsResponse]
    ]
  ): Version_headersResource = {
    val __obj = js.Dynamic.literal(latest = latest, list = list)
  
    __obj.asInstanceOf[Version_headersResource]
  }
}

