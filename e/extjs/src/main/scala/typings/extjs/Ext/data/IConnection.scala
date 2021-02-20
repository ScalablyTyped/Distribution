package typings.extjs.Ext.data

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnection extends IObservable {
  
  /** [Method] Aborts an active request
    * @param request Object Defaults to the last request
    */
  var abort: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Aborts all active requests */
  var abortAll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var autoAbort: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var binary: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var cors: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var defaultHeaders: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var disableCachingParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.native
  
  /** [Method] Determines whether this object has a request outstanding
    * @param request Object Defaults to the last transaction
    * @returns Boolean True if there is an outstanding request.
    */
  var isLoading: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  
  /** [Method] Checks if the response status was successful
    * @param status Number The status code
    * @returns Object An object containing success/status state
    */
  var parseStatus: js.UndefOr[js.Function1[/* status */ js.UndefOr[Double], _]] = js.native
  
  /** [Method] Sends an HTTP request to a remote server
    * @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform postprocessing in a callback because it is passed to callback functions.)
    * @returns Object The request object. This may be used to cancel the request.
    */
  var request: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Sets various options such as the url params for the request
    * @param options Object The initial options
    * @param scope Object The scope to execute in
    * @returns Object The params for the request
    */
  var setOptions: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.native
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  
  /** [Method] Uploads a form using a hidden iframe
    * @param form String/HTMLElement/Ext.Element The form to upload
    * @param url String The url to post to
    * @param params String Any extra parameters to pass
    * @param options Object The initial options
    */
  var upload: js.UndefOr[
    js.Function4[
      /* form */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[String], 
      /* params */ js.UndefOr[String], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object IConnection {
  
  @scala.inline
  def apply(): IConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnection]
  }
  
  @scala.inline
  implicit class IConnectionMutableBuilder[Self <: IConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: /* request */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAbortAll(value: () => Unit): Self = StObject.set(x, "abortAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAbortAllUndefined: Self = StObject.set(x, "abortAll", js.undefined)
    
    @scala.inline
    def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    @scala.inline
    def setAutoAbort(value: Boolean): Self = StObject.set(x, "autoAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAbortUndefined: Self = StObject.set(x, "autoAbort", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    @scala.inline
    def setDefaultHeaders(value: js.Any): Self = StObject.set(x, "defaultHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHeadersUndefined: Self = StObject.set(x, "defaultHeaders", js.undefined)
    
    @scala.inline
    def setDisableCaching(value: Boolean): Self = StObject.set(x, "disableCaching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCachingParam(value: String): Self = StObject.set(x, "disableCachingParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCachingParamUndefined: Self = StObject.set(x, "disableCachingParam", js.undefined)
    
    @scala.inline
    def setDisableCachingUndefined: Self = StObject.set(x, "disableCaching", js.undefined)
    
    @scala.inline
    def setExtraParams(value: js.Any): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
    
    @scala.inline
    def setIsLoading(value: /* request */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setParseStatus(value: /* status */ js.UndefOr[Double] => _): Self = StObject.set(x, "parseStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseStatusUndefined: Self = StObject.set(x, "parseStatus", js.undefined)
    
    @scala.inline
    def setRequest(value: /* options */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setSetOptions(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "setOptions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetOptionsUndefined: Self = StObject.set(x, "setOptions", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUpload(
      value: (/* form */ js.UndefOr[js.Any], /* url */ js.UndefOr[String], /* params */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "upload", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
