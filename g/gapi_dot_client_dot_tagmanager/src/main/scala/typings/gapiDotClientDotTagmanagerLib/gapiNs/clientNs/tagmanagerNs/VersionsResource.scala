package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionsResource extends js.Object {
  /** Deletes a Container Version. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a Container Version. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_AltContainerVersionId): gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersion]
  /** Gets the live (i.e. published) container version */
  def live(request: gapiDotClientDotTagmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersion]
  /** Publishes a Container Version. */
  def publish(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[PublishContainerVersionResponse]
  /** Sets the latest version used for synchronization of workspaces when detecting conflicts and errors. */
  def set_latest(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersion]
  /** Undeletes a Container Version. */
  def undelete(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersion]
  /** Updates a Container Version. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersion]
}

object VersionsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltContainerVersionId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersion]
    ],
    live: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersion]
    ],
    publish: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint, 
      gapiDotClientLib.gapiNs.clientNs.Request[PublishContainerVersionResponse]
    ],
    set_latest: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersion]
    ],
    undelete: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersion]
    ],
    update: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint, 
      gapiDotClientLib.gapiNs.clientNs.Request[ContainerVersion]
    ]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("live")(live)
    __obj.updateDynamic("publish")(publish)
    __obj.updateDynamic("set_latest")(set_latest)
    __obj.updateDynamic("undelete")(undelete)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[VersionsResource]
  }
}

