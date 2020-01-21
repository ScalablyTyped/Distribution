package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltCpksverFeatures
import typings.gapiClientBooks.AnonAltCpksverFields
import typings.gapiClientBooks.AnonAltCpksverFieldsKey
import typings.gapiClientBooks.AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MyconfigResource extends js.Object {
  /** Gets the current settings for the user. */
  def getUserSettings(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean): Request_[Usersettings]
  /** Release downloaded content access restriction. */
  def releaseDownloadAccess(request: AnonAltCpksverFields): Request_[DownloadAccesses]
  /** Request concurrent and download access restrictions. */
  def requestAccess(request: AnonAltCpksverFieldsKey): Request_[RequestAccess]
  /** Request downloaded content access for specified volumes on the My eBooks shelf. */
  def syncVolumeLicenses(request: AnonAltCpksverFeatures): Request_[Volumes]
  /**
    * Sets the settings for the user. If a sub-object is specified, it will overwrite the existing sub-object stored in the server. Unspecified sub-objects
    * will retain the existing value.
    */
  def updateUserSettings(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean): Request_[Usersettings]
}

object MyconfigResource {
  @scala.inline
  def apply(
    getUserSettings: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean => Request_[Usersettings],
    releaseDownloadAccess: AnonAltCpksverFields => Request_[DownloadAccesses],
    requestAccess: AnonAltCpksverFieldsKey => Request_[RequestAccess],
    syncVolumeLicenses: AnonAltCpksverFeatures => Request_[Volumes],
    updateUserSettings: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean => Request_[Usersettings]
  ): MyconfigResource = {
    val __obj = js.Dynamic.literal(getUserSettings = js.Any.fromFunction1(getUserSettings), releaseDownloadAccess = js.Any.fromFunction1(releaseDownloadAccess), requestAccess = js.Any.fromFunction1(requestAccess), syncVolumeLicenses = js.Any.fromFunction1(syncVolumeLicenses), updateUserSettings = js.Any.fromFunction1(updateUserSettings))
  
    __obj.asInstanceOf[MyconfigResource]
  }
}

