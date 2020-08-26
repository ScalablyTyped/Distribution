package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.AltFields
import typings.gapiClientBooks.anon.Features
import typings.gapiClientBooks.anon.LicenseTypes
import typings.gapiClientBooks.anon.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MyconfigResource extends js.Object {
  /** Gets the current settings for the user. */
  def getUserSettings(request: AltFields): Request[Usersettings] = js.native
  /** Release downloaded content access restriction. */
  def releaseDownloadAccess(request: Locale): Request[DownloadAccesses] = js.native
  /** Request concurrent and download access restrictions. */
  def requestAccess(request: LicenseTypes): Request[RequestAccess] = js.native
  /** Request downloaded content access for specified volumes on the My eBooks shelf. */
  def syncVolumeLicenses(request: Features): Request[Volumes] = js.native
  /**
    * Sets the settings for the user. If a sub-object is specified, it will overwrite the existing sub-object stored in the server. Unspecified sub-objects
    * will retain the existing value.
    */
  def updateUserSettings(request: AltFields): Request[Usersettings] = js.native
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
  @scala.inline
  implicit class MyconfigResourceOps[Self <: MyconfigResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetUserSettings(value: AltFields => Request[Usersettings]): Self = this.set("getUserSettings", js.Any.fromFunction1(value))
    @scala.inline
    def setReleaseDownloadAccess(value: Locale => Request[DownloadAccesses]): Self = this.set("releaseDownloadAccess", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestAccess(value: LicenseTypes => Request[RequestAccess]): Self = this.set("requestAccess", js.Any.fromFunction1(value))
    @scala.inline
    def setSyncVolumeLicenses(value: Features => Request[Volumes]): Self = this.set("syncVolumeLicenses", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateUserSettings(value: AltFields => Request[Usersettings]): Self = this.set("updateUserSettings", js.Any.fromFunction1(value))
  }
  
}

