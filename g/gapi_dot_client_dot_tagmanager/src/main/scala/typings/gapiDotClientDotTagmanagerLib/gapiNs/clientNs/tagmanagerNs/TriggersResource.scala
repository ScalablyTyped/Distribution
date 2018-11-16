package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TriggersResource extends js.Object {
  /** Creates a GTM Trigger. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[Trigger]
  /** Deletes a GTM Trigger. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a GTM Trigger. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[Trigger]
  /** Lists all GTM Triggers of a Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_ParentPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListTriggersResponse]
  /** Reverts changes to a GTM Trigger in a GTM Workspace. */
  def revert(request: gapiDotClientDotTagmanagerLib.Anon_Fingerprint): gapiDotClientLib.gapiNs.clientNs.Request[RevertTriggerResponse]
  /** Updates a GTM Trigger. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_Fingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Trigger]
}

