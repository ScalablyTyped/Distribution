package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flash {
  
  trait IBinaryXhr
    extends StObject
       with IBase {
    
    /** [Method] Abort this connection  */
    var abort: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] As in XMLHttpRequest  */
    var getAllResponseHeaders: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] As in XMLHttpRequest
      * @param header Object
      */
    var getResponseHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] As in XMLHttpRequest  */
    var onreadystatechange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] As in XMLHttpRequest
      * @param method Object
      * @param url Object
      * @param async Object
      * @param user Object
      * @param password Object
      */
    var open: js.UndefOr[
        js.Function5[
          /* method */ js.UndefOr[Any], 
          /* url */ js.UndefOr[Any], 
          /* async */ js.UndefOr[Any], 
          /* user */ js.UndefOr[Any], 
          /* password */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] As in XMLHttpRequest
      * @param mimeType Object
      */
    var overrideMimeType: js.UndefOr[js.Function1[/* mimeType */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Property] (number) */
    var readyState: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Array) */
    var responseBytes: js.UndefOr[Array] = js.undefined
    
    /** [Method] Initiate the request
      * @param body Array an array of byte values to send.
      */
    var send: js.UndefOr[js.Function1[/* body */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] As in XMLHttpRequest
      * @param header Object
      * @param value Object
      */
    var setRequestHeader: js.UndefOr[js.Function2[/* header */ js.UndefOr[Any], /* value */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Property] (number) */
    var status: js.UndefOr[Double] = js.undefined
    
    /** [Property] (String) */
    var statusText: js.UndefOr[String] = js.undefined
  }
  object IBinaryXhr {
    
    inline def apply(): IBinaryXhr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBinaryXhr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBinaryXhr] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      inline def setGetAllResponseHeaders(value: () => Unit): Self = StObject.set(x, "getAllResponseHeaders", js.Any.fromFunction0(value))
      
      inline def setGetAllResponseHeadersUndefined: Self = StObject.set(x, "getAllResponseHeaders", js.undefined)
      
      inline def setGetResponseHeader(value: /* header */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "getResponseHeader", js.Any.fromFunction1(value))
      
      inline def setGetResponseHeaderUndefined: Self = StObject.set(x, "getResponseHeader", js.undefined)
      
      inline def setOnreadystatechange(value: () => Unit): Self = StObject.set(x, "onreadystatechange", js.Any.fromFunction0(value))
      
      inline def setOnreadystatechangeUndefined: Self = StObject.set(x, "onreadystatechange", js.undefined)
      
      inline def setOpen(
        value: (/* method */ js.UndefOr[Any], /* url */ js.UndefOr[Any], /* async */ js.UndefOr[Any], /* user */ js.UndefOr[Any], /* password */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "open", js.Any.fromFunction5(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOverrideMimeType(value: /* mimeType */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "overrideMimeType", js.Any.fromFunction1(value))
      
      inline def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
      
      inline def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
      
      inline def setReadyStateUndefined: Self = StObject.set(x, "readyState", js.undefined)
      
      inline def setResponseBytes(value: Array): Self = StObject.set(x, "responseBytes", value.asInstanceOf[js.Any])
      
      inline def setResponseBytesUndefined: Self = StObject.set(x, "responseBytes", js.undefined)
      
      inline def setSend(value: /* body */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
      
      inline def setSetRequestHeader(value: (/* header */ js.UndefOr[Any], /* value */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
      
      inline def setSetRequestHeaderUndefined: Self = StObject.set(x, "setRequestHeader", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
