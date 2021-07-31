package typings.firebaseComponent

import typings.firebaseComponent.typesMod.ComponentType
import typings.firebaseComponent.typesMod.InstanceFactory
import typings.firebaseComponent.typesMod.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/component", "Component")
  @js.native
  class Component[T /* <: Name */] protected ()
    extends typings.firebaseComponent.componentMod.Component[T] {
    /**
      *
      * @param name The public service name, e.g. app, auth, firestore, database
      * @param instanceFactory Service factory responsible for creating the public interface
      * @param type whether the service provided by the component is public or private
      */
    def this(name: T, instanceFactory: InstanceFactory[T], `type`: ComponentType) = this()
  }
  
  @JSImport("@firebase/component", "ComponentContainer")
  @js.native
  class ComponentContainer protected ()
    extends typings.firebaseComponent.componentContainerMod.ComponentContainer {
    def this(name: String) = this()
  }
  
  @JSImport("@firebase/component", "Provider")
  @js.native
  class Provider[T /* <: Name */] protected ()
    extends typings.firebaseComponent.providerMod.Provider[T] {
    def this(name: T, container: typings.firebaseComponent.componentContainerMod.ComponentContainer) = this()
  }
}
