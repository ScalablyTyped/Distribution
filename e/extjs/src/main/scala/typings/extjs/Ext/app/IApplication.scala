package typings.extjs.Ext.app

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplication extends IController {
  /** [Config Option] (String) */
  var appFolder: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var appProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var autoCreateViewport: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/String[]) */
  var controllers: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var enableQuickTips: js.UndefOr[Boolean] = js.undefined
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
  var launch: js.UndefOr[js.Function1[/* profile */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
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
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addRef: /* refs */ js.UndefOr[js.Any] => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    appFolder: java.lang.String = null,
    appProperty: java.lang.String = null,
    application: IApplication = null,
    autoCreateViewport: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    config: js.Any = null,
    control: (/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any]) => Unit = null,
    controllers: js.Any = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    enableQuickTips: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getApplication: () => IApplication = null,
    getController: /* name */ js.UndefOr[js.Any] => IController = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getModel: /* name */ js.UndefOr[java.lang.String] => IModel = null,
    getStore: /* name */ js.UndefOr[java.lang.String] => IStore = null,
    getView: /* name */ js.UndefOr[java.lang.String] => IBase = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListeners: js.Any = null,
    hasRef: /* ref */ js.UndefOr[js.Any] => Boolean = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    init: /* application */ js.UndefOr[IApplication] => Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IApplication = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    launch: /* profile */ js.UndefOr[java.lang.String] => Boolean = null,
    listen: /* to */ js.UndefOr[js.Any] => Unit = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    models: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    name: java.lang.String = null,
    namespaces: js.Any = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    onLaunch: /* application */ js.UndefOr[IApplication] => Unit = null,
    paths: js.Any = null,
    refs: Array = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    scope: js.Any = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stores: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    views: js.Any = null
  ): IApplication = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (addRef != null) __obj.updateDynamic("addRef")(js.Any.fromFunction1(addRef))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (appFolder != null) __obj.updateDynamic("appFolder")(appFolder)
    if (appProperty != null) __obj.updateDynamic("appProperty")(appProperty)
    if (application != null) __obj.updateDynamic("application")(application)
    if (!js.isUndefined(autoCreateViewport)) __obj.updateDynamic("autoCreateViewport")(autoCreateViewport)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (control != null) __obj.updateDynamic("control")(js.Any.fromFunction2(control))
    if (controllers != null) __obj.updateDynamic("controllers")(controllers)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (!js.isUndefined(enableQuickTips)) __obj.updateDynamic("enableQuickTips")(enableQuickTips)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getApplication != null) __obj.updateDynamic("getApplication")(js.Any.fromFunction0(getApplication))
    if (getController != null) __obj.updateDynamic("getController")(js.Any.fromFunction1(getController))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction1(getModel))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction1(getStore))
    if (getView != null) __obj.updateDynamic("getView")(js.Any.fromFunction1(getView))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (hasRef != null) __obj.updateDynamic("hasRef")(js.Any.fromFunction1(hasRef))
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (launch != null) __obj.updateDynamic("launch")(js.Any.fromFunction1(launch))
    if (listen != null) __obj.updateDynamic("listen")(js.Any.fromFunction1(listen))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (models != null) __obj.updateDynamic("models")(models)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespaces != null) __obj.updateDynamic("namespaces")(namespaces)
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(js.Any.fromFunction1(onLaunch))
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (refs != null) __obj.updateDynamic("refs")(refs)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stores != null) __obj.updateDynamic("stores")(stores)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[IApplication]
  }
}

