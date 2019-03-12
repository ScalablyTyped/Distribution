package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestersResource extends js.Object {
  def get(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Testers]
  def patch(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Testers]
  def update(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Testers]
}

object TestersResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[Testers],
    patch: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[Testers],
    update: gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[Testers]
  ): TestersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TestersResource]
  }
}

