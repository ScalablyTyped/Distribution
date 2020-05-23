package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.AltFields
import typings.gapiClientBooks.anon.Features
import typings.gapiClientBooks.anon.LicenseTypes
import typings.gapiClientBooks.anon.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MyconfigResource extends js.Object {
  /** Gets the current settings for the user. */
  def getUserSettings(request: AltFields): Request[Usersettings]
  /** Release downloaded content access restriction. */
  def releaseDownloadAccess(request: Locale): Request[DownloadAccesses]
  /** Request concurrent and download access restrictions. */
  def requestAccess(request: LicenseTypes): Request[RequestAccess]
  /** Request downloaded content access for specified volumes on the My eBooks shelf. */
  def syncVolumeLicenses(request: Features): Request[Volumes]
  /**
    * Sets the settings for the user. If a sub-object is specified, it will overwrite the existing sub-object stored in the server. Unspecified sub-objects
    * will retain the existing value.
    */
  def updateUserSettings(request: AltFields): Request[Usersettings]
}

object MyconfigResource {
  @scala.inline
  def apply(
    getUserSettings: AltFields => Request[Usersettings],
    releaseDownloadAccess: Locale => Request[DownloadAccesses],
    requestAccess: LicenseTypes => Request[RequestAccess],
    syncVolumeLicenses: Features => Request[Volumes],
    updateUserSettings: AltFields => Request[Usersettings]
  ): MyconfigResource = {
    val __obj = js.Dynamic.literal(getUserSettings = js.Any.fromFunction1(getUserSettings), releaseDownloadAccess = js.Any.fromFunction1(releaseDownloadAccess), requestAccess = js.Any.fromFunction1(requestAccess), syncVolumeLicenses = js.Any.fromFunction1(syncVolumeLicenses), updateUserSettings = js.Any.fromFunction1(updateUserSettings))
    __obj.asInstanceOf[MyconfigResource]
  }
}

