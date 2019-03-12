package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MyconfigResource extends js.Object {
  /** Gets the current settings for the user. */
  def getUserSettings(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean): gapiDotClientLib.gapiNs.clientNs.Request[Usersettings]
  /** Release downloaded content access restriction. */
  def releaseDownloadAccess(request: gapiDotClientDotBooksLib.Anon_AltCpksverFields): gapiDotClientLib.gapiNs.clientNs.Request[DownloadAccesses]
  /** Request concurrent and download access restrictions. */
  def requestAccess(request: gapiDotClientDotBooksLib.Anon_AltCpksverFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[RequestAccess]
  /** Request downloaded content access for specified volumes on the My eBooks shelf. */
  def syncVolumeLicenses(request: gapiDotClientDotBooksLib.Anon_AltCpksverFeatures): gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
  /**
    * Sets the settings for the user. If a sub-object is specified, it will overwrite the existing sub-object stored in the server. Unspecified sub-objects
    * will retain the existing value.
    */
  def updateUserSettings(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean): gapiDotClientLib.gapiNs.clientNs.Request[Usersettings]
}

object MyconfigResource {
  @scala.inline
  def apply(
    getUserSettings: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean => gapiDotClientLib.gapiNs.clientNs.Request[Usersettings],
    releaseDownloadAccess: gapiDotClientDotBooksLib.Anon_AltCpksverFields => gapiDotClientLib.gapiNs.clientNs.Request[DownloadAccesses],
    requestAccess: gapiDotClientDotBooksLib.Anon_AltCpksverFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[RequestAccess],
    syncVolumeLicenses: gapiDotClientDotBooksLib.Anon_AltCpksverFeatures => gapiDotClientLib.gapiNs.clientNs.Request[Volumes],
    updateUserSettings: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean => gapiDotClientLib.gapiNs.clientNs.Request[Usersettings]
  ): MyconfigResource = {
    val __obj = js.Dynamic.literal(getUserSettings = js.Any.fromFunction1(getUserSettings), releaseDownloadAccess = js.Any.fromFunction1(releaseDownloadAccess), requestAccess = js.Any.fromFunction1(requestAccess), syncVolumeLicenses = js.Any.fromFunction1(syncVolumeLicenses), updateUserSettings = js.Any.fromFunction1(updateUserSettings))
  
    __obj.asInstanceOf[MyconfigResource]
  }
}

