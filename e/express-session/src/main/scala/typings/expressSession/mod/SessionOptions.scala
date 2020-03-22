package typings.expressSession.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressSession.AnonDomain
import typings.expressSession.expressSessionStrings.destroy
import typings.expressSession.expressSessionStrings.keep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var cookie: js.UndefOr[AnonDomain] = js.undefined
  var genid: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary], String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[Boolean] = js.undefined
  var resave: js.UndefOr[Boolean] = js.undefined
  var rolling: js.UndefOr[Boolean] = js.undefined
  var saveUninitialized: js.UndefOr[Boolean] = js.undefined
  var secret: String | js.Array[String]
  var store: js.UndefOr[Store | MemoryStore] = js.undefined
  /**
    * Control the result of unsetting req.session (through delete, setting to null, etc.).
    * - 'destroy' The session will be destroyed (deleted) when the response ends.
    * - 'keep' The session in the store will be kept, but modifications made during the request are ignored and not saved.
    * @default 'keep'
    */
  var unset: js.UndefOr[destroy | keep] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(
    secret: String | js.Array[String],
    cookie: AnonDomain = null,
    genid: /* req */ Request_[ParamsDictionary] => String = null,
    name: String = null,
    proxy: js.UndefOr[Boolean] = js.undefined,
    resave: js.UndefOr[Boolean] = js.undefined,
    rolling: js.UndefOr[Boolean] = js.undefined,
    saveUninitialized: js.UndefOr[Boolean] = js.undefined,
    store: Store | MemoryStore = null,
    unset: destroy | keep = null
  ): SessionOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (genid != null) __obj.updateDynamic("genid")(js.Any.fromFunction1(genid))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(proxy)) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(resave)) __obj.updateDynamic("resave")(resave.asInstanceOf[js.Any])
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling.asInstanceOf[js.Any])
    if (!js.isUndefined(saveUninitialized)) __obj.updateDynamic("saveUninitialized")(saveUninitialized.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (unset != null) __obj.updateDynamic("unset")(unset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
}

