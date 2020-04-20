package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonAlt
import typings.gapiClientAndroidpublisher.AnonApkVersionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApklistingsResource extends js.Object {
  /** Deletes the APK-specific localized listing for a specified APK and language code. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Deletes all the APK-specific localized listings for a specified APK. */
  def deleteall(request: AnonApkVersionCode): Request_[Unit]
  /** Fetches the APK-specific localized listing for a specified APK and language code. */
  def get(request: AnonAlt): Request_[ApkListing]
  /** Lists all the APK-specific localized listings for a specified APK. */
  def list(request: AnonApkVersionCode): Request_[ApkListingsListResponse]
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[ApkListing]
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. */
  def update(request: AnonAlt): Request_[ApkListing]
}

object ApklistingsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    deleteall: AnonApkVersionCode => Request_[Unit],
    get: AnonAlt => Request_[ApkListing],
    list: AnonApkVersionCode => Request_[ApkListingsListResponse],
    patch: AnonAlt => Request_[ApkListing],
    update: AnonAlt => Request_[ApkListing]
  ): ApklistingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ApklistingsResource]
  }
}

