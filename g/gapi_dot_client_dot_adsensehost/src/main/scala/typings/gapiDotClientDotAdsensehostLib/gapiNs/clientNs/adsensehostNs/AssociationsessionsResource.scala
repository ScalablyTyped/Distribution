package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationsessionsResource extends js.Object {
  /** Create an association session for initiating an association with an AdSense user. */
  def start(request: gapiDotClientDotAdsensehostLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[AssociationSession]
  /** Verify an association session after the association callback returns from AdSense signup. */
  def verify(request: gapiDotClientDotAdsensehostLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[AssociationSession]
}

object AssociationsessionsResource {
  @scala.inline
  def apply(
    start: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[AssociationSession]
    ],
    verify: js.Function1[
      gapiDotClientDotAdsensehostLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AssociationSession]
    ]
  ): AssociationsessionsResource = {
    val __obj = js.Dynamic.literal(start = start, verify = verify)
  
    __obj.asInstanceOf[AssociationsessionsResource]
  }
}

