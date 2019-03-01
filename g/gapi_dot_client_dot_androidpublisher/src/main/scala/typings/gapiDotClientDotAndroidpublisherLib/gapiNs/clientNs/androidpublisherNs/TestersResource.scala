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
    get: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Testers]
    ],
    patch: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Testers]
    ],
    update: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEditIdFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Testers]
    ]
  ): TestersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[TestersResource]
  }
}

