package typings.firebaseComponent

import typings.firebaseComponent.distSrcComponentContainerMod.ComponentContainer
import typings.firebaseComponent.distSrcTypesMod.ComponentType
import typings.firebaseComponent.distSrcTypesMod.Dictionary
import typings.firebaseComponent.distSrcTypesMod.InstanceFactory
import typings.firebaseComponent.distSrcTypesMod.InstanceFactoryOptions
import typings.firebaseComponent.distSrcTypesMod.InstantiationMode
import typings.firebaseComponent.distSrcTypesMod.Name
import typings.firebaseComponent.distSrcTypesMod.onInstanceCreatedCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcComponentMod {
  
  @JSImport("@firebase/component/dist/src/component", "Component")
  @js.native
  open class Component[T /* <: Name */] protected () extends StObject {
    /**
      *
      * @param name The public service name, e.g. app, auth, firestore, database
      * @param instanceFactory Service factory responsible for creating the public interface
      * @param type whether the service provided by the component is public or private
      */
    def this(name: T, instanceFactory: InstanceFactory[T], `type`: ComponentType) = this()
    
    def instanceFactory(container: ComponentContainer, options: InstanceFactoryOptions): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any = js.native
    
    var instantiationMode: InstantiationMode = js.native
    
    var multipleInstances: Boolean = js.native
    
    val name: T = js.native
    
    var onInstanceCreated: onInstanceCreatedCallback[T] | Null = js.native
    
    /**
      * Properties to be added to the service namespace
      */
    var serviceProps: Dictionary = js.native
    
    def setInstanceCreatedCallback(callback: onInstanceCreatedCallback[T]): this.type = js.native
    
    def setInstantiationMode(mode: InstantiationMode): this.type = js.native
    
    def setMultipleInstances(multipleInstances: Boolean): this.type = js.native
    
    def setServiceProps(props: Dictionary): this.type = js.native
    
    val `type`: ComponentType = js.native
  }
}
