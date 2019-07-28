package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AltCpksverFeatures
import typings.gapiDotClientDotBooks.Anon_AltCpksverFields
import typings.gapiDotClientDotBooks.Anon_AltCpksverFieldsKey
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MyconfigResource extends js.Object {
  /** Gets the current settings for the user. */
  def getUserSettings(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean): Request[Usersettings]
  /** Release downloaded content access restriction. */
  def releaseDownloadAccess(request: Anon_AltCpksverFields): Request[DownloadAccesses]
  /** Request concurrent and download access restrictions. */
  def requestAccess(request: Anon_AltCpksverFieldsKey): Request[RequestAccess]
  /** Request downloaded content access for specified volumes on the My eBooks shelf. */
  def syncVolumeLicenses(request: Anon_AltCpksverFeatures): Request[Volumes]
  /**
    * Sets the settings for the user. If a sub-object is specified, it will overwrite the existing sub-object stored in the server. Unspecified sub-objects
    * will retain the existing value.
    */
  def updateUserSettings(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean): Request[Usersettings]
}

object MyconfigResource {
  @scala.inline
  def apply(
    getUserSettings: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean => Request[Usersettings],
    releaseDownloadAccess: Anon_AltCpksverFields => Request[DownloadAccesses],
    requestAccess: Anon_AltCpksverFieldsKey => Request[RequestAccess],
    syncVolumeLicenses: Anon_AltCpksverFeatures => Request[Volumes],
    updateUserSettings: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean => Request[Usersettings]
  ): MyconfigResource = {
    val __obj = js.Dynamic.literal(getUserSettings = js.Any.fromFunction1(getUserSettings), releaseDownloadAccess = js.Any.fromFunction1(releaseDownloadAccess), requestAccess = js.Any.fromFunction1(requestAccess), syncVolumeLicenses = js.Any.fromFunction1(syncVolumeLicenses), updateUserSettings = js.Any.fromFunction1(updateUserSettings))
  
    __obj.asInstanceOf[MyconfigResource]
  }
}

