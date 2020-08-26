package typings.extjs.Ext.data

import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(): IProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProxy]
  }
  @scala.inline
  implicit class IProxyOps[Self <: IProxy] (val x: Self) extends AnyVal {
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
    def setBatch(value: /* options */ js.UndefOr[js.Any] => IBatch): Self = this.set("batch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    @scala.inline
    def setBatchActions(value: Boolean): Self = this.set("batchActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchActions: Self = this.set("batchActions", js.undefined)
    @scala.inline
    def setBatchOrder(value: String): Self = this.set("batchOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchOrder: Self = this.set("batchOrder", js.undefined)
    @scala.inline
    def setCreate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("create", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDestroy(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("destroy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setGetModel(value: () => IModel): Self = this.set("getModel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetModel: Self = this.set("getModel", js.undefined)
    @scala.inline
    def setGetReader(value: () => typings.extjs.Ext.data.reader.IReader): Self = this.set("getReader", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetReader: Self = this.set("getReader", js.undefined)
    @scala.inline
    def setGetWriter(value: () => typings.extjs.Ext.data.writer.IWriter): Self = this.set("getWriter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWriter: Self = this.set("getWriter", js.undefined)
    @scala.inline
    def setIsProxy(value: Boolean): Self = this.set("isProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsProxy: Self = this.set("isProxy", js.undefined)
    @scala.inline
    def setIsSynchronous(value: Boolean): Self = this.set("isSynchronous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSynchronous: Self = this.set("isSynchronous", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRead(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("read", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setReader(value: js.Any): Self = this.set("reader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReader: Self = this.set("reader", js.undefined)
    @scala.inline
    def setSetModel(value: (/* model */ js.UndefOr[js.Any], /* setOnStore */ js.UndefOr[Boolean]) => Unit): Self = this.set("setModel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetModel: Self = this.set("setModel", js.undefined)
    @scala.inline
    def setSetReader(value: /* reader */ js.UndefOr[js.Any] => typings.extjs.Ext.data.reader.IReader): Self = this.set("setReader", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetReader: Self = this.set("setReader", js.undefined)
    @scala.inline
    def setSetWriter(value: /* writer */ js.UndefOr[js.Any] => typings.extjs.Ext.data.writer.IWriter): Self = this.set("setWriter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetWriter: Self = this.set("setWriter", js.undefined)
    @scala.inline
    def setUpdate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("update", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setWriter(value: js.Any): Self = this.set("writer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriter: Self = this.set("writer", js.undefined)
  }
  
}

