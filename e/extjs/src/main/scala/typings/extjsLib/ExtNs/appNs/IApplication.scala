package typings
package extjsLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplication extends IController {
  /** [Config Option] (String) */
  var appFolder: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var appProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var autoCreateViewport: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/String[]) */
  var controllers: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var enableQuickTips: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the base Ext app Application for this controller
  		* @returns Ext.app.Application the application
  		*/
  @JSName("getApplication")
  var getApplication_IApplication: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns instance of a Controller with the given id
  		* @param name Object
  		* @returns Ext.app.Controller controller instance or undefined.
  		*/
  @JSName("getController")
  var getController_IApplication: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], IController]] = js.undefined
  /** [Method] Called automatically when the page has completely loaded
  		* @param profile String The detected application profile
  		* @returns Boolean By default, the Application will dispatch to the configured startup controller and action immediately after running the launch function. Return false to prevent this behavior.
  		*/
  var launch: js.UndefOr[js.Function1[/* profile */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/String[]) */
  var namespaces: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var paths: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
}

object IApplication {
  @scala.inline
  def apply(
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    addManagedListener: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    addRef: js.Function1[/* refs */ js.UndefOr[js.Any], scala.Unit] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    appFolder: java.lang.String = null,
    appProperty: java.lang.String = null,
    application: IApplication = null,
    autoCreateViewport: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    control: js.Function2[/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    controllers: js.Any = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    enableQuickTips: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getApplication: js.Function0[IApplication] = null,
    getController: js.Function1[/* name */ js.UndefOr[js.Any], IController] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getModel: js.Function1[/* name */ js.UndefOr[java.lang.String], extjsLib.ExtNs.dataNs.IModel] = null,
    getStore: js.Function1[/* name */ js.UndefOr[java.lang.String], extjsLib.ExtNs.dataNs.IStore] = null,
    getView: js.Function1[/* name */ js.UndefOr[java.lang.String], extjsLib.ExtNs.IBase] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    hasRef: js.Function1[/* ref */ js.UndefOr[js.Any], scala.Boolean] = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    init: js.Function1[/* application */ js.UndefOr[IApplication], scala.Unit] = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IApplication] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    launch: js.Function1[/* profile */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    listen: js.Function1[/* to */ js.UndefOr[js.Any], scala.Unit] = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    models: js.Any = null,
    mon: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    mun: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    name: java.lang.String = null,
    namespaces: js.Any = null,
    on: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    onLaunch: js.Function1[/* application */ js.UndefOr[IApplication], scala.Unit] = null,
    paths: js.Any = null,
    refs: extjsLib.ExtNs.Array = null,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    removeListener: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    scope: js.Any = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    stores: js.Any = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: extjsLib.ExtNs.Array = null,
    views: js.Any = null
  ): IApplication = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (addRef != null) __obj.updateDynamic("addRef")(addRef)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (appFolder != null) __obj.updateDynamic("appFolder")(appFolder)
    if (appProperty != null) __obj.updateDynamic("appProperty")(appProperty)
    if (application != null) __obj.updateDynamic("application")(application)
    if (!js.isUndefined(autoCreateViewport)) __obj.updateDynamic("autoCreateViewport")(autoCreateViewport)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (control != null) __obj.updateDynamic("control")(control)
    if (controllers != null) __obj.updateDynamic("controllers")(controllers)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (!js.isUndefined(enableQuickTips)) __obj.updateDynamic("enableQuickTips")(enableQuickTips)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getApplication != null) __obj.updateDynamic("getApplication")(getApplication)
    if (getController != null) __obj.updateDynamic("getController")(getController)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getModel != null) __obj.updateDynamic("getModel")(getModel)
    if (getStore != null) __obj.updateDynamic("getStore")(getStore)
    if (getView != null) __obj.updateDynamic("getView")(getView)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hasRef != null) __obj.updateDynamic("hasRef")(hasRef)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(init)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (launch != null) __obj.updateDynamic("launch")(launch)
    if (listen != null) __obj.updateDynamic("listen")(listen)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (models != null) __obj.updateDynamic("models")(models)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespaces != null) __obj.updateDynamic("namespaces")(namespaces)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(onLaunch)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (refs != null) __obj.updateDynamic("refs")(refs)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stores != null) __obj.updateDynamic("stores")(stores)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[IApplication]
  }
}

