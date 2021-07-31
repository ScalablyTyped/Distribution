package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.data.proxy.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScriptTagProxy
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
object IScriptTagProxy {
  
  @scala.inline
  def apply(): IScriptTagProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScriptTagProxy]
  }
  
  @scala.inline
  implicit class IScriptTagProxyMutableBuilder[Self <: IScriptTagProxy] (val x: Self) extends AnyVal {
    
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
