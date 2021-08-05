package typings.extjs.Ext.data

import typings.extjs.Ext.data.proxy.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebStorageProxy
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
  var create_IWebStorageProxy: js.UndefOr[
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
  var destroy_IWebStorageProxy: js.UndefOr[
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
  var read_IWebStorageProxy: js.UndefOr[
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
  var update_IWebStorageProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}
object IWebStorageProxy {
  
  inline def apply(): IWebStorageProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebStorageProxy]
  }
  
  extension [Self <: IWebStorageProxy](x: Self) {
    
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
