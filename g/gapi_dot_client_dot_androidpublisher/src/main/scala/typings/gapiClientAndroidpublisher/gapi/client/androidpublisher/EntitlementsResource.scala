package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidpublisher.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementsResource extends js.Object {
  /** Lists the user's current inapp item or subscription entitlements */
  def list(request: AnonMaxResults): Request_[EntitlementsListResponse]
}

object EntitlementsResource {
  @scala.inline
  def apply(list: AnonMaxResults => Request_[EntitlementsListResponse]): EntitlementsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[EntitlementsResource]
  }
}

