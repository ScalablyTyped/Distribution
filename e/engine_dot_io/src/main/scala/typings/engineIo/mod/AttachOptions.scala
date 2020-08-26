package typings.engineIo.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachOptions extends js.Object {
  /**
    * destroy unhandled upgrade requests (true)
    */
  var destroyUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * milliseconds after which unhandled requests are ended (1000)
    */
  var destroyUpgradeTimeout: js.UndefOr[Double] = js.native
  /**
    * whether to let engine.io handle the OPTIONS requests. You can also pass a custom function to handle the requests (true)
    */
  var handlePreflightRequest: js.UndefOr[
    Boolean | (js.Function3[/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse, Unit])
  ] = js.native
  /**
    * name of the path to capture (/engine.io).
    */
  var path: js.UndefOr[String] = js.native
}

object AttachOptions {
  @scala.inline
  def apply(): AttachOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachOptions]
  }
  @scala.inline
  implicit class AttachOptionsOps[Self <: AttachOptions] (val x: Self) extends AnyVal {
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
    def setDestroyUpgrade(value: Boolean): Self = this.set("destroyUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyUpgrade: Self = this.set("destroyUpgrade", js.undefined)
    @scala.inline
    def setDestroyUpgradeTimeout(value: Double): Self = this.set("destroyUpgradeTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyUpgradeTimeout: Self = this.set("destroyUpgradeTimeout", js.undefined)
    @scala.inline
    def setHandlePreflightRequestFunction3(value: (/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = this.set("handlePreflightRequest", js.Any.fromFunction3(value))
    @scala.inline
    def setHandlePreflightRequest(
      value: Boolean | (js.Function3[/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse, Unit])
    ): Self = this.set("handlePreflightRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlePreflightRequest: Self = this.set("handlePreflightRequest", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

