package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IServerProxyOps[Self <: IServerProxy] (val x: Self) extends AnyVal {
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
    def setAfterRequest(value: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit): Self = this.set("afterRequest", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterRequest: Self = this.set("afterRequest", js.undefined)
    @scala.inline
    def setApi(value: js.Any): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    @scala.inline
    def setBuildRequest(value: /* operation */ js.UndefOr[IOperation] => IRequest): Self = this.set("buildRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBuildRequest: Self = this.set("buildRequest", js.undefined)
    @scala.inline
    def setBuildUrl(value: /* request */ js.UndefOr[IRequest] => String): Self = this.set("buildUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBuildUrl: Self = this.set("buildUrl", js.undefined)
    @scala.inline
    def setCacheString(value: String): Self = this.set("cacheString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheString: Self = this.set("cacheString", js.undefined)
    @scala.inline
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDirectionParam(value: String): Self = this.set("directionParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionParam: Self = this.set("directionParam", js.undefined)
    @scala.inline
    def setDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("doRequest", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDoRequest: Self = this.set("doRequest", js.undefined)
    @scala.inline
    def setEncodeFilters(value: /* filters */ js.UndefOr[Array] => String): Self = this.set("encodeFilters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEncodeFilters: Self = this.set("encodeFilters", js.undefined)
    @scala.inline
    def setEncodeSorters(value: /* sorters */ js.UndefOr[Array] => String): Self = this.set("encodeSorters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEncodeSorters: Self = this.set("encodeSorters", js.undefined)
    @scala.inline
    def setExtraParams(value: js.Any): Self = this.set("extraParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraParams: Self = this.set("extraParams", js.undefined)
    @scala.inline
    def setFilterParam(value: String): Self = this.set("filterParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterParam: Self = this.set("filterParam", js.undefined)
    @scala.inline
    def setGroupDirectionParam(value: String): Self = this.set("groupDirectionParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupDirectionParam: Self = this.set("groupDirectionParam", js.undefined)
    @scala.inline
    def setGroupParam(value: String): Self = this.set("groupParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupParam: Self = this.set("groupParam", js.undefined)
    @scala.inline
    def setIdParam(value: String): Self = this.set("idParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdParam: Self = this.set("idParam", js.undefined)
    @scala.inline
    def setLimitParam(value: String): Self = this.set("limitParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitParam: Self = this.set("limitParam", js.undefined)
    @scala.inline
    def setNoCache(value: Boolean): Self = this.set("noCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCache: Self = this.set("noCache", js.undefined)
    @scala.inline
    def setPageParam(value: String): Self = this.set("pageParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageParam: Self = this.set("pageParam", js.undefined)
    @scala.inline
    def setRead(value: () => Unit): Self = this.set("read", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setSetExtraParam(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = this.set("setExtraParam", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetExtraParam: Self = this.set("setExtraParam", js.undefined)
    @scala.inline
    def setSimpleGroupMode(value: Boolean): Self = this.set("simpleGroupMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleGroupMode: Self = this.set("simpleGroupMode", js.undefined)
    @scala.inline
    def setSimpleSortMode(value: Boolean): Self = this.set("simpleSortMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleSortMode: Self = this.set("simpleSortMode", js.undefined)
    @scala.inline
    def setSortParam(value: String): Self = this.set("sortParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortParam: Self = this.set("sortParam", js.undefined)
    @scala.inline
    def setStartParam(value: String): Self = this.set("startParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartParam: Self = this.set("startParam", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

