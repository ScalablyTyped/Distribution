package typings.extjs.Ext

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object app {
  
  trait EventBus extends StObject
  
  trait IApplication
    extends StObject
       with IController {
    
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
    
    inline def apply(): IApplication = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IApplication]
    }
    
    extension [Self <: IApplication](x: Self) {
      
      inline def setAppFolder(value: java.lang.String): Self = StObject.set(x, "appFolder", value.asInstanceOf[js.Any])
      
      inline def setAppFolderUndefined: Self = StObject.set(x, "appFolder", js.undefined)
      
      inline def setAppProperty(value: java.lang.String): Self = StObject.set(x, "appProperty", value.asInstanceOf[js.Any])
      
      inline def setAppPropertyUndefined: Self = StObject.set(x, "appProperty", js.undefined)
      
      inline def setAutoCreateViewport(value: Boolean): Self = StObject.set(x, "autoCreateViewport", value.asInstanceOf[js.Any])
      
      inline def setAutoCreateViewportUndefined: Self = StObject.set(x, "autoCreateViewport", js.undefined)
      
      inline def setControllers(value: js.Any): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
      
      inline def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
      
      inline def setEnableQuickTips(value: Boolean): Self = StObject.set(x, "enableQuickTips", value.asInstanceOf[js.Any])
      
      inline def setEnableQuickTipsUndefined: Self = StObject.set(x, "enableQuickTips", js.undefined)
      
      inline def setGetApplication(value: () => IApplication): Self = StObject.set(x, "getApplication", js.Any.fromFunction0(value))
      
      inline def setGetApplicationUndefined: Self = StObject.set(x, "getApplication", js.undefined)
      
      inline def setGetController(value: /* name */ js.UndefOr[js.Any] => IController): Self = StObject.set(x, "getController", js.Any.fromFunction1(value))
      
      inline def setGetControllerUndefined: Self = StObject.set(x, "getController", js.undefined)
      
      inline def setLaunch(value: /* profile */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "launch", js.Any.fromFunction1(value))
      
      inline def setLaunchUndefined: Self = StObject.set(x, "launch", js.undefined)
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNamespaces(value: js.Any): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
      
      inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
      
      inline def setPaths(value: js.Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait IController
    extends StObject
       with IObservable {
    
    /** [Method] Registers one or more references
      * @param refs Object/Object[]
      */
    var addRef: js.UndefOr[js.Function1[/* refs */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Property] (Ext.app.Application) */
    var application: js.UndefOr[IApplication] = js.undefined
    
    /** [Method] Adds listeners to components selected via Ext ComponentQuery
      * @param selectors String/Object If a String, the second argument is used as the listeners, otherwise an object of selectors -> listeners is assumed
      * @param listeners Object Config for listeners.
      */
    var control: js.UndefOr[
        js.Function2[/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Method] Returns the base Ext app Application for this controller
      * @returns Ext.app.Application the application
      */
    var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
    
    /** [Method] Returns instance of a Controller with the given id
      * @param id String
      * @returns Ext.app.Controller controller instance or undefined.
      */
    var getController: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], this.type]] = js.undefined
    
    /** [Method] Returns a Model class with the given name
      * @param name String
      * @returns Ext.data.Model a model class.
      */
    var getModel: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], IModel]] = js.undefined
    
    /** [Method] Returns instance of a Store with the given name
      * @param name String
      * @returns Ext.data.Store a store instance.
      */
    var getStore: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], IStore]] = js.undefined
    
    /** [Method] Returns a View class with the given name
      * @param name String
      * @returns Ext.Base a view class.
      */
    var getView: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], IBase]] = js.undefined
    
    /** [Method] Returns true if a reference is registered
      * @param ref Object
      * @returns Boolean
      */
    var hasRef: js.UndefOr[js.Function1[/* ref */ js.UndefOr[js.Any], Boolean]] = js.undefined
    
    /** [Config Option] (String) */
    var id: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] A template method that is called when your application boots
      * @param application Ext.app.Application
      */
    var init: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.undefined
    
    /** [Method] Adds listeners to different event sources also called event domains
      * @param to Object Config object containing domains, selectors and listeners.
      */
    var listen: js.UndefOr[js.Function1[/* to */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (String/String[]) */
    var models: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] A template method like init but called after the viewport is created
      * @param application Ext.app.Application
      */
    var onLaunch: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.undefined
    
    /** [Config Option] (Object[]) */
    var refs: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (String/String[]) */
    var stores: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String/String[]) */
    var views: js.UndefOr[js.Any] = js.undefined
  }
  object IController {
    
    inline def apply(): IController = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IController]
    }
    
    extension [Self <: IController](x: Self) {
      
      inline def setAddRef(value: /* refs */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addRef", js.Any.fromFunction1(value))
      
      inline def setAddRefUndefined: Self = StObject.set(x, "addRef", js.undefined)
      
      inline def setApplication(value: IApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      inline def setControl(value: (/* selectors */ js.UndefOr[js.Any], /* listeners */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "control", js.Any.fromFunction2(value))
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setGetApplication(value: () => IApplication): Self = StObject.set(x, "getApplication", js.Any.fromFunction0(value))
      
      inline def setGetApplicationUndefined: Self = StObject.set(x, "getApplication", js.undefined)
      
      inline def setGetController(value: /* id */ js.UndefOr[java.lang.String] => IController): Self = StObject.set(x, "getController", js.Any.fromFunction1(value))
      
      inline def setGetControllerUndefined: Self = StObject.set(x, "getController", js.undefined)
      
      inline def setGetModel(value: /* name */ js.UndefOr[java.lang.String] => IModel): Self = StObject.set(x, "getModel", js.Any.fromFunction1(value))
      
      inline def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
      
      inline def setGetStore(value: /* name */ js.UndefOr[java.lang.String] => IStore): Self = StObject.set(x, "getStore", js.Any.fromFunction1(value))
      
      inline def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
      
      inline def setGetView(value: /* name */ js.UndefOr[java.lang.String] => IBase): Self = StObject.set(x, "getView", js.Any.fromFunction1(value))
      
      inline def setGetViewUndefined: Self = StObject.set(x, "getView", js.undefined)
      
      inline def setHasRef(value: /* ref */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "hasRef", js.Any.fromFunction1(value))
      
      inline def setHasRefUndefined: Self = StObject.set(x, "hasRef", js.undefined)
      
      inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInit(value: /* application */ js.UndefOr[IApplication] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setListen(value: /* to */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      inline def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
      
      inline def setModels(value: js.Any): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
      
      inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
      
      inline def setOnLaunch(value: /* application */ js.UndefOr[IApplication] => Unit): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1(value))
      
      inline def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
      
      inline def setRefs(value: Array): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
      
      inline def setStores(value: js.Any): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
      
      inline def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
      
      inline def setViews(value: js.Any): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
  
  type IEventBus = IBase
  
  trait IEventDomain
    extends StObject
       with IBase {
    
    /** [Config Option] (String) */
    var idProperty: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Property] (Object) */
    var instances: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] This method matches the firer of the event the target to the given selector
      * @param target Object The firer of the event.
      * @param selector String The selector to which to match the target.
      * @returns Boolean true if the target matches the selector.
      */
    var `match`: js.UndefOr[
        js.Function2[
          /* target */ js.UndefOr[js.Any], 
          /* selector */ js.UndefOr[java.lang.String], 
          Boolean
        ]
      ] = js.undefined
    
    /** [Method] This method is called by the derived class to monitor fireEvent calls
      * @param observable Ext.Class The Observable to monitor for events.
      */
    var monitor: js.UndefOr[js.Function1[/* observable */ js.UndefOr[IClass], Unit]] = js.undefined
  }
  object IEventDomain {
    
    inline def apply(): IEventDomain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEventDomain]
    }
    
    extension [Self <: IEventDomain](x: Self) {
      
      inline def setIdProperty(value: java.lang.String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
      
      inline def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
      
      inline def setInstances(value: js.Any): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
      
      inline def setMatch(value: (/* target */ js.UndefOr[js.Any], /* selector */ js.UndefOr[java.lang.String]) => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMonitor(value: /* observable */ js.UndefOr[IClass] => Unit): Self = StObject.set(x, "monitor", js.Any.fromFunction1(value))
      
      inline def setMonitorUndefined: Self = StObject.set(x, "monitor", js.undefined)
    }
  }
  
  object domain {
    
    trait Component extends StObject
    
    trait Controller extends StObject
    
    trait Direct extends StObject
    
    trait Global extends StObject
    
    type IComponent = IEventDomain
    
    type IController = IEventDomain
    
    type IDirect = IEventDomain
    
    type IGlobal = IEventDomain
    
    type IStore = IEventDomain
    
    trait Store extends StObject
  }
}
