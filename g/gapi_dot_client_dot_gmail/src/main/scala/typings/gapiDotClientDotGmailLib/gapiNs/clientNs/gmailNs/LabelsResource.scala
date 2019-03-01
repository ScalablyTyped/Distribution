package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsResource extends js.Object {
  /** Creates a new label. */
  def create(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Label]
  /** Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to. */
  def delete(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets the specified label. */
  def get(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Label]
  /** Lists all labels in the user's mailbox. */
  def list(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ListLabelsResponse]
  /** Updates the specified label. This method supports patch semantics. */
  def patch(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Label]
  /** Updates the specified label. */
  def update(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Label]
}

object LabelsResource {
  @scala.inline
  def apply(
    create: js.Function1[gapiDotClientDotGmailLib.Anon_Alt, gapiDotClientLib.gapiNs.clientNs.Request[Label]],
    delete: js.Function1[
      gapiDotClientDotGmailLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotGmailLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Label]
    ],
    list: js.Function1[
      gapiDotClientDotGmailLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListLabelsResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotGmailLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Label]
    ],
    update: js.Function1[
      gapiDotClientDotGmailLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Label]
    ]
  ): LabelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[LabelsResource]
  }
}

