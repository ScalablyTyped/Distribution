package typings.firebaseComponent

import typings.firebaseComponent.anon.Identifier
import typings.firebaseComponent.anon.Optional
import typings.firebaseComponent.srcComponentContainerMod.ComponentContainer
import typings.firebaseComponent.srcComponentMod.Component
import typings.firebaseComponent.srcTypesMod.InitializeOptions
import typings.firebaseComponent.srcTypesMod.Name
import typings.firebaseComponent.srcTypesMod.OnInitCallBack
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcProviderMod {
  
  @JSImport("@firebase/component/dist/src/provider", "Provider")
  @js.native
  open class Provider[T /* <: Name */] protected () extends StObject {
    def this(name: T, container: ComponentContainer) = this()
    
    def clearInstance(): Unit = js.native
    def clearInstance(identifier: String): Unit = js.native
    
    /* private */ var component: Any = js.native
    
    /* private */ val container: Any = js.native
    
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * @param identifier A provider can provide mulitple instances of a service
      * if this.component.multipleInstances is true.
      */
    def get(): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any
      ] = js.native
    def get(identifier: String): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any
      ] = js.native
    
    def getComponent(): Component[T] | Null = js.native
    
    def getImmediate(): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any = js.native
    /**
      *
      * @param options.identifier A provider can provide mulitple instances of a service
      * if this.component.multipleInstances is true.
      * @param options.optional If optional is false or not provided, the method throws an error when
      * the service is not immediately available.
      * If optional is true, the method returns null if the service is not immediately available.
      */
    def getImmediate(options: Identifier): (/* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any) | Null = js.native
    def getImmediate(options: Optional): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any = js.native
    
    def getOptions(): Record[String, Any] = js.native
    def getOptions(identifier: String): Record[String, Any] = js.native
    
    /* private */ var getOrInitializeService: Any = js.native
    
    def initialize(): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any = js.native
    def initialize(opts: InitializeOptions): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any = js.native
    
    /* private */ val instances: Any = js.native
    
    /* private */ val instancesDeferred: Any = js.native
    
    /* private */ val instancesOptions: Any = js.native
    
    /**
      * Invoke onInit callbacks synchronously
      * @param instance the service instance`
      */
    /* private */ var invokeOnInitCallbacks: Any = js.native
    
    def isComponentSet(): Boolean = js.native
    
    def isInitialized(): Boolean = js.native
    def isInitialized(identifier: String): Boolean = js.native
    
    /* private */ val name: Any = js.native
    
    /* private */ var normalizeInstanceIdentifier: Any = js.native
    
    /**
      *
      * @param callback - a function that will be invoked  after the provider has been initialized by calling provider.initialize().
      * The function is invoked SYNCHRONOUSLY, so it should not execute any longrunning tasks in order to not block the program.
      *
      * @param identifier An optional instance identifier
      * @returns a function to unregister the callback
      */
    def onInit(callback: OnInitCallBack[T]): js.Function0[Unit] = js.native
    def onInit(callback: OnInitCallBack[T], identifier: String): js.Function0[Unit] = js.native
    
    /* private */ var onInitCallbacks: Any = js.native
    
    def setComponent(component: Component[T]): Unit = js.native
    
    /* private */ var shouldAutoInitialize: Any = js.native
  }
}
