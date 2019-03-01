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
    getUserSettings: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean, 
      gapiDotClientLib.gapiNs.clientNs.Request[Usersettings]
    ],
    releaseDownloadAccess: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltCpksverFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[DownloadAccesses]
    ],
    requestAccess: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltCpksverFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[RequestAccess]
    ],
    syncVolumeLicenses: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltCpksverFeatures, 
      gapiDotClientLib.gapiNs.clientNs.Request[Volumes]
    ],
    updateUserSettings: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIpBoolean, 
      gapiDotClientLib.gapiNs.clientNs.Request[Usersettings]
    ]
  ): MyconfigResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getUserSettings")(getUserSettings)
    __obj.updateDynamic("releaseDownloadAccess")(releaseDownloadAccess)
    __obj.updateDynamic("requestAccess")(requestAccess)
    __obj.updateDynamic("syncVolumeLicenses")(syncVolumeLicenses)
    __obj.updateDynamic("updateUserSettings")(updateUserSettings)
    __obj.asInstanceOf[MyconfigResource]
  }
}

