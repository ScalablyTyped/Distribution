package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  var filters: FiltersResource
  var forwardingAddresses: ForwardingAddressesResource
  var sendAs: SendAsResource
  /** Gets the auto-forwarding setting for the specified account. */
  def getAutoForwarding(request: AnonAlt): Request_[AutoForwarding]
  /** Gets IMAP settings. */
  def getImap(request: AnonAlt): Request_[ImapSettings]
  /** Gets POP settings. */
  def getPop(request: AnonAlt): Request_[PopSettings]
  /** Gets vacation responder settings. */
  def getVacation(request: AnonAlt): Request_[VacationSettings]
  /**
    * Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def updateAutoForwarding(request: AnonAlt): Request_[AutoForwarding]
  /** Updates IMAP settings. */
  def updateImap(request: AnonAlt): Request_[ImapSettings]
  /** Updates POP settings. */
  def updatePop(request: AnonAlt): Request_[PopSettings]
  /** Updates vacation responder settings. */
  def updateVacation(request: AnonAlt): Request_[VacationSettings]
}

object SettingsResource {
  @scala.inline
  def apply(
    filters: FiltersResource,
    forwardingAddresses: ForwardingAddressesResource,
    getAutoForwarding: AnonAlt => Request_[AutoForwarding],
    getImap: AnonAlt => Request_[ImapSettings],
    getPop: AnonAlt => Request_[PopSettings],
    getVacation: AnonAlt => Request_[VacationSettings],
    sendAs: SendAsResource,
    updateAutoForwarding: AnonAlt => Request_[AutoForwarding],
    updateImap: AnonAlt => Request_[ImapSettings],
    updatePop: AnonAlt => Request_[PopSettings],
    updateVacation: AnonAlt => Request_[VacationSettings]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], forwardingAddresses = forwardingAddresses.asInstanceOf[js.Any], getAutoForwarding = js.Any.fromFunction1(getAutoForwarding), getImap = js.Any.fromFunction1(getImap), getPop = js.Any.fromFunction1(getPop), getVacation = js.Any.fromFunction1(getVacation), sendAs = sendAs.asInstanceOf[js.Any], updateAutoForwarding = js.Any.fromFunction1(updateAutoForwarding), updateImap = js.Any.fromFunction1(updateImap), updatePop = js.Any.fromFunction1(updatePop), updateVacation = js.Any.fromFunction1(updateVacation))
  
    __obj.asInstanceOf[SettingsResource]
  }
}

