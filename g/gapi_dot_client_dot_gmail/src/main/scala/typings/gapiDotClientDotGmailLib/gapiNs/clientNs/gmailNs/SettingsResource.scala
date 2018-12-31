package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  var filters: FiltersResource
  var forwardingAddresses: ForwardingAddressesResource
  var sendAs: SendAsResource
  /** Gets the auto-forwarding setting for the specified account. */
  def getAutoForwarding(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[AutoForwarding]
  /** Gets IMAP settings. */
  def getImap(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ImapSettings]
  /** Gets POP settings. */
  def getPop(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[PopSettings]
  /** Gets vacation responder settings. */
  def getVacation(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[VacationSettings]
  /**
    * Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def updateAutoForwarding(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[AutoForwarding]
  /** Updates IMAP settings. */
  def updateImap(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ImapSettings]
  /** Updates POP settings. */
  def updatePop(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[PopSettings]
  /** Updates vacation responder settings. */
  def updateVacation(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[VacationSettings]
}

