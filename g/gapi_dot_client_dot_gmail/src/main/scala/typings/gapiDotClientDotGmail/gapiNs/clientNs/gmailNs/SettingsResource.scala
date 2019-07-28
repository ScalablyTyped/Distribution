package typings.gapiDotClientDotGmail.gapiNs.clientNs.gmailNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGmail.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  var filters: FiltersResource
  var forwardingAddresses: ForwardingAddressesResource
  var sendAs: SendAsResource
  /** Gets the auto-forwarding setting for the specified account. */
  def getAutoForwarding(request: Anon_Alt): Request[AutoForwarding]
  /** Gets IMAP settings. */
  def getImap(request: Anon_Alt): Request[ImapSettings]
  /** Gets POP settings. */
  def getPop(request: Anon_Alt): Request[PopSettings]
  /** Gets vacation responder settings. */
  def getVacation(request: Anon_Alt): Request[VacationSettings]
  /**
    * Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def updateAutoForwarding(request: Anon_Alt): Request[AutoForwarding]
  /** Updates IMAP settings. */
  def updateImap(request: Anon_Alt): Request[ImapSettings]
  /** Updates POP settings. */
  def updatePop(request: Anon_Alt): Request[PopSettings]
  /** Updates vacation responder settings. */
  def updateVacation(request: Anon_Alt): Request[VacationSettings]
}

object SettingsResource {
  @scala.inline
  def apply(
    filters: FiltersResource,
    forwardingAddresses: ForwardingAddressesResource,
    getAutoForwarding: Anon_Alt => Request[AutoForwarding],
    getImap: Anon_Alt => Request[ImapSettings],
    getPop: Anon_Alt => Request[PopSettings],
    getVacation: Anon_Alt => Request[VacationSettings],
    sendAs: SendAsResource,
    updateAutoForwarding: Anon_Alt => Request[AutoForwarding],
    updateImap: Anon_Alt => Request[ImapSettings],
    updatePop: Anon_Alt => Request[PopSettings],
    updateVacation: Anon_Alt => Request[VacationSettings]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal(filters = filters, forwardingAddresses = forwardingAddresses, getAutoForwarding = js.Any.fromFunction1(getAutoForwarding), getImap = js.Any.fromFunction1(getImap), getPop = js.Any.fromFunction1(getPop), getVacation = js.Any.fromFunction1(getVacation), sendAs = sendAs, updateAutoForwarding = js.Any.fromFunction1(updateAutoForwarding), updateImap = js.Any.fromFunction1(updateImap), updatePop = js.Any.fromFunction1(updatePop), updateVacation = js.Any.fromFunction1(updateVacation))
  
    __obj.asInstanceOf[SettingsResource]
  }
}

