package typings.extjs.Ext.data

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConnection
  extends StObject
     with IObservable {
  
  /** [Method] Aborts an active request
    * @param request Object Defaults to the last request
    */
  var abort: js.UndefOr[js.Function1[/* request */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Aborts all active requests */
  var abortAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoAbort: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var binary: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var cors: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultHeaders: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var disableCachingParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[Any] = js.undefined
  
  /** [Method] Determines whether this object has a request outstanding
    * @param request Object Defaults to the last transaction
    * @returns Boolean True if there is an outstanding request.
    */
  var isLoading: js.UndefOr[js.Function1[/* request */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.undefined
  
  /** [Method] Checks if the response status was successful
    * @param status Number The status code
    * @returns Object An object containing success/status state
    */
  var parseStatus: js.UndefOr[js.Function1[/* status */ js.UndefOr[Double], Any]] = js.undefined
  
  /** [Method] Sends an HTTP request to a remote server
    * @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform postprocessing in a callback because it is passed to callback functions.)
    * @returns Object The request object. This may be used to cancel the request.
    */
  var request: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Sets various options such as the url params for the request
    * @param options Object The initial options
    * @param scope Object The scope to execute in
    * @returns Object The params for the request
    */
  var setOptions: js.UndefOr[js.Function2[/* options */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** [Method] Uploads a form using a hidden iframe
    * @param form String/HTMLElement/Ext.Element The form to upload
    * @param url String The url to post to
    * @param params String Any extra parameters to pass
    * @param options Object The initial options
    */
  var upload: js.UndefOr[
    js.Function4[
      /* form */ js.UndefOr[Any], 
      /* url */ js.UndefOr[String], 
      /* params */ js.UndefOr[String], 
      /* options */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object IConnection {
  
  inline def apply(): IConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnection]
  }
  
  extension [Self <: IConnection](x: Self) {
    
    inline def setAbort(value: /* request */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
    
    inline def setAbortAll(value: () => Unit): Self = StObject.set(x, "abortAll", js.Any.fromFunction0(value))
    
    inline def setAbortAllUndefined: Self = StObject.set(x, "abortAll", js.undefined)
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setAutoAbort(value: Boolean): Self = StObject.set(x, "autoAbort", value.asInstanceOf[js.Any])
    
    inline def setAutoAbortUndefined: Self = StObject.set(x, "autoAbort", js.undefined)
    
    inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    inline def setDefaultHeaders(value: Any): Self = StObject.set(x, "defaultHeaders", value.asInstanceOf[js.Any])
    
    inline def setDefaultHeadersUndefined: Self = StObject.set(x, "defaultHeaders", js.undefined)
    
    inline def setDisableCaching(value: Boolean): Self = StObject.set(x, "disableCaching", value.asInstanceOf[js.Any])
    
    inline def setDisableCachingParam(value: String): Self = StObject.set(x, "disableCachingParam", value.asInstanceOf[js.Any])
    
    inline def setDisableCachingParamUndefined: Self = StObject.set(x, "disableCachingParam", js.undefined)
    
    inline def setDisableCachingUndefined: Self = StObject.set(x, "disableCaching", js.undefined)
    
    inline def setExtraParams(value: Any): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
    
    inline def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
    
    inline def setIsLoading(value: /* request */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction1(value))
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setParseStatus(value: /* status */ js.UndefOr[Double] => Any): Self = StObject.set(x, "parseStatus", js.Any.fromFunction1(value))
    
    inline def setParseStatusUndefined: Self = StObject.set(x, "parseStatus", js.undefined)
    
    inline def setRequest(value: /* options */ js.UndefOr[Any] => Any): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setSetOptions(value: (/* options */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "setOptions", js.Any.fromFunction2(value))
    
    inline def setSetOptionsUndefined: Self = StObject.set(x, "setOptions", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUpload(
      value: (/* form */ js.UndefOr[Any], /* url */ js.UndefOr[String], /* params */ js.UndefOr[String], /* options */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "upload", js.Any.fromFunction4(value))
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
