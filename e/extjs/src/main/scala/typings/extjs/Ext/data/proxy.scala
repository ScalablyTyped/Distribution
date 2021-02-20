package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxy {
  
  @js.native
  trait IAjax extends IServer {
    
    /** [Property] (Object) */
    var actionMethods: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var binary: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns the HTTP method name for a given request
      * @param request Ext.data.Request The request object
      * @returns String The HTTP method to use (should be one of 'GET', 'POST', 'PUT' or 'DELETE')
      */
    var getMethod: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.native
    
    /** [Config Option] (Object) */
    var headers: js.UndefOr[js.Any] = js.native
  }
  object IAjax {
    
    @scala.inline
    def apply(): IAjax = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAjax]
    }
    
    @scala.inline
    implicit class IAjaxMutableBuilder[Self <: IAjax] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionMethods(value: js.Any): Self = StObject.set(x, "actionMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionMethodsUndefined: Self = StObject.set(x, "actionMethods", js.undefined)
      
      @scala.inline
      def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setGetMethod(value: /* request */ js.UndefOr[IRequest] => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  @js.native
  trait IClient
    extends typings.extjs.Ext.data.proxy.IProxy {
    
    /** [Method] Abstract function that must be implemented by each ClientProxy subclass  */
    var clear: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object IClient {
    
    @scala.inline
    def apply(): IClient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClient]
    }
    
    @scala.inline
    implicit class IClientMutableBuilder[Self <: IClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    }
  }
  
  @js.native
  trait IDirect extends IServer {
    
    /** [Method] inherit docs
      * @returns String The url
      */
    @JSName("buildUrl")
    var buildUrl_IDirect: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Config Option] (Function/String) */
    var directFn: js.UndefOr[js.Any] = js.native
    
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
      ] = js.native
    
    /** [Config Option] (String/String[]) */
    var paramOrder: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var paramsAsHash: js.UndefOr[Boolean] = js.native
  }
  object IDirect {
    
    @scala.inline
    def apply(): IDirect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDirect]
    }
    
    @scala.inline
    implicit class IDirectMutableBuilder[Self <: IDirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuildUrl(value: () => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
      
      @scala.inline
      def setDirectFn(value: js.Any): Self = StObject.set(x, "directFn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectFnUndefined: Self = StObject.set(x, "directFn", js.undefined)
      
      @scala.inline
      def setDoRequest(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
      
      @scala.inline
      def setParamOrder(value: js.Any): Self = StObject.set(x, "paramOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamOrderUndefined: Self = StObject.set(x, "paramOrder", js.undefined)
      
      @scala.inline
      def setParamsAsHash(value: Boolean): Self = StObject.set(x, "paramsAsHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsAsHashUndefined: Self = StObject.set(x, "paramsAsHash", js.undefined)
    }
  }
  
  @js.native
  trait IJsonP extends IServer {
    
    /** [Method] Aborts the current server request if one is currently running */
    var abort: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var autoAppendParams: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var callbackKey: js.UndefOr[String] = js.native
    
    /** [Method] Encodes an array of records into a value suitable to be added to the request params as the recordParam parameter
      * @param records Ext.data.Model[] The records array
      * @returns Array An array of record data objects
      */
    var encodeRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Array]] = js.native
    
    /** [Config Option] (String) */
    var recordParam: js.UndefOr[String] = js.native
  }
  object IJsonP {
    
    @scala.inline
    def apply(): typings.extjs.Ext.data.proxy.IJsonP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.data.proxy.IJsonP]
    }
    
    @scala.inline
    implicit class IJsonPMutableBuilder[Self <: typings.extjs.Ext.data.proxy.IJsonP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      @scala.inline
      def setAutoAppendParams(value: Boolean): Self = StObject.set(x, "autoAppendParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAppendParamsUndefined: Self = StObject.set(x, "autoAppendParams", js.undefined)
      
      @scala.inline
      def setCallbackKey(value: String): Self = StObject.set(x, "callbackKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackKeyUndefined: Self = StObject.set(x, "callbackKey", js.undefined)
      
      @scala.inline
      def setEncodeRecords(value: /* records */ js.UndefOr[Array] => Array): Self = StObject.set(x, "encodeRecords", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeRecordsUndefined: Self = StObject.set(x, "encodeRecords", js.undefined)
      
      @scala.inline
      def setRecordParam(value: String): Self = StObject.set(x, "recordParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordParamUndefined: Self = StObject.set(x, "recordParam", js.undefined)
    }
  }
  
  type ILocalStorage = IWebStorage
  
  @js.native
  trait IMemory extends IClient {
    
    /** [Config Option] (Object) */
    var data: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var enablePaging: js.UndefOr[Boolean] = js.native
  }
  object IMemory {
    
    @scala.inline
    def apply(): IMemory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMemory]
    }
    
    @scala.inline
    implicit class IMemoryMutableBuilder[Self <: IMemory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEnablePaging(value: Boolean): Self = StObject.set(x, "enablePaging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePagingUndefined: Self = StObject.set(x, "enablePaging", js.undefined)
    }
  }
  
  @js.native
  trait IProxy extends IObservable {
    
    /** [Method] Performs a batch of Operations in the order specified by batchOrder
      * @param options Object Object containing one or more properties supported by the batch method:
      * @returns Ext.data.Batch The newly created Batch
      */
    var batch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBatch]] = js.native
    
    /** [Config Option] (Boolean) */
    var batchActions: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var batchOrder: js.UndefOr[String] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    /** [Method] Returns the model attached to this Proxy
      * @returns Ext.data.Model The model
      */
    var getModel: js.UndefOr[js.Function0[IModel]] = js.native
    
    /** [Method] Returns the reader currently attached to this proxy instance
      * @returns Ext.data.reader.Reader The Reader instance
      */
    var getReader: js.UndefOr[js.Function0[typings.extjs.Ext.data.reader.IReader]] = js.native
    
    /** [Method] Returns the writer currently attached to this proxy instance
      * @returns Ext.data.writer.Writer The Writer instance
      */
    var getWriter: js.UndefOr[js.Function0[typings.extjs.Ext.data.writer.IWriter]] = js.native
    
    /** [Property] (Boolean) */
    var isProxy: js.UndefOr[Boolean] = js.native
    
    /** [Property] (Boolean) */
    var isSynchronous: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String/Ext.data.Model) */
    var model: js.UndefOr[js.Any] = js.native
    
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
      ] = js.native
    
    /** [Config Option] (Object/String/Ext.data.reader.Reader) */
    var reader: js.UndefOr[js.Any] = js.native
    
    /** [Method] Sets the model associated with this proxy
      * @param model String/Ext.data.Model The new model. Can be either the model name string, or a reference to the model's constructor
      * @param setOnStore Boolean Sets the new model on the associated Store, if one is present
      */
    var setModel: js.UndefOr[
        js.Function2[/* model */ js.UndefOr[js.Any], /* setOnStore */ js.UndefOr[Boolean], Unit]
      ] = js.native
    
    /** [Method] Sets the Proxy s Reader by string config object or Reader instance
      * @param reader String/Object/Ext.data.reader.Reader The new Reader, which can be either a type string, a configuration object or an Ext.data.reader.Reader instance
      * @returns Ext.data.reader.Reader The attached Reader object
      */
    var setReader: js.UndefOr[
        js.Function1[/* reader */ js.UndefOr[js.Any], typings.extjs.Ext.data.reader.IReader]
      ] = js.native
    
    /** [Method] Sets the Proxy s Writer by string config object or Writer instance
      * @param writer String/Object/Ext.data.writer.Writer The new Writer, which can be either a type string, a configuration object or an Ext.data.writer.Writer instance
      * @returns Ext.data.writer.Writer The attached Writer object
      */
    var setWriter: js.UndefOr[
        js.Function1[/* writer */ js.UndefOr[js.Any], typings.extjs.Ext.data.writer.IWriter]
      ] = js.native
    
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
      ] = js.native
    
    /** [Config Option] (Object/String/Ext.data.writer.Writer) */
    var writer: js.UndefOr[js.Any] = js.native
  }
  object IProxy {
    
    @scala.inline
    def apply(): typings.extjs.Ext.data.proxy.IProxy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.data.proxy.IProxy]
    }
    
    @scala.inline
    implicit class IProxyMutableBuilder[Self <: typings.extjs.Ext.data.proxy.IProxy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatch(value: /* options */ js.UndefOr[js.Any] => IBatch): Self = StObject.set(x, "batch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBatchActions(value: Boolean): Self = StObject.set(x, "batchActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchActionsUndefined: Self = StObject.set(x, "batchActions", js.undefined)
      
      @scala.inline
      def setBatchOrder(value: String): Self = StObject.set(x, "batchOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchOrderUndefined: Self = StObject.set(x, "batchOrder", js.undefined)
      
      @scala.inline
      def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      @scala.inline
      def setCreate(
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setGetModel(value: () => IModel): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
      
      @scala.inline
      def setGetReader(value: () => typings.extjs.Ext.data.reader.IReader): Self = StObject.set(x, "getReader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetReaderUndefined: Self = StObject.set(x, "getReader", js.undefined)
      
      @scala.inline
      def setGetWriter(value: () => typings.extjs.Ext.data.writer.IWriter): Self = StObject.set(x, "getWriter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWriterUndefined: Self = StObject.set(x, "getWriter", js.undefined)
      
      @scala.inline
      def setIsProxy(value: Boolean): Self = StObject.set(x, "isProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsProxyUndefined: Self = StObject.set(x, "isProxy", js.undefined)
      
      @scala.inline
      def setIsSynchronous(value: Boolean): Self = StObject.set(x, "isSynchronous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSynchronousUndefined: Self = StObject.set(x, "isSynchronous", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRead(
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setReader(value: js.Any): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReaderUndefined: Self = StObject.set(x, "reader", js.undefined)
      
      @scala.inline
      def setSetModel(value: (/* model */ js.UndefOr[js.Any], /* setOnStore */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetModelUndefined: Self = StObject.set(x, "setModel", js.undefined)
      
      @scala.inline
      def setSetReader(value: /* reader */ js.UndefOr[js.Any] => typings.extjs.Ext.data.reader.IReader): Self = StObject.set(x, "setReader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetReaderUndefined: Self = StObject.set(x, "setReader", js.undefined)
      
      @scala.inline
      def setSetWriter(value: /* writer */ js.UndefOr[js.Any] => typings.extjs.Ext.data.writer.IWriter): Self = StObject.set(x, "setWriter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWriterUndefined: Self = StObject.set(x, "setWriter", js.undefined)
      
      @scala.inline
      def setUpdate(
        value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setWriter(value: js.Any): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
    }
  }
  
  @js.native
  trait IRest extends IAjax {
    
    /** [Config Option] (Boolean) */
    var appendId: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var format: js.UndefOr[String] = js.native
  }
  object IRest {
    
    @scala.inline
    def apply(): IRest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRest]
    }
    
    @scala.inline
    implicit class IRestMutableBuilder[Self <: IRest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendId(value: Boolean): Self = StObject.set(x, "appendId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendIdUndefined: Self = StObject.set(x, "appendId", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  @js.native
  trait IServer
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
    var create_IServer: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Performs the given destroy operation  */
    @JSName("destroy")
    var destroy_IServer: js.UndefOr[js.Function0[Unit]] = js.native
    
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
    var read_IServer: js.UndefOr[js.Function0[Unit]] = js.native
    
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
    var update_IServer: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (String) */
    var url: js.UndefOr[String] = js.native
  }
  object IServer {
    
    @scala.inline
    def apply(): IServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IServer]
    }
    
    @scala.inline
    implicit class IServerMutableBuilder[Self <: IServer] (val x: Self) extends AnyVal {
      
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
  
  type ISessionStorage = IWebStorage
  
  @js.native
  trait IWebStorage extends IClient {
    
    /** [Property] (Object) */
    var cache: js.UndefOr[js.Any] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    /** [Config Option] (String) */
    var id: js.UndefOr[String] = js.native
    
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
      ] = js.native
    
    /** [Method] Saves the given record in the Proxy
      * @param record Ext.data.Model The model instance
      * @param id String The id to save the record under (defaults to the value of the record's getId() function)
      */
    var setRecord: js.UndefOr[js.Function2[/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String], Unit]] = js.native
    
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
      ] = js.native
  }
  object IWebStorage {
    
    @scala.inline
    def apply(): IWebStorage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebStorage]
    }
    
    @scala.inline
    implicit class IWebStorageMutableBuilder[Self <: IWebStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCreate(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "destroy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setRead(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setSetRecord(value: (/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
      
      @scala.inline
      def setUpdate(
        value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
