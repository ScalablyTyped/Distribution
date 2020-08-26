package typings.expressSession.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.anon.Domain
import typings.expressSession.expressSessionStrings.destroy
import typings.expressSession.expressSessionStrings.keep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionOptions extends js.Object {
  var cookie: js.UndefOr[Domain] = js.native
  var genid: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]] = js.native
  var name: js.UndefOr[String] = js.native
  var proxy: js.UndefOr[Boolean] = js.native
  var resave: js.UndefOr[Boolean] = js.native
  var rolling: js.UndefOr[Boolean] = js.native
  var saveUninitialized: js.UndefOr[Boolean] = js.native
  var secret: String | js.Array[String] = js.native
  var store: js.UndefOr[Store | MemoryStore] = js.native
  /**
    * Control the result of unsetting req.session (through delete, setting to null, etc.).
    * - 'destroy' The session will be destroyed (deleted) when the response ends.
    * - 'keep' The session in the store will be kept, but modifications made during the request are ignored and not saved.
    * @default 'keep'
    */
  var unset: js.UndefOr[destroy | keep] = js.native
}

object SessionOptions {
  @scala.inline
  def apply(secret: String | js.Array[String]): SessionOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSecretVarargs(value: String*): Self = this.set("secret", js.Array(value :_*))
    @scala.inline
    def setSecret(value: String | js.Array[String]): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookie(value: Domain): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setGenid(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = this.set("genid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGenid: Self = this.set("genid", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProxy(value: Boolean): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setResave(value: Boolean): Self = this.set("resave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResave: Self = this.set("resave", js.undefined)
    @scala.inline
    def setRolling(value: Boolean): Self = this.set("rolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRolling: Self = this.set("rolling", js.undefined)
    @scala.inline
    def setSaveUninitialized(value: Boolean): Self = this.set("saveUninitialized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveUninitialized: Self = this.set("saveUninitialized", js.undefined)
    @scala.inline
    def setStore(value: Store | MemoryStore): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setUnset(value: destroy | keep): Self = this.set("unset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnset: Self = this.set("unset", js.undefined)
  }
  
}

