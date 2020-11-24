package typings.extjs.Ext

import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IElementLoader extends IObservable {
  
  /** [Method] Aborts the active load request */
  var abort: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Object) */
  var ajaxOptions: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.native
  
  /** [Method] Destroys the loader  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Function) */
  var failure: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the target of this loader
    * @returns Ext.Component The target or null if none exists.
    */
  var getTarget: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Checks whether the loader is automatically refreshing
    * @returns Boolean True if the loader is automatically refreshing
    */
  var isAutoRefreshing: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Property] (Boolean) */
  var isLoader: js.UndefOr[Boolean] = js.native
  
  /** [Method] Loads new data from the server
    * @param options Object The options for the request. They can be any configuration option that can be specified for the class, with the exception of the target option. Note that any options passed to the method will override any class defaults.
    */
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean/String) */
  var loadMask: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var scripts: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets an Ext Element as the target of this loader
    * @param target String/HTMLElement/Ext.Element The element or its ID.
    */
  var setTarget: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Automatically refreshes the content over a specified period
    * @param interval Number The interval to refresh in ms.
    * @param options Object The options to pass to the load method. See load
    */
  var startAutoRefresh: js.UndefOr[
    js.Function2[/* interval */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Clears any auto refresh  */
  var stopAutoRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Function) */
  var success: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (HTMLElement/Ext.Element/String) */
  var target: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.native
}
object IElementLoader {
  
  @scala.inline
  def apply(): IElementLoader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementLoader]
  }
  
  @scala.inline
  implicit class IElementLoaderOps[Self <: IElementLoader] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    
    @scala.inline
    def setAjaxOptions(value: js.Any): Self = this.set("ajaxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxOptions: Self = this.set("ajaxOptions", js.undefined)
    
    @scala.inline
    def setAutoLoad(value: js.Any): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    
    @scala.inline
    def setBaseParams(value: js.Any): Self = this.set("baseParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseParams: Self = this.set("baseParams", js.undefined)
    
    @scala.inline
    def setCallback(value: js.Any): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setFailure(value: js.Any): Self = this.set("failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    
    @scala.inline
    def setGetTarget(value: () => IComponent): Self = this.set("getTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTarget: Self = this.set("getTarget", js.undefined)
    
    @scala.inline
    def setIsAutoRefreshing(value: () => Boolean): Self = this.set("isAutoRefreshing", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsAutoRefreshing: Self = this.set("isAutoRefreshing", js.undefined)
    
    @scala.inline
    def setIsLoader(value: Boolean): Self = this.set("isLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLoader: Self = this.set("isLoader", js.undefined)
    
    @scala.inline
    def setLoad(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoadMask(value: js.Any): Self = this.set("loadMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMask: Self = this.set("loadMask", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setRenderer(value: js.Any): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setScripts(value: Boolean): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    
    @scala.inline
    def setSetTarget(value: /* target */ js.UndefOr[js.Any] => Unit): Self = this.set("setTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTarget: Self = this.set("setTarget", js.undefined)
    
    @scala.inline
    def setStartAutoRefresh(value: (/* interval */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("startAutoRefresh", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStartAutoRefresh: Self = this.set("startAutoRefresh", js.undefined)
    
    @scala.inline
    def setStopAutoRefresh(value: () => Unit): Self = this.set("stopAutoRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStopAutoRefresh: Self = this.set("stopAutoRefresh", js.undefined)
    
    @scala.inline
    def setSuccess(value: js.Any): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
