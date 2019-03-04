package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitlementsResource extends js.Object {
  /** Lists the user's current inapp item or subscription entitlements */
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[EntitlementsListResponse]
}

object EntitlementsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntitlementsListResponse]
    ]
  ): EntitlementsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[EntitlementsResource]
  }
}

