package typings.expressDashSession.expressDashSessionMod

import typings.express.expressMod.CookieOptions
import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var cookie: js.UndefOr[CookieOptions] = js.undefined
  var genid: js.UndefOr[js.Function1[/* req */ Request[ParamsDictionary], String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[Boolean] = js.undefined
  var resave: js.UndefOr[Boolean] = js.undefined
  var rolling: js.UndefOr[Boolean] = js.undefined
  var saveUninitialized: js.UndefOr[Boolean] = js.undefined
  var secret: String | js.Array[String]
  var store: js.UndefOr[Store | MemoryStore] = js.undefined
  var unset: js.UndefOr[String] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(
    secret: String | js.Array[String],
    cookie: CookieOptions = null,
    genid: /* req */ Request[ParamsDictionary] => String = null,
    name: String = null,
    proxy: js.UndefOr[Boolean] = js.undefined,
    resave: js.UndefOr[Boolean] = js.undefined,
    rolling: js.UndefOr[Boolean] = js.undefined,
    saveUninitialized: js.UndefOr[Boolean] = js.undefined,
    store: Store | MemoryStore = null,
    unset: String = null
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

