package typings.expressRedisCache.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptions extends js.Object {
  var binary: js.UndefOr[Boolean] = js.native
  var expire: js.UndefOr[ExpireOption | ExpirationPolicy] = js.native
  var name: js.UndefOr[String] = js.native
}

object RouteOptions {
  @scala.inline
  def apply(): RouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptions]
  }
  @scala.inline
  implicit class RouteOptionsOps[Self <: RouteOptions] (val x: Self) extends AnyVal {
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
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setExpireFunction2(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Double
    ): Self = this.set("expire", js.Any.fromFunction2(value))
    @scala.inline
    def setExpire(value: ExpireOption | ExpirationPolicy): Self = this.set("expire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpire: Self = this.set("expire", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

