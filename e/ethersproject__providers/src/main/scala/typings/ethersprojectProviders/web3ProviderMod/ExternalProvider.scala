package typings.ethersprojectProviders.web3ProviderMod

import typings.ethersprojectProviders.anon.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalProvider extends js.Object {
  
  var host: js.UndefOr[String] = js.native
  
  var isMetaMask: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var request: js.UndefOr[js.Function1[/* request */ Method, js.Promise[_]]] = js.native
  
  var send: js.UndefOr[
    js.Function2[
      /* request */ Method, 
      /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  
  var sendAsync: js.UndefOr[
    js.Function2[
      /* request */ Method, 
      /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
}
object ExternalProvider {
  
  @scala.inline
  def apply(): ExternalProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalProvider]
  }
  
  @scala.inline
  implicit class ExternalProviderOps[Self <: ExternalProvider] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIsMetaMask(value: Boolean): Self = this.set("isMetaMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMetaMask: Self = this.set("isMetaMask", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRequest(value: /* request */ Method => js.Promise[_]): Self = this.set("request", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setSend(
      value: (/* request */ Method, /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]) => Unit
    ): Self = this.set("send", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
    
    @scala.inline
    def setSendAsync(
      value: (/* request */ Method, /* callback */ js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]) => Unit
    ): Self = this.set("sendAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSendAsync: Self = this.set("sendAsync", js.undefined)
  }
}
