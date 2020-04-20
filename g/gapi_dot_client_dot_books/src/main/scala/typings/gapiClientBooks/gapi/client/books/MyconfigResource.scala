package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltFields
import typings.gapiClientBooks.AnonFeatures
import typings.gapiClientBooks.AnonLicenseTypes
import typings.gapiClientBooks.AnonLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MyconfigResource extends js.Object {
  /** Gets the current settings for the user. */
  def getUserSettings(request: AnonAltFields): Request_[Usersettings]
  /** Release downloaded content access restriction. */
  def releaseDownloadAccess(request: AnonLocale): Request_[DownloadAccesses]
  /** Request concurrent and download access restrictions. */
  def requestAccess(request: AnonLicenseTypes): Request_[RequestAccess]
  /** Request downloaded content access for specified volumes on the My eBooks shelf. */
  def syncVolumeLicenses(request: AnonFeatures): Request_[Volumes]
  /**
    * Sets the settings for the user. If a sub-object is specified, it will overwrite the existing sub-object stored in the server. Unspecified sub-objects
    * will retain the existing value.
    */
  def updateUserSettings(request: AnonAltFields): Request_[Usersettings]
}

object MyconfigResource {
  @scala.inline
  def apply(
    getUserSettings: AnonAltFields => Request_[Usersettings],
    releaseDownloadAccess: AnonLocale => Request_[DownloadAccesses],
    requestAccess: AnonLicenseTypes => Request_[RequestAccess],
    syncVolumeLicenses: AnonFeatures => Request_[Volumes],
    updateUserSettings: AnonAltFields => Request_[Usersettings]
  ): MyconfigResource = {
    val __obj = js.Dynamic.literal(getUserSettings = js.Any.fromFunction1(getUserSettings), releaseDownloadAccess = js.Any.fromFunction1(releaseDownloadAccess), requestAccess = js.Any.fromFunction1(requestAccess), syncVolumeLicenses = js.Any.fromFunction1(syncVolumeLicenses), updateUserSettings = js.Any.fromFunction1(updateUserSettings))
    __obj.asInstanceOf[MyconfigResource]
  }
}

