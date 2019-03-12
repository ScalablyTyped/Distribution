package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApklistingsResource extends js.Object {
  /** Deletes the APK-specific localized listing for a specified APK and language code. */
  def delete(request: gapiDotClientDotAndroidpublisherLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Deletes all the APK-specific localized listings for a specified APK. */
  def deleteall(request: gapiDotClientDotAndroidpublisherLib.Anon_AltApkVersionCode): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Fetches the APK-specific localized listing for a specified APK and language code. */
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ApkListing]
  /** Lists all the APK-specific localized listings for a specified APK. */
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_AltApkVersionCode): gapiDotClientLib.gapiNs.clientNs.Request[ApkListingsListResponse]
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAndroidpublisherLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ApkListing]
  /** Updates or creates the APK-specific localized listing for a specified APK and language code. */
  def update(request: gapiDotClientDotAndroidpublisherLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ApkListing]
}

object ApklistingsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAndroidpublisherLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    deleteall: gapiDotClientDotAndroidpublisherLib.Anon_AltApkVersionCode => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAndroidpublisherLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ApkListing],
    list: gapiDotClientDotAndroidpublisherLib.Anon_AltApkVersionCode => gapiDotClientLib.gapiNs.clientNs.Request[ApkListingsListResponse],
    patch: gapiDotClientDotAndroidpublisherLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ApkListing],
    update: gapiDotClientDotAndroidpublisherLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ApkListing]
  ): ApklistingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ApklistingsResource]
  }
}

