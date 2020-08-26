package typings.extjs.Ext.data

import typings.extjs.Ext.data.proxy.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IWebStorageProxyOps[Self <: IWebStorageProxy] (val x: Self) extends AnyVal {
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
    def setCache(value: js.Any): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCreate(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("create", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDestroy(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("destroy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setRead(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("read", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setSetRecord(value: (/* record */ js.UndefOr[IModel], /* id */ js.UndefOr[String]) => Unit): Self = this.set("setRecord", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetRecord: Self = this.set("setRecord", js.undefined)
    @scala.inline
    def setUpdate(
      value: (/* operation */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("update", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

