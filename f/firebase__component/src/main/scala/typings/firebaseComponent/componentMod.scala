package typings.firebaseComponent

import typings.firebaseComponent.componentContainerMod.ComponentContainer
import typings.firebaseComponent.typesMod.ComponentType
import typings.firebaseComponent.typesMod.Dictionary
import typings.firebaseComponent.typesMod.InstanceFactory
import typings.firebaseComponent.typesMod.InstanceFactoryOptions
import typings.firebaseComponent.typesMod.InstantiationMode
import typings.firebaseComponent.typesMod.Name
import typings.firebaseComponent.typesMod.onInstanceCreatedCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@firebase/component/dist/esm/src/component", "Component")
  @js.native
  open class Component[T /* <: Name */] protected () extends StObject {
    /**
      *
      * @param name The public service name, e.g. app, auth, firestore, database
      * @param instanceFactory Service factory responsible for creating the public interface
      * @param type whether the service provided by the component is public or private
      */
    def this(name: T, instanceFactory: InstanceFactory[T], `type`: ComponentType) = this()
    
    def instanceFactory(container: ComponentContainer, options: InstanceFactoryOptions): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/esm/src/types.NameServiceMapping[T] */ js.Any = js.native
    
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
