package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementsResource extends js.Object {
  /** Lists the user's current inapp item or subscription entitlements */
  def list(request: Anon_AltFieldsKey): Request[EntitlementsListResponse]
}

object EntitlementsResource {
  @scala.inline
  def apply(list: Anon_AltFieldsKey => Request[EntitlementsListResponse]): EntitlementsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[EntitlementsResource]
  }
}

