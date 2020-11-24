package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstractPlugin extends IBase {
  
  /** [Method] Creates clone of the plugin
    * @param overrideCfg Object Additional config for the derived plugin.
    */
  var clonePlugin: js.UndefOr[js.Function1[/* overrideCfg */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] The destroy method is invoked by the owning Component at the time the Component is being destroyed  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] The base implementation just sets the plugin s disabled flag to true Plugin subclasses which need more complex proce  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] The base implementation just sets the plugin s disabled flag to false Plugin subclasses which need more complex proc  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the component to which this plugin is attached
    * @returns Ext.Component Owner component.
    */
  var getCmp: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
    * @param client Ext.Component The client Component which owns this plugin.
    */
  var init: js.UndefOr[js.Function1[/* client */ js.UndefOr[IComponent], Unit]] = js.native
  
  /** [Property] (Boolean) */
  var isPlugin: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var pluginId: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Sets the component to which this plugin is attached
    * @param cmp Ext.Component Owner component.
    */
  var setCmp: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[IComponent], Unit]] = js.native
}
object IAbstractPlugin {
  
  @scala.inline
  def apply(): IAbstractPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractPlugin]
  }
  
  @scala.inline
  implicit class IAbstractPluginOps[Self <: IAbstractPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClonePlugin(value: /* overrideCfg */ js.UndefOr[js.Any] => Unit): Self = this.set("clonePlugin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClonePlugin: Self = this.set("clonePlugin", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setGetCmp(value: () => IComponent): Self = this.set("getCmp", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCmp: Self = this.set("getCmp", js.undefined)
    
    @scala.inline
    def setInit(value: /* client */ js.UndefOr[IComponent] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setIsPlugin(value: Boolean): Self = this.set("isPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPlugin: Self = this.set("isPlugin", js.undefined)
    
    @scala.inline
    def setPluginId(value: java.lang.String): Self = this.set("pluginId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginId: Self = this.set("pluginId", js.undefined)
    
    @scala.inline
    def setSetCmp(value: /* cmp */ js.UndefOr[IComponent] => Unit): Self = this.set("setCmp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCmp: Self = this.set("setCmp", js.undefined)
  }
}
