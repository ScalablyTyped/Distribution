package typings
package atFeathersjsAuthenticationDashClientLib.atFeathersjsAuthenticationDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeathersAuthClientConfig extends js.Object {
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  var entity: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var jwtStrategy: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var service: js.UndefOr[java.lang.String] = js.undefined
  var storage: js.UndefOr[stdLib.Storage] = js.undefined
  var storageKey: js.UndefOr[java.lang.String] = js.undefined
}

object FeathersAuthClientConfig {
  @scala.inline
  def apply(
    cookie: java.lang.String = null,
    entity: java.lang.String = null,
    header: java.lang.String = null,
    jwtStrategy: java.lang.String = null,
    path: java.lang.String = null,
    service: java.lang.String = null,
    storage: stdLib.Storage = null,
    storageKey: java.lang.String = null
  ): FeathersAuthClientConfig = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (header != null) __obj.updateDynamic("header")(header)
    if (jwtStrategy != null) __obj.updateDynamic("jwtStrategy")(jwtStrategy)
    if (path != null) __obj.updateDynamic("path")(path)
    if (service != null) __obj.updateDynamic("service")(service)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey)
    __obj.asInstanceOf[FeathersAuthClientConfig]
  }
}

