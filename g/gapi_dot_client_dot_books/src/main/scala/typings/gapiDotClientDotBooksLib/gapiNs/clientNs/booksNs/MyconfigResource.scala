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

