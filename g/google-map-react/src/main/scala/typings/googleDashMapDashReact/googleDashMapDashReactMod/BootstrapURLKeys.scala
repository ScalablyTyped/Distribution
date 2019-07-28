package typings.googleDashMapDashReact.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapURLKeys extends js.Object {
  var client: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var v: js.UndefOr[String] = js.undefined
}

object BootstrapURLKeys {
  @scala.inline
  def apply(client: String = null, key: String = null, language: String = null, v: String = null): BootstrapURLKeys = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (key != null) __obj.updateDynamic("key")(key)
    if (language != null) __obj.updateDynamic("language")(language)
    if (v != null) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[BootstrapURLKeys]
  }
}

