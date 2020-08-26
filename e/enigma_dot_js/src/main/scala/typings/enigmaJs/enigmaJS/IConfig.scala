package typings.enigmaJs.enigmaJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This section describes the configuration object that is sent into enigma.create(config).
  */
@js.native
trait IConfig extends js.Object {
  /**
    * ES6-compatible Promise library.
    */
  var Promise: js.UndefOr[js.Any] = js.native
  /**
    * A function to use when instantiating the WebSocket, mandatory for Node.js.
    */
  var createSocket: js.UndefOr[js.Any] = js.native
  /**
    * Mixins to extend/augment the QIX Engine API.
    * See Mixins section for more information how each entry in this array should look like.
    * Mixins are applied in the array order.
    */
  var mixins: js.UndefOr[js.Array[IMixin]] = js.native
  /**
    * An object containing additional JSON-RPC request parameters.
    * protocol.delta :  Set to false to disable the use of the bandwidth-reducing delta protocol.
    */
  var protocol: js.UndefOr[js.Any] = js.native
  /**
    * Interceptors for augmenting requests before they are sent to QIX Engine.
    * See Interceptors section for more information how each entry in this array should look like.
    * Interceptors are applied in the array order.
    */
  var requestInterceptors: js.UndefOr[js.Array[IRequestInterceptors]] = js.native
  /**
    * Interceptors for augmenting responses before they are sent to QIX Engine.
    * See Interceptors section for more information how each entry in this array should look like.
    * Interceptors are applied in the array order.
    */
  var responseInterceptors: js.UndefOr[js.Array[IResponseInterceptors]] = js.native
  /**
    * Object containing the specification for the API to generate. Corresponds to a specific version of the QIX Engine API.
    */
  var schema: js.Object = js.native
  /**
    * Set to true if the session should be suspended instead of closed when the websocket is closed.
    */
  var suspendOnClose: js.UndefOr[Boolean] = js.native
  /**
    * String containing a proper websocket URL to QIX Engine.
    */
  var url: String = js.native
}

object IConfig {
  @scala.inline
  def apply(schema: js.Object, url: String): IConfig = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
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
    def setSchema(value: js.Object): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setPromise(value: js.Any): Self = this.set("Promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    @scala.inline
    def setCreateSocket(value: js.Any): Self = this.set("createSocket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateSocket: Self = this.set("createSocket", js.undefined)
    @scala.inline
    def setMixinsVarargs(value: IMixin*): Self = this.set("mixins", js.Array(value :_*))
    @scala.inline
    def setMixins(value: js.Array[IMixin]): Self = this.set("mixins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixins: Self = this.set("mixins", js.undefined)
    @scala.inline
    def setProtocol(value: js.Any): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setRequestInterceptorsVarargs(value: IRequestInterceptors*): Self = this.set("requestInterceptors", js.Array(value :_*))
    @scala.inline
    def setRequestInterceptors(value: js.Array[IRequestInterceptors]): Self = this.set("requestInterceptors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestInterceptors: Self = this.set("requestInterceptors", js.undefined)
    @scala.inline
    def setResponseInterceptorsVarargs(value: IResponseInterceptors*): Self = this.set("responseInterceptors", js.Array(value :_*))
    @scala.inline
    def setResponseInterceptors(value: js.Array[IResponseInterceptors]): Self = this.set("responseInterceptors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseInterceptors: Self = this.set("responseInterceptors", js.undefined)
    @scala.inline
    def setSuspendOnClose(value: Boolean): Self = this.set("suspendOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspendOnClose: Self = this.set("suspendOnClose", js.undefined)
  }
  
}

