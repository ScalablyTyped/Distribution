package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDataProxy
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Performs a batch of Operations in the order specified by batchOrder
  		* @param options Object Object containing one or more properties supported by the batch method:
  		* @returns Ext.data.Batch The newly created Batch
  		*/
  var batch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBatch]] = js.undefined
  /** [Config Option] (Boolean) */
  var batchActions: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var batchOrder: js.UndefOr[java.lang.String] = js.undefined
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
      scala.Unit
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Returns the model attached to this Proxy
  		* @returns Ext.data.Model The model
  		*/
  var getModel: js.UndefOr[js.Function0[IModel]] = js.undefined
  /** [Method] Returns the reader currently attached to this proxy instance
  		* @returns Ext.data.reader.Reader The Reader instance
  		*/
  var getReader: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.readerNs.IReader]] = js.undefined
  /** [Method] Returns the writer currently attached to this proxy instance
  		* @returns Ext.data.writer.Writer The Writer instance
  		*/
  var getWriter: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.writerNs.IWriter]] = js.undefined
  /** [Property] (Boolean) */
  var isProxy: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isSynchronous: js.UndefOr[scala.Boolean] = js.undefined
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object/String/Ext.data.reader.Reader) */
  var reader: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the model associated with this proxy
  		* @param model String/Ext.data.Model The new model. Can be either the model name string, or a reference to the model's constructor
  		* @param setOnStore Boolean Sets the new model on the associated Store, if one is present
  		*/
  var setModel: js.UndefOr[
    js.Function2[
      /* model */ js.UndefOr[js.Any], 
      /* setOnStore */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the Proxy s Reader by string config object or Reader instance
  		* @param reader String/Object/Ext.data.reader.Reader The new Reader, which can be either a type string, a configuration object or an Ext.data.reader.Reader instance
  		* @returns Ext.data.reader.Reader The attached Reader object
  		*/
  var setReader: js.UndefOr[
    js.Function1[/* reader */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.readerNs.IReader]
  ] = js.undefined
  /** [Method] Sets the Proxy s Writer by string config object or Writer instance
  		* @param writer String/Object/Ext.data.writer.Writer The new Writer, which can be either a type string, a configuration object or an Ext.data.writer.Writer instance
  		* @returns Ext.data.writer.Writer The attached Writer object
  		*/
  var setWriter: js.UndefOr[
    js.Function1[/* writer */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.writerNs.IWriter]
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object/String/Ext.data.writer.Writer) */
  var writer: js.UndefOr[js.Any] = js.undefined
}

