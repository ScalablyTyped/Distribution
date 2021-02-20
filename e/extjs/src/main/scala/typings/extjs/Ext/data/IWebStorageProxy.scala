package typings.extjs.Ext.data

import typings.extjs.Ext.data.proxy.IClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebStorageProxy extends IClient {
  
  /** [Property] (Object) */
  var cache: js.UndefOr[js.Any] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  
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
  var update_IWebStorageProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object IWebStorageProxy {
  
  @scala.inline
  def apply(): IWebStorageProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebStorageProxy]
  }
  
  @scala.inline
  implicit class IWebStorageProxyMutableBuilder[Self <: IWebStorageProxy] (val x: Self) extends AnyVal {
    
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
