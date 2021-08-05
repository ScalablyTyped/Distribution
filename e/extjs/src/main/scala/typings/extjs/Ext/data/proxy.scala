package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxy {
  
  trait IAjax
    extends StObject
       with IServer {
    
    /** [Property] (Object) */
    var actionMethods: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var binary: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns the HTTP method name for a given request
      * @param request Ext.data.Request The request object
      * @returns String The HTTP method to use (should be one of 'GET', 'POST', 'PUT' or 'DELETE')
      */
    var getMethod: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.undefined
    
    /** [Config Option] (Object) */
    var headers: js.UndefOr[js.Any] = js.undefined
  }
  object IAjax {
    
    inline def apply(): IAjax = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAjax]
    }
    
    extension [Self <: IAjax](x: Self) {
      
      inline def setActionMethods(value: js.Any): Self = StObject.set(x, "actionMethods", value.asInstanceOf[js.Any])
      
      inline def setActionMethodsUndefined: Self = StObject.set(x, "actionMethods", js.undefined)
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setGetMethod(value: /* request */ js.UndefOr[IRequest] => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction1(value))
      
      inline def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
      
      inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  trait IClient
    extends StObject
       with typings.extjs.Ext.data.proxy.IProxy {
    
    /** [Method] Abstract function that must be implemented by each ClientProxy subclass  */
    var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IClient {
    
    inline def apply(): IClient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClient]
    }
    
    extension [Self <: IClient](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    }
  }
  
  trait IDirect
    extends StObject
       with IServer {
    
    /** [Method] inherit docs
      * @returns String The url
      */
    @JSName("buildUrl")
    var buildUrl_IDirect: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Config Option] (Function/String) */
    var directFn: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("doRequest")
    var doRequest_IDirect: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (String/String[]) */
    var paramOrder: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var paramsAsHash: js.UndefOr[Boolean] = js.undefined
  }
  object IDirect {
    
    inline def apply(): IDirect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDirect]
    }
    
    extension [Self <: IDirect](x: Self) {
      
      inline def setBuildUrl(value: () => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction0(value))
      
      inline def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
      
      inline def setDirectFn(value: js.Any): Self = StObject.set(x, "directFn", value.asInstanceOf[js.Any])
      
      inline def setDirectFnUndefined: Self = StObject.set(x, "directFn", js.undefined)
      
      inline def setDoRequest(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
      
      inline def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
      
      inline def setParamOrder(value: js.Any): Self = StObject.set(x, "paramOrder", value.asInstanceOf[js.Any])
      
      inline def setParamOrderUndefined: Self = StObject.set(x, "paramOrder", js.undefined)
      
      inline def setParamsAsHash(value: Boolean): Self = StObject.set(x, "paramsAsHash", value.asInstanceOf[js.Any])
      
      inline def setParamsAsHashUndefined: Self = StObject.set(x, "paramsAsHash", js.undefined)
    }
  }
  
  trait IJsonP
    extends StObject
       with IServer {
    
    /** [Method] Aborts the current server request if one is currently running */
    var abort: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var autoAppendParams: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var callbackKey: js.UndefOr[String] = js.undefined
    
    /** [Method] Encodes an array of records into a value suitable to be added to the request params as the recordParam parameter
      * @param records Ext.data.Model[] The records array
      * @returns Array An array of record data objects
      */
    var encodeRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Array]] = js.undefined
    
    /** [Config Option] (String) */
    var recordParam: js.UndefOr[String] = js.undefined
  }
  object IJsonP {
    
    inline def apply(): typings.extjs.Ext.data.proxy.IJsonP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.data.proxy.IJsonP]
    }
    
    extension [Self <: typings.extjs.Ext.data.proxy.IJsonP](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      inline def setAutoAppendParams(value: Boolean): Self = StObject.set(x, "autoAppendParams", value.asInstanceOf[js.Any])
      
      inline def setAutoAppendParamsUndefined: Self = StObject.set(x, "autoAppendParams", js.undefined)
      
      inline def setCallbackKey(value: String): Self = StObject.set(x, "callbackKey", value.asInstanceOf[js.Any])
      
      inline def setCallbackKeyUndefined: Self = StObject.set(x, "callbackKey", js.undefined)
      
      inline def setEncodeRecords(value: /* records */ js.UndefOr[Array] => Array): Self = StObject.set(x, "encodeRecords", js.Any.fromFunction1(value))
      
      inline def setEncodeRecordsUndefined: Self = StObject.set(x, "encodeRecords", js.undefined)
      
      inline def setRecordParam(value: String): Self = StObject.set(x, "recordParam", value.asInstanceOf[js.Any])
      
      inline def setRecordParamUndefined: Self = StObject.set(x, "recordParam", js.undefined)
    }
  }
  
  type ILocalStorage = IWebStorage
  
  trait IMemory
    extends StObject
       with IClient {
    
    /** [Config Option] (Object) */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var enablePaging: js.UndefOr[Boolean] = js.undefined
  }
  object IMemory {
    
    inline def apply(): IMemory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMemory]
    }
    
    extension [Self <: IMemory](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEnablePaging(value: Boolean): Self = StObject.set(x, "enablePaging", value.asInstanceOf[js.Any])
      
      inline def setEnablePagingUndefined: Self = StObject.set(x, "enablePaging", js.undefined)
    }
  }
  
  trait IProxy
    extends StObject
       with IObservable {
    
    /** [Method] Performs a batch of Operations in the order specified by batchOrder
      * @param options Object Object containing one or more properties supported by the batch method:
      * @returns Ext.data.Batch The newly created Batch
      */
    var batch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBatch]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var batchActions: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var batchOrder: js.UndefOr[String] = js.undefined
    
    /** [Method] Performs the given create operation
      * @param operation Ext.data.Operation The Operation to perform
      * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
      * @param scope Object Scope to execute the callback function in
      */
    var create: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[IOperation], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Performs the given destroy operation
      * @param operation Ext.data.Operation The Operation to perform
      * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
      * @param scope Object Scope to execute the callback function in
      */
    var destroy: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[IOperation], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Returns the model attached to this Proxy
      * @returns Ext.data.Model The model
      */
    var getModel: js.UndefOr[js.Function0[IModel]] = js.undefined
    
    /** [Method] Returns the reader currently attached to this proxy instance
      * @returns Ext.data.reader.Reader The Reader instance
      */
    var getReader: js.UndefOr[js.Function0[typings.extjs.Ext.data.reader.IReader]] = js.undefined
    
    /** [Method] Returns the writer currently attached to this proxy instance
      * @returns Ext.data.writer.Writer The Writer instance
      */
    var getWriter: js.UndefOr[js.Function0[typings.extjs.Ext.data.writer.IWriter]] = js.undefined
    
    /** [Property] (Boolean) */
    var isProxy: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (Boolean) */
    var isSynchronous: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String/Ext.data.Model) */
    var model: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Performs the given read operation
      * @param operation Ext.data.Operation The Operation to perform
      * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
      * @param scope Object Scope to execute the callback function in
      */
    var read: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[IOperation], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (Object/String/Ext.data.reader.Reader) */
    var reader: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Sets the model associated with this proxy
      * @param model String/Ext.data.Model The new model. Can be either the model name string, or a reference to the model's constructor
      * @param setOnStore Boolean Sets the new model on the associated Store, if one is present
      */
    var setModel: js.UndefOr[
        js.Function2[/* model */ js.UndefOr[js.Any], /* setOnStore */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Method] Sets the Proxy s Reader by string config object or Reader instance
      * @param reader String/Object/Ext.data.reader.Reader The new Reader, which can be either a type string, a configuration object or an Ext.data.reader.Reader instance
      * @returns Ext.data.reader.Reader The attached Reader object
      */
    var setReader: js.UndefOr[
        js.Function1[/* reader */ js.UndefOr[js.Any], typings.extjs.Ext.data.reader.IReader]
      ] = js.undefined
    
    /** [Method] Sets the Proxy s Writer by string config object or Writer instance
      * @param writer String/Object/Ext.data.writer.Writer The new Writer, which can be either a type string, a configuration object or an Ext.data.writer.Writer instance
      * @returns Ext.data.writer.Writer The attached Writer object
      */
    var setWriter: js.UndefOr[
        js.Function1[/* writer */ js.UndefOr[js.Any], typings.extjs.Ext.data.writer.IWriter]
      ] = js.undefined
    
    /** [Method] Performs the given update operation
      * @param operation Ext.data.Operation The Operation to perform
      * @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
      * @param scope Object Scope to execute the callback function in
      */
    var update: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[IOperation], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (Object/String/Ext.data.writer.Writer) */
    var writer: js.UndefOr[js.Any] = js.undefined
  }
  object IProxy {
    
    inline def apply(): typings.extjs.Ext.data.proxy.IProxy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.data.proxy.IProxy]
    }
    
    extension [Self <: typings.extjs.Ext.data.proxy.IProxy](x: Self) {
      
      inline def setBatch(value: /* options */ js.UndefOr[js.Any] => IBatch): Self = StObject.set(x, "batch", js.Any.fromFunction1(value))
      
      inline def setBatchActions(value: Boolean): Self = StObject.set(x, "batchActions", value.asInstanceOf[js.Any])
      
      inline def setBatchActionsUndefined: Self = StObject.set(x, "batchActions", js.undefined)
      
      inline def setBatchOrder(value: String): Self = StObject.set(x, "batchOrder", value.asInstanceOf[js.Any])
      
      inline def setBatchOrderUndefined: Self = StObject.set(x, "batchOrder", js.undefined)
      
      inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      inline def setCreate(
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDestroy(
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setGetModel(value: () => IModel): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
      
      inline def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
      
      inline def setGetReader(value: () => typings.extjs.Ext.data.reader.IReader): Self = StObject.set(x, "getReader", js.Any.fromFunction0(value))
      
      inline def setGetReaderUndefined: Self = StObject.set(x, "getReader", js.undefined)
      
      inline def setGetWriter(value: () => typings.extjs.Ext.data.writer.IWriter): Self = StObject.set(x, "getWriter", js.Any.fromFunction0(value))
      
      inline def setGetWriterUndefined: Self = StObject.set(x, "getWriter", js.undefined)
      
      inline def setIsProxy(value: Boolean): Self = StObject.set(x, "isProxy", value.asInstanceOf[js.Any])
      
      inline def setIsProxyUndefined: Self = StObject.set(x, "isProxy", js.undefined)
      
      inline def setIsSynchronous(value: Boolean): Self = StObject.set(x, "isSynchronous", value.asInstanceOf[js.Any])
      
      inline def setIsSynchronousUndefined: Self = StObject.set(x, "isSynchronous", js.undefined)
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRead(
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setReader(value: js.Any): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
      
      inline def setReaderUndefined: Self = StObject.set(x, "reader", js.undefined)
      
      inline def setSetModel(value: (/* model */ js.UndefOr[js.Any], /* setOnStore */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction2(value))
      
      inline def setSetModelUndefined: Self = StObject.set(x, "setModel", js.undefined)
      
      inline def setSetReader(value: /* reader */ js.UndefOr[js.Any] => typings.extjs.Ext.data.reader.IReader): Self = StObject.set(x, "setReader", js.Any.fromFunction1(value))
      
      inline def setSetReaderUndefined: Self = StObject.set(x, "setReader", js.undefined)
      
      inline def setSetWriter(value: /* writer */ js.UndefOr[js.Any] => typings.extjs.Ext.data.writer.IWriter): Self = StObject.set(x, "setWriter", js.Any.fromFunction1(value))
      
      inline def setSetWriterUndefined: Self = StObject.set(x, "setWriter", js.undefined)
      
      inline def setUpdate(
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setWriter(value: js.Any): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
      
      inline def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
    }
  }
  
  trait IRest
    extends StObject
       with IAjax {
    
    /** [Config Option] (Boolean) */
    var appendId: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var format: js.UndefOr[String] = js.undefined
  }
  object IRest {
    
    inline def apply(): IRest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRest]
    }
    
    extension [Self <: IRest](x: Self) {
      
      inline def setAppendId(value: Boolean): Self = StObject.set(x, "appendId", value.asInstanceOf[js.Any])
      
      inline def setAppendIdUndefined: Self = StObject.set(x, "appendId", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  trait IServer
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
    var api: js.UndefOr[js.Any] = js.undefined
    
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
    var create_IServer: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Performs the given destroy operation  */
    @JSName("destroy")
    var destroy_IServer: js.UndefOr[js.Function0[Unit]] = js.undefined
    
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
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
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
    var extraParams: js.UndefOr[js.Any] = js.undefined
    
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
    var read_IServer: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Sets a value in the underlying extraParams
      * @param name String The key for the new value
      * @param value Object The value
      */
    var setExtraParam: js.UndefOr[
        js.Function2[/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
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
    var update_IServer: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var url: js.UndefOr[String] = js.undefined
  }
  object IServer {
    
    inline def apply(): IServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IServer]
    }
    
    extension [Self <: IServer](x: Self) {
      
      inline def setAfterRequest(value: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "afterRequest", js.Any.fromFunction2(value))
      
      inline def setAfterRequestUndefined: Self = StObject.set(x, "afterRequest", js.undefined)
      
      inline def setApi(value: js.Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
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
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
      
      inline def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
      
      inline def setEncodeFilters(value: /* filters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeFilters", js.Any.fromFunction1(value))
      
      inline def setEncodeFiltersUndefined: Self = StObject.set(x, "encodeFilters", js.undefined)
      
      inline def setEncodeSorters(value: /* sorters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeSorters", js.Any.fromFunction1(value))
      
      inline def setEncodeSortersUndefined: Self = StObject.set(x, "encodeSorters", js.undefined)
      
      inline def setExtraParams(value: js.Any): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
      
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
      
      inline def setSetExtraParam(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setExtraParam", js.Any.fromFunction2(value))
      
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
  
  type ISessionStorage = IWebStorage
  
  trait IWebStorage
    extends StObject
       with IClient {
    
    /** [Property] (Object) */
    var cache: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] inherit docs
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("create")
    var create_IWebStorage: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] inherit
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("destroy")
    var destroy_IWebStorage: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (String) */
    var id: js.UndefOr[String] = js.undefined
    
    /** [Method] inherit docs
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("read")
    var read_IWebStorage: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Saves the given record in the Proxy
      * @param record Ext.data.Model The model instance
      * @param id String The id to save the record under (defaults to the value of the record's getId() function)
      */
    var setRecord: js.UndefOr[js.Function2[/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] inherit docs
      * @param operation Object
      * @param callback Object
      * @param scope Object
      */
    @JSName("update")
    var update_IWebStorage: js.UndefOr[
        js.Function3[
          /* operation */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
  }
  object IWebStorage {
    
    inline def apply(): IWebStorage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebStorage]
    }
    
    extension [Self <: IWebStorage](x: Self) {
      
      inline def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCreate(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDestroy(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRead(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setSetRecord(value: (/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction2(value))
      
      inline def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
      
      inline def setUpdate(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
