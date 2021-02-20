package typings.extjs.Ext.data

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataProxy extends IObservable {
  
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
object IDataProxy {
  
  @scala.inline
  def apply(): IDataProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataProxy]
  }
  
  @scala.inline
  implicit class IDataProxyMutableBuilder[Self <: IDataProxy] (val x: Self) extends AnyVal {
    
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
