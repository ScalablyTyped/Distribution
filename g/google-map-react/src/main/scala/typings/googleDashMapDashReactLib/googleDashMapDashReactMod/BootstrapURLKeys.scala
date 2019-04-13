package typings
package googleDashMapDashReactLib.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapURLKeys extends js.Object {
  var client: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var v: js.UndefOr[java.lang.String] = js.undefined
}

object BootstrapURLKeys {
  @scala.inline
  def apply(
    client: java.lang.String = null,
    key: java.lang.String = null,
    language: java.lang.String = null,
    v: java.lang.String = null
  ): BootstrapURLKeys = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (key != null) __obj.updateDynamic("key")(key)
    if (language != null) __obj.updateDynamic("language")(language)
    if (v != null) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[BootstrapURLKeys]
  }
}

