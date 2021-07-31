package typings.extjs.Ext

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IElementLoader
  extends StObject
     with IObservable {
  
  /** [Method] Aborts the active load request */
  var abort: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var ajaxOptions: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Destroys the loader  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var failure: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Returns the target of this loader
    * @returns Ext.Component The target or null if none exists.
    */
  var getTarget: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Checks whether the loader is automatically refreshing
    * @returns Boolean True if the loader is automatically refreshing
    */
  var isAutoRefreshing: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Property] (Boolean) */
  var isLoader: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Loads new data from the server
    * @param options Object The options for the request. They can be any configuration option that can be specified for the class, with the exception of the target option. Note that any options passed to the method will override any class defaults.
    */
  var load: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean/String) */
  var loadMask: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var scripts: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets an Ext Element as the target of this loader
    * @param target String/HTMLElement/Ext.Element The element or its ID.
    */
  var setTarget: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Automatically refreshes the content over a specified period
    * @param interval Number The interval to refresh in ms.
    * @param options Object The options to pass to the load method. See load
    */
  var startAutoRefresh: js.UndefOr[
    js.Function2[/* interval */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Method] Clears any auto refresh  */
  var stopAutoRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Function) */
  var success: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (HTMLElement/Ext.Element/String) */
  var target: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}
object IElementLoader {
  
  @scala.inline
  def apply(): IElementLoader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementLoader]
  }
  
  @scala.inline
  implicit class IElementLoaderMutableBuilder[Self <: IElementLoader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    @scala.inline
    def setAjaxOptions(value: js.Any): Self = StObject.set(x, "ajaxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxOptionsUndefined: Self = StObject.set(x, "ajaxOptions", js.undefined)
    
    @scala.inline
    def setAutoLoad(value: js.Any): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    @scala.inline
    def setBaseParams(value: js.Any): Self = StObject.set(x, "baseParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseParamsUndefined: Self = StObject.set(x, "baseParams", js.undefined)
    
    @scala.inline
    def setCallback(value: js.Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setFailure(value: js.Any): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    @scala.inline
    def setGetTarget(value: () => IComponent): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetUndefined: Self = StObject.set(x, "getTarget", js.undefined)
    
    @scala.inline
    def setIsAutoRefreshing(value: () => Boolean): Self = StObject.set(x, "isAutoRefreshing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAutoRefreshingUndefined: Self = StObject.set(x, "isAutoRefreshing", js.undefined)
    
    @scala.inline
    def setIsLoader(value: Boolean): Self = StObject.set(x, "isLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoaderUndefined: Self = StObject.set(x, "isLoader", js.undefined)
    
    @scala.inline
    def setLoad(value: /* options */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadMask(value: js.Any): Self = StObject.set(x, "loadMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadMaskUndefined: Self = StObject.set(x, "loadMask", js.undefined)
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setRenderer(value: js.Any): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    @scala.inline
    def setSetTarget(value: /* target */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTargetUndefined: Self = StObject.set(x, "setTarget", js.undefined)
    
    @scala.inline
    def setStartAutoRefresh(value: (/* interval */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "startAutoRefresh", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartAutoRefreshUndefined: Self = StObject.set(x, "startAutoRefresh", js.undefined)
    
    @scala.inline
    def setStopAutoRefresh(value: () => Unit): Self = StObject.set(x, "stopAutoRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopAutoRefreshUndefined: Self = StObject.set(x, "stopAutoRefresh", js.undefined)
    
    @scala.inline
    def setSuccess(value: js.Any): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
