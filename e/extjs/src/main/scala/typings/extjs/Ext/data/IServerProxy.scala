package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerProxy
  extends typings.extjs.Ext.data.proxy.IProxy {
  
  /** [Method] Optional callback function which can be used to clean up after a request has been completed
    * @param request Ext.data.Request The Request object
    * @param success Boolean True if the request was successful
    */
  var afterRequest: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.native
  
  /** [Method] Creates an Request object from Operation
    * @param operation Ext.data.Operation The operation to execute
    * @returns Ext.data.Request The request object
    */
  var buildRequest: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], IRequest]] = js.native
  
  /** [Method] Generates a url based on a given Ext data Request object
    * @param request Ext.data.Request The request object
    * @returns String The url
    */
  var buildUrl: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.native
  
  /** [Config Option] (String) */
  var cacheString: js.UndefOr[String] = js.native
  
  /** [Method] in a ServerProxy all four CRUD operations are executed in the same manner so we delegate to doRequest in each case */
  @JSName("create")
  var create_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Performs the given destroy operation  */
  @JSName("destroy")
  var destroy_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var directionParam: js.UndefOr[String] = js.native
  
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
    * @param operation Ext.data.Operation The Ext.data.Operation object
    * @param callback Function The callback function to call when the Operation has completed
    * @param scope Object The scope in which to execute the callback
    */
  var doRequest: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
    * @param filters Ext.util.Filter[] The array of Filter objects
    * @returns String The encoded filters
    */
  var encodeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], String]] = js.native
  
  /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
    * @param sorters Ext.util.Sorter[] The array of Sorter objects
    * @returns String The encoded sorters
    */
  var encodeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], String]] = js.native
  
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var filterParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var groupDirectionParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var groupParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var idParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var limitParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var noCache: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var pageParam: js.UndefOr[String] = js.native
  
  /** [Method] Performs the given read operation  */
  @JSName("read")
  var read_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets a value in the underlying extraParams
    * @param name String The key for the new value
    * @param value Object The value
    */
  var setExtraParam: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var simpleGroupMode: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var simpleSortMode: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var sortParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var startParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  
  /** [Method] Performs the given update operation  */
  @JSName("update")
  var update_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}
object IServerProxy {
  
  @scala.inline
  def apply(): IServerProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServerProxy]
  }
  
  @scala.inline
  implicit class IServerProxyMutableBuilder[Self <: IServerProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterRequest(value: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "afterRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterRequestUndefined: Self = StObject.set(x, "afterRequest", js.undefined)
    
    @scala.inline
    def setApi(value: js.Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    @scala.inline
    def setBuildRequest(value: /* operation */ js.UndefOr[IOperation] => IRequest): Self = StObject.set(x, "buildRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuildRequestUndefined: Self = StObject.set(x, "buildRequest", js.undefined)
    
    @scala.inline
    def setBuildUrl(value: /* request */ js.UndefOr[IRequest] => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
    
    @scala.inline
    def setCacheString(value: String): Self = StObject.set(x, "cacheString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheStringUndefined: Self = StObject.set(x, "cacheString", js.undefined)
    
    @scala.inline
    def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setDirectionParam(value: String): Self = StObject.set(x, "directionParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionParamUndefined: Self = StObject.set(x, "directionParam", js.undefined)
    
    @scala.inline
    def setDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
    
    @scala.inline
    def setEncodeFilters(value: /* filters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeFiltersUndefined: Self = StObject.set(x, "encodeFilters", js.undefined)
    
    @scala.inline
    def setEncodeSorters(value: /* sorters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeSorters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeSortersUndefined: Self = StObject.set(x, "encodeSorters", js.undefined)
    
    @scala.inline
    def setExtraParams(value: js.Any): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
    
    @scala.inline
    def setFilterParam(value: String): Self = StObject.set(x, "filterParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterParamUndefined: Self = StObject.set(x, "filterParam", js.undefined)
    
    @scala.inline
    def setGroupDirectionParam(value: String): Self = StObject.set(x, "groupDirectionParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDirectionParamUndefined: Self = StObject.set(x, "groupDirectionParam", js.undefined)
    
    @scala.inline
    def setGroupParam(value: String): Self = StObject.set(x, "groupParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupParamUndefined: Self = StObject.set(x, "groupParam", js.undefined)
    
    @scala.inline
    def setIdParam(value: String): Self = StObject.set(x, "idParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdParamUndefined: Self = StObject.set(x, "idParam", js.undefined)
    
    @scala.inline
    def setLimitParam(value: String): Self = StObject.set(x, "limitParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitParamUndefined: Self = StObject.set(x, "limitParam", js.undefined)
    
    @scala.inline
    def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCacheUndefined: Self = StObject.set(x, "noCache", js.undefined)
    
    @scala.inline
    def setPageParam(value: String): Self = StObject.set(x, "pageParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageParamUndefined: Self = StObject.set(x, "pageParam", js.undefined)
    
    @scala.inline
    def setRead(value: () => Unit): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setSetExtraParam(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setExtraParam", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetExtraParamUndefined: Self = StObject.set(x, "setExtraParam", js.undefined)
    
    @scala.inline
    def setSimpleGroupMode(value: Boolean): Self = StObject.set(x, "simpleGroupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleGroupModeUndefined: Self = StObject.set(x, "simpleGroupMode", js.undefined)
    
    @scala.inline
    def setSimpleSortMode(value: Boolean): Self = StObject.set(x, "simpleSortMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleSortModeUndefined: Self = StObject.set(x, "simpleSortMode", js.undefined)
    
    @scala.inline
    def setSortParam(value: String): Self = StObject.set(x, "sortParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortParamUndefined: Self = StObject.set(x, "sortParam", js.undefined)
    
    @scala.inline
    def setStartParam(value: String): Self = StObject.set(x, "startParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartParamUndefined: Self = StObject.set(x, "startParam", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
