package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_Alt
import typings.gapiDotClientDotAndroidpublisher.Anon_AltApkVersionCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApklistingsResource extends js.Object {
  /** Deletes the APK-specific localized listing for a specified APK and language code. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Deletes all the APK-specific localized listings for a specified APK. */
  def deleteall(request: Anon_AltApkVersionCode): Request[Unit]
  /** Fetches the APK-specific localized listing for a specified APK and language code. */
  def get(request: Anon_Alt): Request[ApkListing]
  /** Lists all the APK-specific localized listings for a specified APK. */
  def list(request: Anon_AltApkVersionCode): Request[ApkListingsListResponse]
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. This method supports patch semantics. */
  def patch(request: Anon_Alt): Request[ApkListing]
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. */
  def update(request: Anon_Alt): Request[ApkListing]
}

object ApklistingsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    deleteall: Anon_AltApkVersionCode => Request[Unit],
    get: Anon_Alt => Request[ApkListing],
    list: Anon_AltApkVersionCode => Request[ApkListingsListResponse],
    patch: Anon_Alt => Request[ApkListing],
    update: Anon_Alt => Request[ApkListing]
  ): ApklistingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ApklistingsResource]
  }
}

