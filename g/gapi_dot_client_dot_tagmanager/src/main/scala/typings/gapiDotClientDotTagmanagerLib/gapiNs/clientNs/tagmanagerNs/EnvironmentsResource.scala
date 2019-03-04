package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentsResource extends js.Object {
  /** Creates a GTM Environment. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Environment]
  /** Deletes a GTM Environment. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a GTM Environment. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Environment]
  /** Lists all GTM Environments of a GTM Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListEnvironmentsResponse]
  /** Updates a GTM Environment. This method supports patch semantics. */
  def patch(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Environment]
  /** Re-generates the authorization code for a GTM Environment. */
  def reauthorize(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Environment]
  /** Updates a GTM Environment. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Environment]
}

object EnvironmentsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Environment]
    ],
    delete: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Environment]
    ],
    list: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListEnvironmentsResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Environment]
    ],
    reauthorize: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Environment]
    ],
    update: js.Function1[
      gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Environment]
    ]
  ): EnvironmentsResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, list = list, patch = patch, reauthorize = reauthorize, update = update)
  
    __obj.asInstanceOf[EnvironmentsResource]
  }
}

