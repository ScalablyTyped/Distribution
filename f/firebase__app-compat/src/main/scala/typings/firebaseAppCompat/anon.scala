package typings.firebaseAppCompat

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAppCompat.distAppCompatMod.FirebaseApp
import typings.firebaseAppCompat.distAppCompatMod.FirebaseAppContructor
import typings.firebaseAppCompat.mod.FirebaseService
import typings.firebaseAppCompat.mod.FirebaseServiceNamespace
import typings.firebaseComponent.distSrcTypesMod.Name
import typings.firebaseComponent.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait App extends StObject {
    
    /**
      * Retrieve an instance of a FirebaseApp.
      *
      * Usage: firebase.app()
      *
      * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
      */
    def apply(): FirebaseApp = js.native
    def apply(name: String): FirebaseApp = js.native
    
    /**
      * For testing FirebaseApp instances:
      *  app() instanceof firebase.app.App
      *
      * DO NOT call this constuctor directly (use firebase.app() instead).
      */
    var App: FirebaseAppContructor = js.native
  }
  
  trait AppName extends StObject {
    
    var appName: String
  }
  object AppName {
    
    inline def apply(appName: String): AppName = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppName]
    }
    
    extension [Self <: AppName](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    /**
      * Retrieve an instance of a FirebaseApp.
      *
      * Usage: firebase.app()
      *
      * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
      */
    def apply(): typings.firebaseAppCompat.mod.FirebaseApp = js.native
    def apply(name: String): typings.firebaseAppCompat.mod.FirebaseApp = js.native
    
    /**
      * For testing FirebaseApp instances:
      *  app() instanceof firebase.app.App
      *
      * DO NOT call this constuctor directly (use firebase.app() instead).
      */
    var App: typings.firebaseAppCompat.mod.FirebaseAppContructor = js.native
  }
  
  @js.native
  trait CallApp extends StObject {
    
    /**
      * Retrieve an instance of a FirebaseApp.
      *
      * Usage: firebase.app()
      *
      * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
      */
    def apply(): typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp = js.native
    def apply(name: String): typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp = js.native
    
    /**
      * For testing FirebaseApp instances:
      *  app() instanceof firebase.app.App
      *
      * DO NOT call this constuctor directly (use firebase.app() instead).
      */
    var App: typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseAppContructor = js.native
  }
  
  @js.native
  trait CallName extends StObject {
    
    /**
      * Retrieve an instance of a FirebaseApp.
      *
      * Usage: firebase.app()
      *
      * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
      */
    def apply(): typings.firebaseAppCompat.distSrcPublicTypesMod.FirebaseApp = js.native
    def apply(name: String): typings.firebaseAppCompat.distSrcPublicTypesMod.FirebaseApp = js.native
    
    /**
      * For testing FirebaseApp instances:
      *  app() instanceof firebase.app.App
      *
      * DO NOT call this constuctor directly (use firebase.app() instead).
      */
    var App: typings.firebaseAppCompat.distSrcPublicTypesMod.FirebaseAppContructor = js.native
  }
  
  trait Dictindex
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    /**
      * Internal API to register a Firebase Service into the firebase namespace.
      *
      * Each service will create a child namespace (firebase.<name>) which acts as
      * both a namespace for service specific properties, and also as a service
      * accessor function (firebase.<name>() or firebase.<name>(app)).
      *
      * @param name The Firebase Service being registered.
      * @param createService Factory function to create a service instance.
      * @param serviceProperties Properties to copy to the service's namespace.
      * @param appHook All appHooks called before initializeApp returns to caller.
      * @param allowMultipleInstances Whether the registered service supports
      *   multiple instances per app. If not specified, the default is false.
      */
    def registerComponent[T /* <: Name */](component: Component[T]): FirebaseServiceNamespace[FirebaseService] | Null
    
    /**
      * Internal API to remove an app from the list of registered apps.
      */
    def removeApp(name: String): Unit
    
    def useAsService(app: typings.firebaseAppCompat.mod.FirebaseApp, serviceName: String): String | Null
  }
  object Dictindex {
    
    inline def apply(
      registerComponent: Component[Any] => FirebaseServiceNamespace[FirebaseService] | Null,
      removeApp: String => Unit,
      useAsService: (typings.firebaseAppCompat.mod.FirebaseApp, String) => String | Null
    ): Dictindex = {
      val __obj = js.Dynamic.literal(registerComponent = js.Any.fromFunction1(registerComponent), removeApp = js.Any.fromFunction1(removeApp), useAsService = js.Any.fromFunction2(useAsService))
      __obj.asInstanceOf[Dictindex]
    }
    
    extension [Self <: Dictindex](x: Self) {
      
      inline def setRegisterComponent(value: Component[Any] => FirebaseServiceNamespace[FirebaseService] | Null): Self = StObject.set(x, "registerComponent", js.Any.fromFunction1(value))
      
      inline def setRemoveApp(value: String => Unit): Self = StObject.set(x, "removeApp", js.Any.fromFunction1(value))
      
      inline def setUseAsService(value: (typings.firebaseAppCompat.mod.FirebaseApp, String) => String | Null): Self = StObject.set(x, "useAsService", js.Any.fromFunction2(value))
    }
  }
  
  trait RegisterComponent
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    /**
      * Internal API to register a Firebase Service into the firebase namespace.
      *
      * Each service will create a child namespace (firebase.<name>) which acts as
      * both a namespace for service specific properties, and also as a service
      * accessor function (firebase.<name>() or firebase.<name>(app)).
      *
      * @param name The Firebase Service being registered.
      * @param createService Factory function to create a service instance.
      * @param serviceProperties Properties to copy to the service's namespace.
      * @param appHook All appHooks called before initializeApp returns to caller.
      * @param allowMultipleInstances Whether the registered service supports
      *   multiple instances per app. If not specified, the default is false.
      */
    def registerComponent[T /* <: Name */](component: Component[T]): typings.firebaseAppCompat.distAppCompatMod.FirebaseServiceNamespace[typings.firebaseAppCompat.distAppCompatMod.FirebaseService] | Null
    
    /**
      * Internal API to remove an app from the list of registered apps.
      */
    def removeApp(name: String): Unit
    
    def useAsService(app: FirebaseApp, serviceName: String): String | Null
  }
  object RegisterComponent {
    
    inline def apply(
      registerComponent: Component[Any] => typings.firebaseAppCompat.distAppCompatMod.FirebaseServiceNamespace[typings.firebaseAppCompat.distAppCompatMod.FirebaseService] | Null,
      removeApp: String => Unit,
      useAsService: (FirebaseApp, String) => String | Null
    ): RegisterComponent = {
      val __obj = js.Dynamic.literal(registerComponent = js.Any.fromFunction1(registerComponent), removeApp = js.Any.fromFunction1(removeApp), useAsService = js.Any.fromFunction2(useAsService))
      __obj.asInstanceOf[RegisterComponent]
    }
    
    extension [Self <: RegisterComponent](x: Self) {
      
      inline def setRegisterComponent(
        value: Component[Any] => typings.firebaseAppCompat.distAppCompatMod.FirebaseServiceNamespace[typings.firebaseAppCompat.distAppCompatMod.FirebaseService] | Null
      ): Self = StObject.set(x, "registerComponent", js.Any.fromFunction1(value))
      
      inline def setRemoveApp(value: String => Unit): Self = StObject.set(x, "removeApp", js.Any.fromFunction1(value))
      
      inline def setUseAsService(value: (FirebaseApp, String) => String | Null): Self = StObject.set(x, "useAsService", js.Any.fromFunction2(value))
    }
  }
  
  trait RemoveApp
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    /**
      * Internal API to register a Firebase Service into the firebase namespace.
      *
      * Each service will create a child namespace (firebase.<name>) which acts as
      * both a namespace for service specific properties, and also as a service
      * accessor function (firebase.<name>() or firebase.<name>(app)).
      *
      * @param name The Firebase Service being registered.
      * @param createService Factory function to create a service instance.
      * @param serviceProperties Properties to copy to the service's namespace.
      * @param appHook All appHooks called before initializeApp returns to caller.
      * @param allowMultipleInstances Whether the registered service supports
      *   multiple instances per app. If not specified, the default is false.
      */
    def registerComponent[T /* <: Name */](component: Component[T]): typings.firebaseAppCompat.distEsmSrcTypesMod.FirebaseServiceNamespace[typings.firebaseAppCompat.distEsmSrcTypesMod.FirebaseService] | Null
    
    /**
      * Internal API to remove an app from the list of registered apps.
      */
    def removeApp(name: String): Unit
    
    def useAsService(app: typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp, serviceName: String): String | Null
  }
  object RemoveApp {
    
    inline def apply(
      registerComponent: Component[Any] => typings.firebaseAppCompat.distEsmSrcTypesMod.FirebaseServiceNamespace[typings.firebaseAppCompat.distEsmSrcTypesMod.FirebaseService] | Null,
      removeApp: String => Unit,
      useAsService: (typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp, String) => String | Null
    ): RemoveApp = {
      val __obj = js.Dynamic.literal(registerComponent = js.Any.fromFunction1(registerComponent), removeApp = js.Any.fromFunction1(removeApp), useAsService = js.Any.fromFunction2(useAsService))
      __obj.asInstanceOf[RemoveApp]
    }
    
    extension [Self <: RemoveApp](x: Self) {
      
      inline def setRegisterComponent(
        value: Component[Any] => typings.firebaseAppCompat.distEsmSrcTypesMod.FirebaseServiceNamespace[typings.firebaseAppCompat.distEsmSrcTypesMod.FirebaseService] | Null
      ): Self = StObject.set(x, "registerComponent", js.Any.fromFunction1(value))
      
      inline def setRemoveApp(value: String => Unit): Self = StObject.set(x, "removeApp", js.Any.fromFunction1(value))
      
      inline def setUseAsService(value: (typings.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp, String) => String | Null): Self = StObject.set(x, "useAsService", js.Any.fromFunction2(value))
    }
  }
  
  trait UseAsService
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    /**
      * Internal API to register a Firebase Service into the firebase namespace.
      *
      * Each service will create a child namespace (firebase.<name>) which acts as
      * both a namespace for service specific properties, and also as a service
      * accessor function (firebase.<name>() or firebase.<name>(app)).
      *
      * @param name The Firebase Service being registered.
      * @param createService Factory function to create a service instance.
      * @param serviceProperties Properties to copy to the service's namespace.
      * @param appHook All appHooks called before initializeApp returns to caller.
      * @param allowMultipleInstances Whether the registered service supports
      *   multiple instances per app. If not specified, the default is false.
      */
    def registerComponent[T /* <: Name */](component: Component[T]): typings.firebaseAppCompat.distSrcTypesMod.FirebaseServiceNamespace[typings.firebaseAppCompat.distSrcTypesMod.FirebaseService] | Null
    
    /**
      * Internal API to remove an app from the list of registered apps.
      */
    def removeApp(name: String): Unit
    
    def useAsService(app: typings.firebaseAppCompat.distSrcPublicTypesMod.FirebaseApp, serviceName: String): String | Null
  }
  object UseAsService {
    
    inline def apply(
      registerComponent: Component[Any] => typings.firebaseAppCompat.distSrcTypesMod.FirebaseServiceNamespace[typings.firebaseAppCompat.distSrcTypesMod.FirebaseService] | Null,
      removeApp: String => Unit,
      useAsService: (typings.firebaseAppCompat.distSrcPublicTypesMod.FirebaseApp, String) => String | Null
    ): UseAsService = {
      val __obj = js.Dynamic.literal(registerComponent = js.Any.fromFunction1(registerComponent), removeApp = js.Any.fromFunction1(removeApp), useAsService = js.Any.fromFunction2(useAsService))
      __obj.asInstanceOf[UseAsService]
    }
    
    extension [Self <: UseAsService](x: Self) {
      
      inline def setRegisterComponent(
        value: Component[Any] => typings.firebaseAppCompat.distSrcTypesMod.FirebaseServiceNamespace[typings.firebaseAppCompat.distSrcTypesMod.FirebaseService] | Null
      ): Self = StObject.set(x, "registerComponent", js.Any.fromFunction1(value))
      
      inline def setRemoveApp(value: String => Unit): Self = StObject.set(x, "removeApp", js.Any.fromFunction1(value))
      
      inline def setUseAsService(value: (typings.firebaseAppCompat.distSrcPublicTypesMod.FirebaseApp, String) => String | Null): Self = StObject.set(x, "useAsService", js.Any.fromFunction2(value))
    }
  }
}
