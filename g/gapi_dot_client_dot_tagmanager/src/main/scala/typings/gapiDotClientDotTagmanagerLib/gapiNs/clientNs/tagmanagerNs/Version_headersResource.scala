package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Version_headersResource extends js.Object {
  /** Gets the latest container version header */
  def latest(request: gapiDotClientDotTagmanagerLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersionHeader]
  /** Lists all Container Versions of a GTM Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_ParentPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[ListContainerVersionsResponse]
}

