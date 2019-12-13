package typings.atFirebaseComponent

import typings.atFirebaseComponent.distSrcTypesMod.ComponentType
import typings.atFirebaseComponent.distSrcTypesMod.InstanceFactory
import typings.atFirebaseComponent.distSrcTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/component", JSImport.Namespace)
@js.native
object atFirebaseComponentMod extends js.Object {
  @js.native
  class Component[T /* <: Name */] protected ()
    extends typings.atFirebaseComponent.distSrcComponentMod.Component[T] {
    /**
      *
      * @param name The public service name, e.g. app, auth, firestore, database
      * @param instanceFactory Service factory responsible for creating the public interface
      * @param type whehter the service provided by the component is public or private
      */
    def this(name: T, instanceFactory: InstanceFactory[T], `type`: ComponentType) = this()
  }
  
  @js.native
  class ComponentContainer protected ()
    extends typings.atFirebaseComponent.distSrcComponentUnderscoreContainerMod.ComponentContainer {
    def this(name: String) = this()
  }
  
  @js.native
  class Provider[T /* <: Name */] protected ()
    extends typings.atFirebaseComponent.distSrcProviderMod.Provider[T] {
    def this(
      name: T,
      container: typings.atFirebaseComponent.distSrcComponentUnderscoreContainerMod.ComponentContainer
    ) = this()
  }
  
}

