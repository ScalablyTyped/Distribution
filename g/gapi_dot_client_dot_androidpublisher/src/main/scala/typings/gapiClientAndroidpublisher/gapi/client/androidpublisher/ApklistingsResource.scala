package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.Alt
import typings.gapiClientAndroidpublisher.anon.ApkVersionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApklistingsResource extends js.Object {
  /** Deletes the APK-specific localized listing for a specified APK and language code. */
  def delete(request: Alt): Request[Unit]
  /** Deletes all the APK-specific localized listings for a specified APK. */
  def deleteall(request: ApkVersionCode): Request[Unit]
  /** Fetches the APK-specific localized listing for a specified APK and language code. */
  def get(request: Alt): Request[ApkListing]
  /** Lists all the APK-specific localized listings for a specified APK. */
  def list(request: ApkVersionCode): Request[ApkListingsListResponse]
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. This method supports patch semantics. */
  def patch(request: Alt): Request[ApkListing]
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. */
  def update(request: Alt): Request[ApkListing]
}

object ApklistingsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    deleteall: ApkVersionCode => Request[Unit],
    get: Alt => Request[ApkListing],
    list: ApkVersionCode => Request[ApkListingsListResponse],
    patch: Alt => Request[ApkListing],
    update: Alt => Request[ApkListing]
  ): ApklistingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ApklistingsResource]
  }
}

