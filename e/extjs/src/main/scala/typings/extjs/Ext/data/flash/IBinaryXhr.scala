package typings.extjs.Ext.data.flash

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBinaryXhr extends IBase {
  
  /** [Method] Abort this connection  */
  var abort: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] As in XMLHttpRequest  */
  var getAllResponseHeaders: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] As in XMLHttpRequest
    * @param header Object
    */
  var getResponseHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] As in XMLHttpRequest  */
  var onreadystatechange: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] As in XMLHttpRequest
    * @param method Object
    * @param url Object
    * @param async Object
    * @param user Object
    * @param password Object
    */
  var open: js.UndefOr[
    js.Function5[
      /* method */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[js.Any], 
      /* async */ js.UndefOr[js.Any], 
      /* user */ js.UndefOr[js.Any], 
      /* password */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] As in XMLHttpRequest
    * @param mimeType Object
    */
  var overrideMimeType: js.UndefOr[js.Function1[/* mimeType */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Property] (number) */
  var readyState: js.UndefOr[Double] = js.native
  
  /** [Property] (Array) */
  var responseBytes: js.UndefOr[Array] = js.native
  
  /** [Method] Initiate the request
    * @param body Array an array of byte values to send.
    */
  var send: js.UndefOr[js.Function1[/* body */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] As in XMLHttpRequest
    * @param header Object
    * @param value Object
    */
  var setRequestHeader: js.UndefOr[
    js.Function2[/* header */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Property] (number) */
  var status: js.UndefOr[Double] = js.native
  
  /** [Property] (String) */
  var statusText: js.UndefOr[String] = js.native
}
object IBinaryXhr {
  
  @scala.inline
  def apply(): IBinaryXhr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBinaryXhr]
  }
  
  @scala.inline
  implicit class IBinaryXhrOps[Self <: IBinaryXhr] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    
    @scala.inline
    def setGetAllResponseHeaders(value: () => Unit): Self = this.set("getAllResponseHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAllResponseHeaders: Self = this.set("getAllResponseHeaders", js.undefined)
    
    @scala.inline
    def setGetResponseHeader(value: /* header */ js.UndefOr[js.Any] => Unit): Self = this.set("getResponseHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetResponseHeader: Self = this.set("getResponseHeader", js.undefined)
    
    @scala.inline
    def setOnreadystatechange(value: () => Unit): Self = this.set("onreadystatechange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnreadystatechange: Self = this.set("onreadystatechange", js.undefined)
    
    @scala.inline
    def setOpen(
      value: (/* method */ js.UndefOr[js.Any], /* url */ js.UndefOr[js.Any], /* async */ js.UndefOr[js.Any], /* user */ js.UndefOr[js.Any], /* password */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("open", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOverrideMimeType(value: /* mimeType */ js.UndefOr[js.Any] => Unit): Self = this.set("overrideMimeType", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOverrideMimeType: Self = this.set("overrideMimeType", js.undefined)
    
    @scala.inline
    def setReadyState(value: Double): Self = this.set("readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyState: Self = this.set("readyState", js.undefined)
    
    @scala.inline
    def setResponseBytes(value: Array): Self = this.set("responseBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseBytes: Self = this.set("responseBytes", js.undefined)
    
    @scala.inline
    def setSend(value: /* body */ js.UndefOr[Array] => Unit): Self = this.set("send", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
    
    @scala.inline
    def setSetRequestHeader(value: (/* header */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit): Self = this.set("setRequestHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetRequestHeader: Self = this.set("setRequestHeader", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
  }
}
