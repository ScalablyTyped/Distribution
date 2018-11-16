package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApksResource extends js.Object {
  /**
               * Creates a new APK without uploading the APK itself to Google Play, instead hosting the APK at a specified URL. This function is only available to
               * enterprises using Google Play for Work whose application is configured to restrict distribution to the enterprise domain.
               */
  def addexternallyhosted(request: gapiDotClientDotAndroidpublisherLib.Anon_PrettyPrintPackageNameQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[ApksAddExternallyHostedResponse]
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_PrettyPrintPackageNameQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[ApksListResponse]
  def upload(request: gapiDotClientDotAndroidpublisherLib.Anon_PrettyPrintPackageNameQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Apk]
}

