package typings.extjs.Ext.grid

import typings.extjs.Ext.Array
import typings.extjs.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionColumn
  extends typings.extjs.Ext.grid.column.IColumn {
  
  /** [Config Option] (String) */
  var altText: js.UndefOr[String] = js.native
  
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
    * @param fn Object
    * @param scope Object
    * @returns Ext.Container this
    */
  @JSName("cascade")
  var cascade_IActionColumn: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IContainer]
  ] = js.native
  
  /** [Method] Renderer closure iterates through items creating an element for each and tagging with an identifying class name x ac
    * @param v Object
    * @param meta Object
    * @param record Object
    * @param rowIdx Object
    * @param colIdx Object
    * @param store Object
    * @param view Object
    */
  @JSName("defaultRenderer")
  var defaultRenderer_IActionColumn: js.UndefOr[
    js.Function7[
      /* v */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* colIdx */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Disables this ActionColumn s action at the specified index
    * @param index Number/Ext.grid.column.Action
    * @param silent Boolean
    */
  var disableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Enables this ActionColumn s action at the specified index
    * @param index Number/Ext.grid.column.Action
    * @param silent Boolean
    */
  var enableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Config Option] (Function) */
  @JSName("getClass")
  var getClass_FIActionColumn: js.UndefOr[js.Any] = js.native
  
  /** [Method] Private override because this cannot function as a Container and it has an items property which is an Array NOT a M  */
  @JSName("getRefItems")
  var getRefItems_IActionColumn: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Function) */
  var getTip: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object[]) */
  @JSName("items")
  var items_IActionColumn: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[Boolean] = js.native
}
object IActionColumn {
  
  @scala.inline
  def apply(): IActionColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IActionColumn]
  }
  
  @scala.inline
  implicit class IActionColumnOps[Self <: IActionColumn] (val x: Self) extends AnyVal {
    
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
    def setAltText(value: String): Self = this.set("altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltText: Self = this.set("altText", js.undefined)
    
    @scala.inline
    def setCascade(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IContainer): Self = this.set("cascade", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    
    @scala.inline
    def setDefaultRenderer(
      value: (/* v */ js.UndefOr[js.Any], /* meta */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any], /* rowIdx */ js.UndefOr[js.Any], /* colIdx */ js.UndefOr[js.Any], /* store */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("defaultRenderer", js.Any.fromFunction7(value))
    
    @scala.inline
    def deleteDefaultRenderer: Self = this.set("defaultRenderer", js.undefined)
    
    @scala.inline
    def setDisableAction(value: (/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean]) => Unit): Self = this.set("disableAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDisableAction: Self = this.set("disableAction", js.undefined)
    
    @scala.inline
    def setEnableAction(value: (/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean]) => Unit): Self = this.set("enableAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEnableAction: Self = this.set("enableAction", js.undefined)
    
    @scala.inline
    def setGetClass(value: js.Any): Self = this.set("getClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetClass: Self = this.set("getClass", js.undefined)
    
    @scala.inline
    def setGetRefItems(value: () => Unit): Self = this.set("getRefItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRefItems: Self = this.set("getRefItems", js.undefined)
    
    @scala.inline
    def setGetTip(value: js.Any): Self = this.set("getTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetTip: Self = this.set("getTip", js.undefined)
    
    @scala.inline
    def setHandler(value: js.Any): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconCls(value: String): Self = this.set("iconCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconCls: Self = this.set("iconCls", js.undefined)
    
    @scala.inline
    def setItems(value: Array): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setStopSelection(value: Boolean): Self = this.set("stopSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopSelection: Self = this.set("stopSelection", js.undefined)
  }
}
