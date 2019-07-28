package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltEditId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApksResource extends js.Object {
  /**
    * Creates a new APK without uploading the APK itself to Google Play, instead hosting the APK at a specified URL. This function is only available to
    * enterprises using Google Play for Work whose application is configured to restrict distribution to the enterprise domain.
    */
  def addexternallyhosted(request: Anon_AltEditId): Request[ApksAddExternallyHostedResponse]
  def list(request: Anon_AltEditId): Request[ApksListResponse]
  def upload(request: Anon_AltEditId): Request[Apk]
}

object ApksResource {
  @scala.inline
  def apply(
    addexternallyhosted: Anon_AltEditId => Request[ApksAddExternallyHostedResponse],
    list: Anon_AltEditId => Request[ApksListResponse],
    upload: Anon_AltEditId => Request[Apk]
  ): ApksResource = {
    val __obj = js.Dynamic.literal(addexternallyhosted = js.Any.fromFunction1(addexternallyhosted), list = js.Any.fromFunction1(list), upload = js.Any.fromFunction1(upload))
  
    __obj.asInstanceOf[ApksResource]
  }
}

