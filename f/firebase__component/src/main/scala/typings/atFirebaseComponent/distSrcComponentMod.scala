package typings.atFirebaseComponent

import typings.atFirebaseComponent.distSrcComponentUnderscoreContainerMod.ComponentContainer
import typings.atFirebaseComponent.distSrcTypesMod.ComponentType
import typings.atFirebaseComponent.distSrcTypesMod.Dictionary
import typings.atFirebaseComponent.distSrcTypesMod.InstanceFactory
import typings.atFirebaseComponent.distSrcTypesMod.InstantiationMode
import typings.atFirebaseComponent.distSrcTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/component/dist/src/component", JSImport.Namespace)
@js.native
object distSrcComponentMod extends js.Object {
  @js.native
  class Component[T /* <: Name */] protected () extends js.Object {
    /**
      *
      * @param name The public service name, e.g. app, auth, firestore, database
      * @param instanceFactory Service factory responsible for creating the public interface
      * @param type whehter the service provided by the component is public or private
      */
    def this(name: T, instanceFactory: InstanceFactory[T], `type`: ComponentType) = this()
    var instantiationMode: InstantiationMode = js.native
    var multipleInstances: Boolean = js.native
    val name: T = js.native
    /**
      * Properties to be added to the service namespace
      */
    var serviceProps: Dictionary = js.native
    val `type`: ComponentType = js.native
    def instanceFactory(container: ComponentContainer): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any = js.native
    def instanceFactory(container: ComponentContainer, instanceIdentifier: String): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any = js.native
    def setInstantiationMode(mode: InstantiationMode): this.type = js.native
    def setMultipleInstances(multipleInstances: Boolean): this.type = js.native
    def setServiceProps(props: Dictionary): this.type = js.native
  }
  
}

