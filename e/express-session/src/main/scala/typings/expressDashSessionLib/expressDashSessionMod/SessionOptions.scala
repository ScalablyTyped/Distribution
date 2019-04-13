package typings
package expressDashSessionLib.expressDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var cookie: js.UndefOr[expressLib.expressMod.CookieOptions] = js.undefined
  var genid: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.Request, java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[scala.Boolean] = js.undefined
  var resave: js.UndefOr[scala.Boolean] = js.undefined
  var rolling: js.UndefOr[scala.Boolean] = js.undefined
  var saveUninitialized: js.UndefOr[scala.Boolean] = js.undefined
  var secret: java.lang.String | js.Array[java.lang.String]
  var store: js.UndefOr[Store | MemoryStore] = js.undefined
  var unset: js.UndefOr[java.lang.String] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(
    secret: java.lang.String | js.Array[java.lang.String],
    cookie: expressLib.expressMod.CookieOptions = null,
    genid: /* req */ expressLib.expressMod.Request => java.lang.String = null,
    name: java.lang.String = null,
    proxy: js.UndefOr[scala.Boolean] = js.undefined,
    resave: js.UndefOr[scala.Boolean] = js.undefined,
    rolling: js.UndefOr[scala.Boolean] = js.undefined,
    saveUninitialized: js.UndefOr[scala.Boolean] = js.undefined,
    store: Store | MemoryStore = null,
    unset: java.lang.String = null
  ): SessionOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (genid != null) __obj.updateDynamic("genid")(js.Any.fromFunction1(genid))
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(proxy)) __obj.updateDynamic("proxy")(proxy)
    if (!js.isUndefined(resave)) __obj.updateDynamic("resave")(resave)
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling)
    if (!js.isUndefined(saveUninitialized)) __obj.updateDynamic("saveUninitialized")(saveUninitialized)
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (unset != null) __obj.updateDynamic("unset")(unset)
    __obj.asInstanceOf[SessionOptions]
  }
}

