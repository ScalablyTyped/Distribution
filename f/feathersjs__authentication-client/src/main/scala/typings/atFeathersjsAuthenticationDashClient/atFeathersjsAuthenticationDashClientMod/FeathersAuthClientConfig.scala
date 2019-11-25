package typings.atFeathersjsAuthenticationDashClient.atFeathersjsAuthenticationDashClientMod

import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersAuthClientConfig extends js.Object {
  var cookie: js.UndefOr[String] = js.undefined
  var entity: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var jwtStrategy: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var service: js.UndefOr[String] = js.undefined
  var storage: js.UndefOr[Storage] = js.undefined
  var storageKey: js.UndefOr[String] = js.undefined
}

object FeathersAuthClientConfig {
  @scala.inline
  def apply(
    cookie: String = null,
    entity: String = null,
    header: String = null,
    jwtStrategy: String = null,
    path: String = null,
    service: String = null,
    storage: Storage = null,
    storageKey: String = null
  ): FeathersAuthClientConfig = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (jwtStrategy != null) __obj.updateDynamic("jwtStrategy")(jwtStrategy.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeathersAuthClientConfig]
  }
}

