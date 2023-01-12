package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServerProxy
  extends StObject
     with typings.extjs.Ext.data.proxy.IProxy {
  
  /** [Method] Optional callback function which can be used to clean up after a request has been completed
    * @param request Ext.data.Request The Request object
    * @param success Boolean True if the request was successful
    */
  var afterRequest: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Config Option] (Object) */
  var api: js.UndefOr[Any] = js.undefined
  
  /** [Method] Creates an Request object from Operation
    * @param operation Ext.data.Operation The operation to execute
    * @returns Ext.data.Request The request object
    */
  var buildRequest: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], IRequest]] = js.undefined
  
  /** [Method] Generates a url based on a given Ext data Request object
    * @param request Ext.data.Request The request object
    * @returns String The url
    */
  var buildUrl: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.undefined
  
  /** [Config Option] (String) */
  var cacheString: js.UndefOr[String] = js.undefined
  
  /** [Method] in a ServerProxy all four CRUD operations are executed in the same manner so we delegate to doRequest in each case */
  @JSName("create")
  var create_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Performs the given destroy operation  */
  @JSName("destroy")
  var destroy_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var directionParam: js.UndefOr[String] = js.undefined
  
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
    * @param operation Ext.data.Operation The Ext.data.Operation object
    * @param callback Function The callback function to call when the Operation has completed
    * @param scope Object The scope in which to execute the callback
    */
  var doRequest: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
    * @param filters Ext.util.Filter[] The array of Filter objects
    * @returns String The encoded filters
    */
  var encodeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], String]] = js.undefined
  
  /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
    * @param sorters Ext.util.Sorter[] The array of Sorter objects
    * @returns String The encoded sorters
    */
  var encodeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], String]] = js.undefined
  
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var filterParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var groupDirectionParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var groupParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var idParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var limitParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var noCache: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var pageParam: js.UndefOr[String] = js.undefined
  
  /** [Method] Performs the given read operation  */
  @JSName("read")
  var read_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets a value in the underlying extraParams
    * @param name String The key for the new value
    * @param value Object The value
    */
  var setExtraParam: js.UndefOr[js.Function2[/* name */ js.UndefOr[String], /* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var simpleGroupMode: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var simpleSortMode: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var sortParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var startParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** [Method] Performs the given update operation  */
  @JSName("update")
  var update_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
}
object IServerProxy {
  
  inline def apply(): IServerProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServerProxy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IServerProxy] (val x: Self) extends AnyVal {
    
    inline def setAfterRequest(value: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "afterRequest", js.Any.fromFunction2(value))
    
    inline def setAfterRequestUndefined: Self = StObject.set(x, "afterRequest", js.undefined)
    
    inline def setApi(value: Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setBuildRequest(value: /* operation */ js.UndefOr[IOperation] => IRequest): Self = StObject.set(x, "buildRequest", js.Any.fromFunction1(value))
    
    inline def setBuildRequestUndefined: Self = StObject.set(x, "buildRequest", js.undefined)
    
    inline def setBuildUrl(value: /* request */ js.UndefOr[IRequest] => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction1(value))
    
    inline def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
    
    inline def setCacheString(value: String): Self = StObject.set(x, "cacheString", value.asInstanceOf[js.Any])
    
    inline def setCacheStringUndefined: Self = StObject.set(x, "cacheString", js.undefined)
    
    inline def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDirectionParam(value: String): Self = StObject.set(x, "directionParam", value.asInstanceOf[js.Any])
    
    inline def setDirectionParamUndefined: Self = StObject.set(x, "directionParam", js.undefined)
    
    inline def setDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
    
    inline def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
    
    inline def setEncodeFilters(value: /* filters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeFilters", js.Any.fromFunction1(value))
    
    inline def setEncodeFiltersUndefined: Self = StObject.set(x, "encodeFilters", js.undefined)
    
    inline def setEncodeSorters(value: /* sorters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeSorters", js.Any.fromFunction1(value))
    
    inline def setEncodeSortersUndefined: Self = StObject.set(x, "encodeSorters", js.undefined)
    
    inline def setExtraParams(value: Any): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
    
    inline def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
    
    inline def setFilterParam(value: String): Self = StObject.set(x, "filterParam", value.asInstanceOf[js.Any])
    
    inline def setFilterParamUndefined: Self = StObject.set(x, "filterParam", js.undefined)
    
    inline def setGroupDirectionParam(value: String): Self = StObject.set(x, "groupDirectionParam", value.asInstanceOf[js.Any])
    
    inline def setGroupDirectionParamUndefined: Self = StObject.set(x, "groupDirectionParam", js.undefined)
    
    inline def setGroupParam(value: String): Self = StObject.set(x, "groupParam", value.asInstanceOf[js.Any])
    
    inline def setGroupParamUndefined: Self = StObject.set(x, "groupParam", js.undefined)
    
    inline def setIdParam(value: String): Self = StObject.set(x, "idParam", value.asInstanceOf[js.Any])
    
    inline def setIdParamUndefined: Self = StObject.set(x, "idParam", js.undefined)
    
    inline def setLimitParam(value: String): Self = StObject.set(x, "limitParam", value.asInstanceOf[js.Any])
    
    inline def setLimitParamUndefined: Self = StObject.set(x, "limitParam", js.undefined)
    
    inline def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
    
    inline def setNoCacheUndefined: Self = StObject.set(x, "noCache", js.undefined)
    
    inline def setPageParam(value: String): Self = StObject.set(x, "pageParam", value.asInstanceOf[js.Any])
    
    inline def setPageParamUndefined: Self = StObject.set(x, "pageParam", js.undefined)
    
    inline def setRead(value: () => Unit): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setSetExtraParam(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "setExtraParam", js.Any.fromFunction2(value))
    
    inline def setSetExtraParamUndefined: Self = StObject.set(x, "setExtraParam", js.undefined)
    
    inline def setSimpleGroupMode(value: Boolean): Self = StObject.set(x, "simpleGroupMode", value.asInstanceOf[js.Any])
    
    inline def setSimpleGroupModeUndefined: Self = StObject.set(x, "simpleGroupMode", js.undefined)
    
    inline def setSimpleSortMode(value: Boolean): Self = StObject.set(x, "simpleSortMode", value.asInstanceOf[js.Any])
    
    inline def setSimpleSortModeUndefined: Self = StObject.set(x, "simpleSortMode", js.undefined)
    
    inline def setSortParam(value: String): Self = StObject.set(x, "sortParam", value.asInstanceOf[js.Any])
    
    inline def setSortParamUndefined: Self = StObject.set(x, "sortParam", js.undefined)
    
    inline def setStartParam(value: String): Self = StObject.set(x, "startParam", value.asInstanceOf[js.Any])
    
    inline def setStartParamUndefined: Self = StObject.set(x, "startParam", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
